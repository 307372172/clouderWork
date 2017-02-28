package com.skeye.yagout.util;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class POIUtil {

	private static Logger logger = Logger.getLogger(POIUtil.class);
	
	@SuppressWarnings({ "resource", "deprecation", "unused", "rawtypes", "unchecked" })
	public static byte[] doPOI(String sheetName, String[] propertiesName, Class targetClass, List<?> dataList) {

		ByteArrayOutputStream out = null;
		
		SXSSFWorkbook workBook = new SXSSFWorkbook();
		CellStyle cellStyle = workBook.createCellStyle();
		Sheet sheet=null;
		
		Row row =null;
		Cell cell = null;

		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		try {
			
			
			int recordLength = propertiesName.length;
			int rowLength = dataList.size();
		 
			
			sheet= workBook.createSheet(sheetName);
			
			

			
			String[] fieldsValue=null;
            String[] returnValue=null;
            
			
			
			
			/*row=sheet.createRow(0);
			

			// 写属性名
			for (int i = 0; i < recordLength; i++) {
				cell = row.createCell(i);
				cell.setCellValue(propertiesName[i]);
				cell.setCellStyle(cellStyle);
			}*/
			creatSheet(row, sheet, workBook, cellStyle, sheetName, propertiesName);

			String fieldName=null;
			Method method = null;
			Object value =null;
			// 写值
			for (int i = 0; i < rowLength; i++) {
				Object data = dataList.get(i);
				
				if(targetClass.equals(data.getClass()))
				{
					Field[] fields = targetClass.getDeclaredFields();
					fieldsValue=new String[recordLength];
					returnValue=new String[recordLength];
						
						row = sheet.createRow(i+ 1);
					for(int j=0;j<recordLength;j++)
					{
						cell = row.createCell(j);
						fieldName=fields[j].getName();
						method = targetClass.getDeclaredMethod("get"+ObjectUtil.getBig(fieldName));
						returnValue[j] = String.valueOf(method.invoke(data));
						if (returnValue[j] != null) 
						{
							if(fieldName.equals("lastcaptime")||fieldName.equals("captime"))
							{
								returnValue[j]=DateFormatUtil.toDateStringM(Long.parseLong(returnValue[j]));	
							}
							if(fieldName.equals("dailtime"))
							{
								returnValue[j]=DateFormatUtil.toDateStringS(Long.parseLong(returnValue[j]));	
							}
							cell.setCellValue(returnValue[j]);
						}
						else
						{
							cell.setCellValue("");
						}
						cell.setCellStyle(cellStyle);
					}
				}
			
			}
			out = new ByteArrayOutputStream();
			workBook.write(out);
		} catch (Exception e) {
			logger.error("导入excel错误",e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					logger.error("导入excelout关闭错误",e);
				}
			}
		}
		return out.toByteArray();
	}
	
	
	public static void  creatSheet(Row row,Sheet sheet,SXSSFWorkbook workBook,CellStyle cellStyle,String sheetName, String[] propertiesName ){
		
		
		row=sheet.createRow(0);
		int recordLength = propertiesName.length;
		Cell cell = null;
		// 写属性名
		for (int i = 0; i < recordLength; i++) {
			cell = row.createCell(i);
			cell.setCellValue(propertiesName[i]);
			cell.setCellStyle(cellStyle);
		}
	}
	
	
}
