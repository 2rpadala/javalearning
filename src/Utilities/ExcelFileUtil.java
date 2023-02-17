package Utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil {

	Workbook WB;
	
	public ExcelFileUtil(String excelpath) throws Throwable
	{
		//Constructor for reading excel path
		FileInputStream Fi = new FileInputStream(excelpath);
		WB = WorkbookFactory.create(Fi);
	}
	//Counting No.of rows in a sheet
	public int rowCount(String sheetname)
	{
		return WB.getSheet(sheetname).getLastRowNum();
	}
	
	//Get column data and convert integer data to string
	public String getCelldata(String sheetname, int row, int column)
	{
		String data="";
		
		if(WB.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int celldata=(int) WB.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			//convert integer data type value to String
			data = String.valueOf(celldata);
		}
		else 
		{
			data= WB.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		return data;
	}
	
	public void setCelldata(String sheetname, int row, int column, String status, String writeexcel) throws Throwable
	{
		//get sheet from Workbook
		Sheet WS= WB.getSheet(sheetname);
		//get row from sheet
		Row ROW= WS.getRow(row);
		//Create column in row
		Cell CELL=ROW.createCell(column);
		//write status
		CELL.setCellValue(status);
		
		if(status.equalsIgnoreCase("pass"))
		{
			CellStyle STYLE = WB.createCellStyle();
			Font FONT = WB.createFont();
			//set green colour text
			FONT.setColor(IndexedColors.GREEN.getIndex());
			FONT.setBold(true);
			FONT.setBoldweight(Font.BOLDWEIGHT_BOLD);
			STYLE.setFont(FONT);
			ROW.getCell(column).setCellStyle(STYLE);
		}
		else if(status.equalsIgnoreCase("fail"))
		{
			CellStyle STYLE = WB.createCellStyle();
			Font FONT = WB.createFont();
			//set green colour text
			FONT.setColor(IndexedColors.RED.getIndex());
			FONT.setBold(true);
			FONT.setBoldweight(Font.BOLDWEIGHT_BOLD);
			STYLE.setFont(FONT);
			ROW.getCell(column).setCellStyle(STYLE);
		}
		else if(status.equalsIgnoreCase("blocked"))
		{
			CellStyle STYLE = WB.createCellStyle();
			Font FONT = WB.createFont();
			//set green colour text
			FONT.setColor(IndexedColors.BLUE.getIndex());
			FONT.setBold(true);
			FONT.setBoldweight(Font.BOLDWEIGHT_BOLD);
			STYLE.setFont(FONT);
			ROW.getCell(column).setCellStyle(STYLE);
		}
		FileOutputStream Fo= new FileOutputStream(writeexcel);
		WB.write(Fo);
		
	}
}
