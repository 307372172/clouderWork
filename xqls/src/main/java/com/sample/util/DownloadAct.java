package com.sample.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadAct {
	/**
	 * 
	 * @param request
	 * @param response
	 * @param list  需要存放在excel里面的数据
	 * @param columnNames  放在excel里面的列名
	 * @param keys 对应列名的bean的字段名
	 * @return
	 * @throws IOException
	 */
	public static String excelDown(HttpServletRequest request,HttpServletResponse response,List list,
    		String[] columnNames,String[] keys)throws IOException{
		 List<Map<String, Object>> listMap = null;
			try {
				listMap = DownloadAct.createExcelRecord(list);
				download(request, response, listMap,columnNames,keys);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
    private static String download(HttpServletRequest request,HttpServletResponse response,List<Map<String,Object>> list,
    		String[] columnNames,String[] keys) throws IOException{
        String fileName="课表";
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ExcelUtil.createWorkBook(list,keys,columnNames).write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return null;
    }
    /**
     * 将list里面的object转化为map
     * @param list
     * @return
     * @throws Exception
     */
    private static List<Map<String, Object>> createExcelRecord(List list) throws Exception {      
        if(list == null){      
            return null;      
        }
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>(); 
        Map<String, Object> sheetNameMap = new HashMap<String, Object>();
        sheetNameMap.put("sheetName", "sheet1");
        listMap.add(sheetNameMap);
        Field[] declaredFields =  list.get(0).getClass().getDeclaredFields();      
        for(Object obj:list){
        	HashMap<String, Object> map=new HashMap<String, Object>();
        	 for (Field field : declaredFields) {      
                 field.setAccessible(true);
                 if(field.get(obj) instanceof Date){
                	// map.put(field.getName(), DateUtil.dateToStr((Date)field.get(obj), "yyyy-MM-dd"));
                 }else{
                	 map.put(field.getName(), field.get(obj));
                 }
             } 
        	 listMap.add(map);
        }
        return listMap;    
    } 
}
