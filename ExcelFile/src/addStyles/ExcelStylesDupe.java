package addStyles;
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

public class ExcelStylesDupe {
	static Workbook wb=new HSSFWorkbook();
	 static Sheet sheet=wb.createSheet("sheet1");
	 static Row row;
	 static CellStyle style=wb.createCellStyle();
	
	public static void createRow(int a) {
		row=sheet.createRow(a);
		row.setHeight((short)800);
		
	}	public static void style() {
		style = wb.createCellStyle();  
        style.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
		
	}   public static void createCell(int b,String name, int age,String Address) {
		Cell cell = row.createCell(b);
		cell.setCellValue(name);
		style();
		cell.setCellValue(age);
		style();
		cell.setCellValue(Address);
		style();
		}
	     public static void main(String[] args) throws Exception {
		
		OutputStream file=new FileOutputStream("C:\\Users\\user\\Desktop\\dummy.xls");
		createRow(6);
		createRow(7);
		createRow(8);
		style();
		createCell(6, "vijju", 22, "hyderabad");
         wb.write(file);  
		}

}
