package demo_accenture;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;

public class ReadExcelTest {

    @Test
    public void readExcelSheetTestMethod()
    {
        File file=new File("src/test/resources/TestDataFiles/LoginTestData.xlsx");

        try {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet testdata=workbook.getSheet("TestData");

            /*
            System.out.println(testdata.getRow(0).getCell(0).getStringCellValue());
            System.out.println(testdata.getRow(0).getCell(1).getStringCellValue());
            System.out.println(testdata.getRow(1).getCell(0).getStringCellValue());
            System.out.println(testdata.getRow(1).getCell(1).getStringCellValue());
            System.out.println(testdata.getRow(2).getCell(0).getStringCellValue());
            System.out.println(testdata.getRow(2).getCell(1).getStringCellValue());
            System.out.println(testdata.getRow(3).getCell(0).getStringCellValue());
            System.out.println(testdata.getRow(3).getCell(1).getStringCellValue());
            System.out.println(testdata.getRow(4).getCell(0).getStringCellValue());
            System.out.println(testdata.getRow(4).getCell(1).getStringCellValue());
            */

            /* This is for row-wise getting test data values from Excel sheet, when we know column numbers will not increase in future */

            /*
            for (int i=1;i<=testdata.getLastRowNum();i++)
            {
                System.out.print(testdata.getRow(i).getCell(0).getStringCellValue()+"\t\t");
                System.out.print(testdata.getRow(i).getCell(1).getStringCellValue());
                System.out.println();
            }*/

            /* This is for row & column wise getting test data values from Excel sheet, when we know column numbers will increase in future */
            for (int i=1;i<=testdata.getLastRowNum();i++)
            {
                for (int j=0; j<testdata.getRow(i).getPhysicalNumberOfCells();j++)
                {
                    System.out.print(testdata.getRow(i).getCell(j).getStringCellValue()+"\t\t");
                }
                System.out.println();
            }
            testdata.getRow(0).createCell(2).setCellValue("Type");
            testdata.getRow(1).createCell(2).setCellValue("user");
            testdata.getRow(2).createCell(2).setCellValue("admin");
            testdata.getRow(3).createCell(2).setCellValue("guest");
            testdata.getRow(4).createCell(2).setCellValue("manager");
            testdata.getRow(5).createCell(2).setCellValue("developer");

            FileOutputStream outputStream=new FileOutputStream(file);
            workbook.write(outputStream);
            outputStream.close();

            }catch (FileNotFoundException e)
            {
            e.printStackTrace();
            }catch (IOException e)
            {
            e.printStackTrace();
            }
    }}
