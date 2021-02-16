package week5.day2.WorkBookorExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelCreateLead {
	// This class we are creating to get "createLead" excel data individually without any integration to other classes
	public static void main(String[] args) throws IOException {
		
		/*	Locate the workbook and open it.	
		 *	Navigate to the sheet with the reference to book // XSSFSheet sheetAt = wBook.getSheetAt(0);
		 *	With reference to the sheet, find the number of active rows available
		 *	sheet.getPhysicalNumberOfRows();// With ref of sheet, get the header row. With ref of header row,get the number // of active cols available
		 *	Iterate over the rows
		 *	Iterate over the cells
		 *	Read the data from the cell		 */

		XSSFWorkbook wBook = new XSSFWorkbook("./ExcelData/createLead.xlsx"); 
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		for(int i=1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}

	}

}
