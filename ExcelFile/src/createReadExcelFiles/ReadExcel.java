package createReadExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {
	
public static void main(String[] args)  { 
	
	
	FileInputStream fis;
	try {
		fis = new FileInputStream(new File("C:\\Users\\user\\Desktop\\one.xls"));
	
	HSSFWorkbook wb=new HSSFWorkbook(fis);   
	  
	HSSFSheet sheet=wb.getSheetAt(0);  
	  
	FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
	for(Row row: sheet)	
	{  
	for(Cell cell: row)    
	{  
	switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
	{  
	case NUMERIC:   
	System.out.print(cell.getNumericCellValue()+ "\t\t");   
	break;  
	case STRING:    
	  
	System.out.print(cell.getStringCellValue()+ "\t\t");  
	break;
	default:
		break;  
	}  
	}  
	System.out.println();  
	}
	}catch (Exception e) {
		// TODO: handle exception
	}
	} 

}


