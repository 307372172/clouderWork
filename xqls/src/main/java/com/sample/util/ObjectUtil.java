package com.sample.util;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.*;

public class ObjectUtil {
	private static Logger logger = Logger.getLogger(ObjectUtil.class);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object transfer(Object from, Class targetClass) {
		if (from == null)
			return null;
		
	
		try {
			Object target = targetClass.newInstance();// 创建实例 类似new出一个目标对象
			Field[] targetFields = targetClass.getDeclaredFields();// 目标对象类型的属性数组
			if(!(targetClass.getSuperclass().isAssignableFrom(Object.class))){
				List<Field> fieldList=Arrays.asList(targetFields);
				List<Field> tmp=new ArrayList<Field>(fieldList);
				tmp.addAll(Arrays.asList(targetClass.getSuperclass().getDeclaredFields()));
				targetFields=tmp.toArray(targetFields) ;
			}
			Method fromMethod = null;
			Method targetMethod = null;
			Object data;// 属性值
			String methodFiled = null;
			for (Field targetField : targetFields) {
			
					fromMethod = null;
					methodFiled = getBig(targetField.getName());
					
					try {
					fromMethod = from.getClass().getDeclaredMethod("get" // 根据
																			// 目标属性获取来源对象get属性的方法
							+ methodFiled);
					} catch (Exception e) {
						
						try {
						fromMethod = from.getClass().getSuperclass().getDeclaredMethod("get" // 根据
								// 目标属性获取来源对象get属性的方法
									+ methodFiled);
						} catch (Exception ex) {
							//logger.info("转换类型获取方法异常" + targetField.getName(),ex);

							Class<?>[] interfaces= from.getClass().getInterfaces();

							for(Class<?> interfaceClass: interfaces){
								try {
								fromMethod =interfaceClass.getDeclaredMethod("get" // 根据
										// 目标属性获取来源对象get属性的方法
										+ methodFiled);
									if(fromMethod!=null) break;
								} catch (Exception em) {

								}
							}

						}
					}
			
				if (fromMethod == null)
					continue;
				data = fromMethod.invoke(from);// 调用来源对象的get方法获取值
				try {
					targetMethod = null;
					targetMethod = targetClass.getDeclaredMethod("set" + methodFiled, data.getClass());

				} catch (Exception e) {
					try {
						targetMethod = null;
						targetMethod = targetClass.getSuperclass().getDeclaredMethod("set" + methodFiled, data.getClass());

					} catch (Exception exc) {
						//logger.info("转换类型存放方法异常" + targetField.getName(), exc);
					}				}
				if (targetMethod != null)
					targetMethod.invoke(target, data);// 目标对象调用set方法
			}

			return target;
		} catch (Exception e) {
			logger.error("转换类型异常", e);
			return null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object transfer(Map<String, Object> from, Class targetClass) {
		if (from == null || from.size() == 0)
			return null;
		try {
			Object target = targetClass.newInstance();
			Method targetMethod = null;
			for (Map.Entry<String, Object> entry : from.entrySet()) {
				try {
					targetMethod = null;
					if(entry.getValue() instanceof Timestamp){
						targetMethod = targetClass.getDeclaredMethod("set" + getBig(entry.getKey()),
								Date.class);
					}else {
						targetMethod = targetClass.getDeclaredMethod("set" + getBig(entry.getKey()),
								entry.getValue().getClass());
					}

				} catch (Exception e) {
					//logger.info("转换类型存放方法异常" + entry.getKey(), e);
				}
				if (targetMethod != null){
					if(entry.getValue() instanceof Timestamp){
						targetMethod.invoke(target, new Date(((Timestamp) entry.getValue()).getTime()));
					}else {
						targetMethod.invoke(target, entry.getValue());
					}

				}

			}
			return target;
		} catch (Exception e) {
			logger.error("转换类型异常", e);
			return null;
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List transferListMap(List<Map<String,Object>> from, Class targetClass) {
		if (from == null || from.size() == 0)
			return null;
		List target = new ArrayList();
		for (Map o : from) {
			target.add(transfer(o, targetClass));
		}
		return target;

	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List transferList(List from, Class targetClass) {
		if (from == null || from.size() == 0)
			return null;
		List target = new ArrayList();
		for (Object o : from) {
			target.add(transfer(o, targetClass));
		}
		return target;

	}

	public static String getBig(String filedName) {
		return filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
	}



	public static byte[] intToByteArray(int byteLength, int intValue) {
		return ByteBuffer.allocate(byteLength).putInt(intValue).array();
	}
	public static byte[] combineByteArray(byte[] array1, byte[] array2) {
		byte[] combined = new byte[array1.length + array2.length];
		System.arraycopy(array1, 0, combined, 0, array1.length);
		System.arraycopy(array2, 0, combined, array1.length, array2.length);
		return combined;
	}
}
