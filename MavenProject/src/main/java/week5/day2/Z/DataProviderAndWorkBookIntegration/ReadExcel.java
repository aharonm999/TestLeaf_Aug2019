package week5.day2.Z.DataProviderAndWorkBookIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelData(String fileName) throws IOException {

		// Need to create an Object for WorkBook first
		XSSFWorkbook wBook = new XSSFWorkbook("./ExcelData/"+fileName+".xlsx"); // Need to pass the File Path and add IOException to obey exception
		// Need to Get the Sheet from Excel
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		// Need to find Rows count from Sheet
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		// Create an Object 
		String[][] data = new String[rowCount][colCount];
		
		for(int i=1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
		// Store the data in 2D array
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}
		}
		wBook.close();
		// Return data method
		return data;
	}

}

