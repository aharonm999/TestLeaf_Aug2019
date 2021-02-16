package week5.day2.WorkBookorExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	/*	Locate the workbook and open it.	*/
		// Need to create an Object for WorkBook first
		XSSFWorkbook wBook = new XSSFWorkbook("./ExcelData/createLead.xlsx"); // Need to pass the File Path and add IOException to obey exception
	/*	Navigate to the sheet with the reference to book // XSSFSheet sheetAt = wBook.getSheetAt(0);	*/
		// Need to Get the Sheet from Excel
		XSSFSheet sheet = wBook.getSheet("Sheet1");
	/*	With reference to the sheet, find the number of active rows available	*/
		// Need to find Rows count from Sheet
		int rowCount = sheet.getLastRowNum();
	/*	// sheet.getPhysicalNumberOfRows();// With ref of sheet, get the header row. With ref of header row,get the number // of active cols available	*/
		int colCount = sheet.getRow(0).getLastCellNum();
	/*	// Iterate over the rows	*/
		for(int i=1; i<=rowCount; i++) {	
			XSSFRow row = sheet.getRow(i);
	/*	// Iterate over the cells	*/
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
	/*	// Read the data from the cell	*/
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}

	}
}