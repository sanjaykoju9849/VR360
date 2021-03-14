package parser;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileParser {

    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    public XSSFSheet excelDataSheet = null;
    public XSSFRow excelRow = null;
    public XSSFCell excelCell = null;

    String exlFilePath;

    public ExcelFileParser(String xlFilePath) throws Exception {
        this.exlFilePath = xlFilePath;
        fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }


    /**    public void setExcelFilePath(String excel_file_path) throws IOException {
     this.exlFilePath = excel_file_path;
     try {
     fis = new FileInputStream(excel_file_path);
     } catch (FileNotFoundException e) {
     System.out.println("Error: Wrong file/file location supplied.\nPlease Check the file path.");
     e.printStackTrace();
     }
     workbook = new XSSFWorkbook(fis);
     fis.close();
     }
     **/
    public int getRowCount(String sheetName) {
        sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum() + 1;
        return rowCount;
    }

    public int getColumnCount(String sheetName) {
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(0);
        int colCount = row.getLastCellNum();
        return colCount;
    }

    public Object getCellData(String sheetName, int columnIndex, int rowIndex) {

        XSSFSheet excelDataSheet = workbook.getSheet(sheetName);
        XSSFRow excelRow = excelDataSheet.getRow(rowIndex);
        excelCell = excelRow.getCell(columnIndex);
        Object cellValue = (new DataFormatter().formatCellValue(excelCell));

        return cellValue;

    }

}

