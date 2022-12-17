package addStyles;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;import org.apache.poi.ss.usermodel.Cell;import org.apache.poi.ss.usermodel.CellStyle;import org.apache.poi.ss.usermodel.FillPatternType;import org.apache.poi.ss.usermodel.HorizontalAlignment;import org.apache.poi.ss.usermodel.IndexedColors;import org.apache.poi.ss.usermodel.Row;import org.apache.poi.ss.usermodel.Sheet;import org.apache.poi.ss.usermodel.VerticalAlignment;import org.apache.poi.ss.usermodel.Workbook;
public class Duplicate {
	static Workbook wb=new HSSFWorkbook();
	 static Sheet sheet=wb.createSheet("sheet1");
	 static Row row;
	 static Cell cell;
		static CellStyle style=wb.createCellStyle();
	public static void createRow(int a) {
		row=sheet.createRow(a);
		row.setHeight((short)800);
		}	
	public static void createCell(int b) {
		 cell = row.createCell(b);
	}
	public static void setCellValue(String name) {
		CellStyle style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
	       style.setAlignment(HorizontalAlignment.CENTER);
	       style.setVerticalAlignment(VerticalAlignment.CENTER);
	       style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellValue(name);
		cell.setCellStyle(style);
	}
    public static void main(String[] args) throws Exception {
		
		OutputStream file=new FileOutputStream("C:\\Users\\user\\Desktop\\dummy.xls");
		String[][] data = {{"Name", "Age", "City"},{"vijju", "22", "hyderabad"},{"sai","21", "bangolore"},{"gireesh", "24","delhi"}};
		
		/*ArrayList<ArrayList<String>> data=new ArrayList<ArrayList<String>>();
		data.add(new ArrayList<String>(Arrays.asList("Name","age","city")));*/
		for(int i=6;i<10;i++) {
			createRow(i);
			for(int j=10;j<13;j++) {
				createCell(j);
				setCellValue(data[i-6][j-10]);
			}
		}
		wb.write(file); 
    }
}
