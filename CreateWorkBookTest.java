package demo_accenture;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateWorkBookTest {

    @Test
    public void createWorkBookTestMethod()
    {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet1=workbook.createSheet("TestData");

        try {
            FileOutputStream out = new FileOutputStream(new File("src/test/resources/TestDataFiles/NewExcelFile.xlsx"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
