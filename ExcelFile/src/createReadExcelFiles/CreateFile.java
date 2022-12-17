package createReadExcelFiles;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateFile {

	public static void main(String[] args) {
	
        try {
            String filename = "C:\\Users\\user\\Desktop\\one.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");  

            HSSFRow rowhead = sheet.createRow((short)0);
            rowhead.createCell(0).setCellValue("R.No");
            rowhead.createCell(1).setCellValue("Name");
            rowhead.createCell(2).setCellValue("age");
            rowhead.createCell(3).setCellValue("Email");
            rowhead.createCell(4).setCellValue("phone no");
            rowhead.createCell(5).setCellValue("adress");
            
            

            HSSFRow row = sheet.createRow((short)1);
            row.createCell(0).setCellValue("1");
            row.createCell(1).setCellValue("vijendar");
            row.createCell(2).setCellValue("23");
            row.createCell(3).setCellValue("vijendar95422@gmail.com");
            row.createCell(4).setCellValue("9542264596");
            row.createCell(5).setCellValue("hyderabad");
          
            
            HSSFRow row2=sheet.createRow((short)2);
            
            row2.createCell(0).setCellValue("2");
            row2.createCell(1).setCellValue("sai");
            row2.createCell(2).setCellValue("22");
            row2.createCell(3).setCellValue("vsai49@gmail.com");
            row2.createCell(4).setCellValue("65794685465");
            row2.createCell(5).setCellValue("bangolore");
            
 HSSFRow row3=sheet.createRow((short)3);
            
            row3.createCell(0).setCellValue("3");
            row3.createCell(1).setCellValue("Ramesh");
            row3.createCell(2).setCellValue("22");
            row3.createCell(3).setCellValue("ramesh9@gmail.com");
            row3.createCell(4).setCellValue("65794685465");
            row3.createCell(5).setCellValue("delhi");
            
 HSSFRow row4=sheet.createRow((short)4);
            
            row4.createCell(0).setCellValue("4");
            row4.createCell(1).setCellValue("sridhar");
            row4.createCell(2).setCellValue("25");
            row4.createCell(3).setCellValue("sid49@gmail.com");
            row4.createCell(4).setCellValue("65794685465");
            row4.createCell(5).setCellValue("bangolore");
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Your excel file has been generated!");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }


	}

}
