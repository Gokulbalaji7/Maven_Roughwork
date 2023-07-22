package data_driven_R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_row_input_R {

	public static void main(String[] args) throws Throwable {

		
		File f = new File("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Excel folder\\Book4.xlsx");
		
		FileInputStream fis = new FileInputStream(f); 
			
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sa = wb.getSheetAt(0);
// row		
		int pnr = sa.getPhysicalNumberOfRows();
		System.out.println(pnr);
		
		for (int i = 0; i < pnr; i++) { // forloop open here
			
			Row r = sa.getRow(i);

			Cell c = r.getCell(0);
			
			
			
			
			
// refer demo class
			
			CellType ct = c.getCellType();
//			System.out.println(ct);
			

			
		// we only type condition, ref name .dot equal aa irundhuchuna andha celltype string

		// if condition la string nu celltype equal aa irundha get panniko nu soldrom
			if (ct.equals(CellType.STRING)) { 
				
				System.out.println(c.getStringCellValue());
				
		// if condition la numeric nu celltype equal aa irundha get panniko nu soldrom		
			} else if (ct.equals(CellType.NUMERIC)) { // add  one more if apodhan condition koduka mudium
				
				
				System.out.println(c.getNumericCellValue());
		// syso kodukrom ipo console la value double la varudhu so andha value va int ku change pandrom
				
				double numericcv = c.getNumericCellValue();
				int in = (int) numericcv; // we only type this fully
				
				System.out.println(in);
		// ipo console la int la varum
				
			} 
			
			
			
		} // forloop is end here
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
