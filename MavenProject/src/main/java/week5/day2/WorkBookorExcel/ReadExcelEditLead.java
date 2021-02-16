package week5.day2.WorkBookorExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelEditLead {

	// This class we are creating to get "editLead" excel data individually without any integration to other classes 
	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook wBook = new XSSFWorkbook("./ExcelData/editLead.xlsx"); 
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
