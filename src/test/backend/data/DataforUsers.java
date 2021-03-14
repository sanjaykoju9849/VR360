package test.backend.data;

import org.testng.annotations.DataProvider;
import parser.ExcelFileParser;

public class DataforUsers {

    @DataProvider(name = "UserManagement_UsersData")
    public static Object[][] BuyData() throws Exception {
        String xlFilePath = "./Excel/ExcelData.xlsx";
        String sheetName = "Sheet1";
        Object[][] mydata=testData(xlFilePath,sheetName);
        return mydata;
    }

    public static Object[][] testData(String xlFilePath, String sheetName) throws Exception {

        ExcelFileParser excelParserObj = new ExcelFileParser(xlFilePath);
        Object[][] excelData = null;

        /**
         * get Row count and Column count
         * And parse the excel file row by row, and column by column
         *
         */
        //excelParserObj.setExcelFilePath(xlFilePath);
        int rows = excelParserObj.getRowCount(sheetName);
        System.out.println("The total rows in the given sheet: "+rows);
        int columns = excelParserObj.getColumnCount(sheetName);
        System.out.println("The total columns in the given sheet: "+columns);
        excelData = new Object[rows-1][columns];

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                excelData[i - 1][j] = excelParserObj.getCellData(sheetName, j, i);
            }
        }
        return excelData;
    }
}
