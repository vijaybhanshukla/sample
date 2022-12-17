package addStyles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTabel {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSSFWorkbook wb=new HSSFWorkbook();
		
		HSSFSheet sheet=wb.createSheet("sheet1");
		
		HSSFRow row=sheet.createRow(2);
		
		HSSFCell cell=row.createCell(5);
		
		cell.setCellValue("vijendar");
		HSSFCellStyle style=wb.createCellStyle();
		//style.setAlignment(HorizontalAlignment.RIGHT);
		style.setFillBackgroundColor(HSSFColorPredefined.BRIGHT_GREEN.getIndex());
		
		cell.setCellStyle(style);
		
		
		try {
			FileOutputStream file=new FileOutputStream("C:\\Users\\user\\Desktop\\style.xls");
			
			 try {
				wb.write(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}*/
	  public static void main(String[] args) throws FileNotFoundException, IOException {  
	        try (OutputStream fileOut = new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\style.xls")) {  
	            Workbook wb = new HSSFWorkbook();  
	            org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet");  
	            Row row = sheet.createRow(1);  
	            CellStyle style = wb.createCellStyle();  
	            
	            
	            
	            
	            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());  
	            style.setFillPattern(FillPatternType.BIG_SPOTS);  
	            Cell cell = row.createCell(1);  
	            cell.setCellValue("vijju");  
	            cell.setCellStyle(style);  
	            
	            
	          
	            style = wb.createCellStyle();  
	            style.setFillForegroundColor(IndexedColors.BLUE.getIndex());  
	            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
	            cell = row.createCell(2);  
	            cell.setCellValue("vijendar");  
	            cell.setCellStyle(style);  
	            wb.write(fileOut);  
	            }catch(Exception e) {  
	                System.out.println(e.getMessage());  
	            }  

}
}
