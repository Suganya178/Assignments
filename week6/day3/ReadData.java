package week6.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//Setup path for Excel
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		//Get into the sheet based on index or name
		XSSFSheet ws = wb.getSheetAt(0);
		//Get into the row
		XSSFRow row = ws.getRow(1);
		//Get into the column using row
		XSSFCell cell = row.getCell(1);
		//Read the data from the cell
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		//close the workbook
		wb.close();
	}

}
