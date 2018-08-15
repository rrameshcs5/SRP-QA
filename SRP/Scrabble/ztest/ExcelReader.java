package ztest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/ramesh.raja/Desktop/Print.xlsx");
		FileInputStream fis = new FileInputStream(file);
		// To read the char 
		// To read the stream of bytes - 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data_Excel");
		int countOfRows = sheet.getLastRowNum()+1; // starts with 0
		int countOfCols = sheet.getRow(0).getLastCellNum(); //starts with 1
		System.out.println("Rows : " + countOfRows);
		System.out.println("Cols : " + countOfCols);
//		String val = sheet.getRow(3).getCell(2).toString();
//		System.out.println(val);
		for(int i=1;i<countOfRows;i++)
		{
			for(int j=0;j<countOfCols;j++)
			{
				XSSFCell cell = sheet.getRow(i).getCell(j);
				DataFormatter df = new DataFormatter();
				String value = df.formatCellValue(cell);
				System.out.println(value);
			}
		}
		
		
	}
}
