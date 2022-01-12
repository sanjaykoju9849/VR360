package test.backend.tests;

import org.testng.annotations.Test;
import test.backend.elements.LoginPage;
import test.backend.elements.TranslationSubMenuPage;

import java.io.IOException;
public class LoginTest extends Setup {

//    LoginTest(){
//        super(Constant.frontendType);
//    }


    @Test()
    public void testThatLoginPageWorks() throws InterruptedException, IOException {
        LoginPage loginPageObj = new LoginPage(myWebDriver);
        TranslationSubMenuPage  TranslationPageObj=new TranslationSubMenuPage(myWebDriver);


       // loginToTheModule();

        myWebDriver.get("https://dev-bspace.ekbana.net/login");
        loginPageObj.setEmailInput("");
        loginPageObj.setPasswordInput("");
        loginPageObj.clickLoginBtn();


//        TranslationPageObj.clickLanguageButton();
//        TranslationPageObj.clickJapanLanguageButton();
//        TranslationPageObj.assertionTest("string",TranslationPageObj.getButtonText());




      //  loginPageObj.openNewTab();



//        Thread.sleep(2000);
//        loginPageObj.clickLogOutDropdown();
//        Thread.sleep(2000);
//        loginPageObj.clickLogOutOptionSelect();
//        Thread.sleep(4000);

    }

}
