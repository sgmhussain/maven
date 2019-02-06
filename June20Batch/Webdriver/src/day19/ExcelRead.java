package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\newFile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			int colCount=r.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				Cell c=r.getCell(j);
				if(c.getCellType()==c.CELL_TYPE_STRING)
					System.out.print(c.getStringCellValue()+"   ");
				else if(c.getCellType()==c.CELL_TYPE_NUMERIC)
					System.out.print(c.getNumericCellValue()+"   ");
			}
			System.out.println();
		}
	}

}
