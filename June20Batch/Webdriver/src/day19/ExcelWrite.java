package day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\newFile.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		//modify existing cell
		Row r=ws.getRow(0);
		r.getCell(2).setCellValue("abc");
		
		
		//create a cell in an existing row and write into it
		r=ws.getRow(2);
		r.createCell(2).setCellValue("xyz");
		
		//create a new row and a new cell and write into it
		r=ws.createRow(4);
		r.createCell(0).setCellValue("AAAA");
		
		
		//save the excel file
		FileOutputStream f=new FileOutputStream("C:\\Users\\Sai\\Desktop\\newFile.xlsx");
		wb.write(f);
		
	}

}
