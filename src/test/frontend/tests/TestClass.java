package test.frontend.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test.backend.tests.Setup;

/**
 * @author Ekuser-QA
 */
public class TestClass extends Setup
{
    public TestClass()
    {
       // super(utils.Constant.frontendType);
    }

    @Test
    public void testClass() throws InterruptedException {
        //Backend login

        myWebDriver.get("https://devadmin-bspace.ekbana.net/system/login");
        myWebDriver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
        myWebDriver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123admin@");
        myWebDriver.findElement(By.xpath("//button[@class=\"btn login-btn btn-block\"]")).click();

        //Frontend login in same tab.

        myWebDriver.get("https://dev-bspace.ekbana.net/login");
        myWebDriver.findElement(By.id("email")).sendKeys("rajnishofficeuse@gmail.com");
        myWebDriver.findElement(By.id("password")).sendKeys("password");
        myWebDriver.findElement(By.xpath("//button[@class='btn btn-orange w-100']")).click();

        myWebDriver.get("https://devadmin-bspace.ekbana.net");
        Thread.sleep(2000);
        myWebDriver.get("https://dev-bspace.ekbana.net/member/home");
        Thread.sleep(2000);
        myWebDriver.get("https://devadmin-bspace.ekbana.net");
        myWebDriver.get("https://dev-bspace.ekbana.net/member/home");






    }


}
