package week6.day3;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleDataExcel {
	public static void main(String[] args) throws IOException {
		//set up the path for excel
				XSSFWorkbook wb =new XSSFWorkbook("./data/CreateLead.xlsx");
				//Get into the sheet based index or String
				XSSFSheet ws = wb.getSheetAt(0);
				//Get into the row
				//XSSFRow row = ws.getRow(1);
				int rowCount = ws.getLastRowNum();
				
				short columnCount = ws.getRow(0).getLastCellNum();
				
				for (int i = 1; i <= rowCount; i++) {
					XSSFRow row = ws.getRow(i);
					
					for (int j = 0; j < columnCount; j++) {
						//Get into the column using row 
				          XSSFCell cell = row.getCell(j);
					
				//Read the data from cell
				String cellValue = cell.getStringCellValue();
				//print the cell value in console
				System.out.println(cellValue);
				//close the wb 
				wb.close();		
					}
				}
	}
}