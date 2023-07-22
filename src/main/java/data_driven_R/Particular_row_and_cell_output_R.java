package data_driven_R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_row_and_cell_output_R {

	public static void main(String[] args) throws Throwable {

		
		
		
		
File f = new File("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Excel folder\\Book4.xlsx");
		
		FileInputStream fis = new FileInputStream(f); 
			
		Workbook wb = new XSSFWorkbook(fis);
		
		
		
		
		wb.createSheet("Dataoutput").createRow(0).createCell(0).setCellValue("Name");
		
		wb.getSheet("Dataoutput").getRow(0).createCell(1).setCellValue("Gokul");
		
		wb.getSheet("Dataoutput").createRow(1).createCell(0).setCellValue("ph num");
		
		wb.getSheet("Dataoutput").getRow(1).createCell(1).setCellValue("9780000");
		
		
		FileOutputStream fos = new FileOutputStream(f); // we only type and take returntype
		wb.write(fos); // we only type
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
