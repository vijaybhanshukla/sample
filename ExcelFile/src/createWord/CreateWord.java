package createWord;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CreateWord {
	
public static void main(String[] args) {
		
		XWPFDocument document=new XWPFDocument();
		try (FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\user\\Desktop\\word.docx"))) 
		{
			XWPFTable table = document.createTable();
			XWPFTableRow row = table.getRow(0);
			
			row.getCell(0).setText("id");  
            row.addNewTableCell().setText("Name");  
            row.addNewTableCell().setText("Branch");
            row.addNewTableCell().setText("Email");
            
            row = table.createRow(); // Second Row  
            row.getCell(0).setText("101");  
            row.getCell(1).setText("Mahesh");
            row.getCell(2).setText("Civil"); 
            row.getCell(3).setText("mahesh@gmail.com");  
            
            row = table.createRow(); // Third Row  
            row.getCell(0).setText("102");  
            row.getCell(1).setText("Ram");
            row.getCell(2).setText("ComputerScience");
            row.getCell(3).setText("ram@gmail.com");
            
            row = table.createRow(); // Third Row  
            row.getCell(0).setText("103");  
            row.getCell(1).setText("Raj");
            row.getCell(2).setText("InstrumentationTechnology");
            row.getCell(3).setText("raj@gmail.com");
            
            row = table.createRow(); // Third Row  
            row.getCell(0).setText("104");  
            row.getCell(1).setText("Ram");
            row.getCell(2).setText("Electronics");
            row.getCell(3).setText("ram@gmail.com");
            
            row = table.createRow(); // Third Row  
            row.getCell(0).setText("105");  
            row.getCell(1).setText("Ramesh");
            row.getCell(2).setText("Electrical");
            row.getCell(3).setText("ramesh@gmail.com");
            
            row = table.createRow(); // Third Row  
            row.getCell(0).setText("106.");  
            row.getCell(1).setText("Rakesh");
            row.getCell(2).setText("Mechanical");
            row.getCell(3).setText("rakesh@gmail.com");
            
            document.write(fos);  
            System.out.println(document);
				
		}catch(Exception e) 
		{
			System.out.println(e);
		}

}
}
