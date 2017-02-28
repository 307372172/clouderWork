package com.sample.util;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {  
  
    public String print(Date object, Locale locale) {  
        return null;  
    }  
  
    public Date parse(String text, Locale locale) throws ParseException  {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置一个时间格式
        Date date = null;//定义一个时间对象
        try {
            date = format.parse(text);//将接收到的字符串通过SimpleDateFormat.parse转换成的对应格式的时间对象
        } catch (Exception e) {  
            format = new SimpleDateFormat("yyyy-MM-dd");
            date = format.parse(text);
        }  
        return date;//将转化之后的时间对象返回到springMVC拦截的请求中传给controller，执行后续操作
    }  
  
    public static String format(Date date)
    {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	return format.format(date);
    }
}  