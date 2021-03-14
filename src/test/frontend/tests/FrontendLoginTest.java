package test.frontend.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.FrontendLoginPage;

public class FrontendLoginTest extends Setup {


    @Test
    public void FrontendLoginTest() throws InterruptedException {
        String errorMessage = null;
        String url = "";
        FrontendLoginPage frontendLoginPageObj = new FrontendLoginPage(myWebDriver);


        invalidLoginAttempt();
        errorMessage = myWebDriver.findElement(By.xpath("/html/body/app-root/div/div/div/div[2]/app-login/div/div/div/div/form/div[1]")).getText();
        System.out.println("This is error message: " + errorMessage);
        //Thread.sleep(5000);

        frontendLoginPageObj.setEmailInput(loginEmail);
        frontendLoginPageObj.setPasswordInput(loginPassword);
        myLoggerSetup.info("Email and Password entered");
        frontendLoginPageObj.clickLoginBtn();
        url = myWebDriver.getCurrentUrl();
        if (url == "https://dev-bspace.ekbana.net/member/home"){
            System.out.println("Test Failed!");
        }else {
            System.out.println("Test passed");
        }








    }


}















