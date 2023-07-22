package data_driven_R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_Gggg {

	public static void main(String[] args) throws Throwable {

		
File f = new File("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Excel folder\\Book4.xlsx");
		
		FileInputStream fis = new FileInputStream(f); 
			
		Workbook wb = new XSSFWorkbook(fis);
		
		
		
		wb.createSheet("Datata").createRow(0).createCell(0).setCellValue("Name");
		
		wb.getSheet("Datata").getRow(0).createCell(1).setCellValue("Gggg");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
	}

}
