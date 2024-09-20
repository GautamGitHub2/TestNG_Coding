package utility_files;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtil {
    static public Object[][] readDataFromExcel(String sheetName) {
        File file = new File("src/test/resources/TestDataFiles/LoginTestData.xlsx");
        Object[][] obj = null;

        try {
            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet testdata = workbook.getSheet(sheetName);

            obj = new Object[testdata.getLastRowNum()][];

            /* This for loop for Row Only */

            for (int i = 1; i <= testdata.getLastRowNum(); i++) {
                obj[i - 1] = new Object[testdata.getRow(i).getPhysicalNumberOfCells()];

                /* This for loop for Row & Column both  */

                for (int j = 0; j < testdata.getRow(i).getPhysicalNumberOfCells(); j++) {
                    System.out.print(testdata.getRow(i).getCell(j).getStringCellValue()+"\t\t");
                    obj[i - 1][j] = testdata.getRow(i).getCell(j).getStringCellValue();

                }System.out.println();

            }
            workbook.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

}

/*

Extent API:

* It helps to create beautiful, interactive and detailed reports for your tests
* Different views -> dashboard view , graphical view, take screenshots as of reports, shareable reports which can be sent to users via email right after the test execution
* Extent API is written in Java and .NET for unit testing frameworks like JUnit, TestNG, NUnit and many more
Extent Reports library comes in the form of extentreports.jar file for Java

$ Extent Reports Library
-> ExtentSparkReporter
-> ExtentReports
-> ExtentTest




























*/