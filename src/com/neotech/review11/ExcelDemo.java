package com.neotech.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		// Google Search: apache poi read excel file example

		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";

		FileInputStream fis = new FileInputStream(fullPath);

		// Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);

		// Get one sheet from the excel file
		Sheet sheet = book.getSheet("Sheet1");

		// Get the Row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);

		// Get the Cell (with index 1) from the row
		Cell cell1 = row2.getCell(1);

		// Print the information of the Cell
		System.out.println(cell1.toString());

		// Let's get the first Row of the sheet and print it
		Row headerRow = sheet.getRow(0);

		// The number of cells that have information (in that Row)
		int cellNumber = headerRow.getLastCellNum();

		System.out.println("----------------------------------------------------------------");

		for (int i = 0; i < cellNumber; i++) {
			String cellData = headerRow.getCell(i).toString();
			System.out.print(cellData + "\t");
		}
		System.out.println();

		System.out.println("----------------------------------------------------------------");

		// How many Rows are in the sheet
		int rows = sheet.getPhysicalNumberOfRows();

		// I am skipping the row with index 0, because I alred printed it
		for (int row = 1; row < rows; row++) {

			// For each Row, iterate (from Cell 0) to (the last Cell)
			for (int cell = 0; cell < cellNumber; cell++) {
				String cellInfo = sheet.getRow(row).getCell(cell).toString();
				System.out.print(cellInfo + "\t\t");
			}
			System.out.println();

		}

	}

}
