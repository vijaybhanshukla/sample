package addStyles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelStyles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStream file=new FileOutputStream("C:\\Users\\user\\Desktop\\styl.xls");
		
		Workbook wb=new HSSFWorkbook();
		
		Sheet sheet=wb.createSheet("sheet1");
		
		Row row=sheet.createRow(6);
		row.setHeight((short)800);
		
		Row row1=sheet.createRow(7);
		row1.setHeight((short)800);
		
		Row row2=sheet.createRow(8);
		row2.setHeight((short)800);
		
		CellStyle style=wb.createCellStyle();
		CellStyle style1=wb.createCellStyle();
		CellStyle style2=wb.createCellStyle();
		
		  Cell cell = row.createCell(1);
		
		style = wb.createCellStyle();  
        style.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
        
         cell = row.createCell(10);  
        
        cell.setCellValue("Name");
        cell.setCellStyle(style); 
        
        cell = row.createCell(11);  
        cell.setCellValue("Age");
        cell.setCellStyle(style); 
        
        cell = row.createCell(12);  
        cell.setCellValue("Address");
        cell.setCellStyle(style); 
        
        /*style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());  
        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style1.setAlignment(HorizontalAlignment.CENTER);
        style1.setVerticalAlignment(VerticalAlignment.CENTER);*/
        
       cell = row1.createCell(10);  
        cell.setCellValue("Vijendar");
        cell.setCellStyle(style1); 
        
        cell = row1.createCell(11);  
        cell.setCellValue("22");
        cell.setCellStyle(style1); 
        
        cell = row1.createCell(12);  
        cell.setCellValue("hyderabad");
        cell.setCellStyle(style1); 
        
       /* style2.setFillForegroundColor(IndexedColors.GREEN.getIndex());  
        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style2.setAlignment(HorizontalAlignment.CENTER);
        style2.setVerticalAlignment(VerticalAlignment.CENTER);*/
        
       cell = row2.createCell(10);  
        cell.setCellValue("Ram");
        cell.setCellStyle(style2); 
        
        cell = row2.createCell(11);  
        cell.setCellValue("30");
        cell.setCellStyle(style2); 
        
        cell = row2.createCell(12);  
        cell.setCellValue("Bangolore");
        cell.setCellStyle(style2); 
       wb.write(file);  
		}

}
