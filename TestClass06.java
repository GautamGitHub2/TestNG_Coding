package demo_accenture;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass06 {

    SoftAssert sa=new SoftAssert();

    @Test
    public void method01()
    {
        System.out.println("Checking condition 01");
        sa.assertEquals(10,20);

        System.out.println("Checking condition 02");
        sa.assertTrue(56<234);

        sa.assertAll();
    }

    /*
    @Test
    public void method02() {
        System.out.println("Checking condition 03");
        sa.assertEquals("Gautam","Gautam2");
    }

     */

    /*
    Soft Assertion: SoftAssert continues the test execution, even few assertions have failed

    $ SoftAssert inherits all the methods present in the Assert Class
    $ it has assertAll() method, which collates all the failures and decides the test status: pass/fail


    */
}
