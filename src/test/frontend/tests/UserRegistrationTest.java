package test.frontend.tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.HomePage;
import test.frontend.forms.RegistrationPage;
import java.io.File;
import java.io.IOException;

public class UserRegistrationTest extends Setup {


    @Test
    public void userRegistrationTest(){
        try{
            RegistrationPage registrationPageObj = new RegistrationPage(myWebDriver);
            HomePage homePageObj = new HomePage(myWebDriver);

            myWebDriver.get("https://dev-bspace.ekbana.net");
            homePageObj.clickOnRegisterBtn();
            registrationPageObj.setFirstName().sendKeys("");

        }catch (Exception e){
            myLoggerSetup.info("Error occurred during while registering user, please verify.\n" + e.getMessage() + "\n");
            e.printStackTrace();
            File scrFile = ((TakesScreenshot)myWebDriver).getScreenshotAs(OutputType.FILE);

        }


    }


}
