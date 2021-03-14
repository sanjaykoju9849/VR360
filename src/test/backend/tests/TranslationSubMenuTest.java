package test.backend.tests;


import utils.Constant;
import org.testng.annotations.Test;
import test.backend.elements.TranslationSubMenuPage;


public class TranslationSubMenuTest extends  Setup{

    public TranslationSubMenuTest() {
        super(Constant.backendType);
    }

    @Test
    public void translationSubMenuTest() throws InterruptedException {

        String strWord="Application example list";
        String translationOfStr="活用事例一覧";

        TranslationSubMenuPage translationSubMenuPageObj=new TranslationSubMenuPage(myWebDriver);

       loginToTheModule();

        myWebDriver.get("https://devadmin-bspace.ekbana.net");

        translationSubMenuPageObj.clickLanguageModule();
        Thread.sleep(2000);
        translationSubMenuPageObj.clickWordSubModule();

        Thread.sleep(2000);
        translationSubMenuPageObj.clickAddNewWordButton();
        Thread.sleep(2000);
        translationSubMenuPageObj.setNewWord(strWord);
        Thread.sleep(2000);
        translationSubMenuPageObj.clickSaveNewWordButton();

        Thread.sleep(2000);
        translationSubMenuPageObj.clickTranslationSubModule();
        Thread.sleep(2000);
        translationSubMenuPageObj.clickToChooseDropDown();
        Thread.sleep(2000);
        translationSubMenuPageObj.setSearchWord(strWord);
        Thread.sleep(2000);
        translationSubMenuPageObj.clickSearchWordButton();
        Thread.sleep(2000);

        //call for assert function
        translationSubMenuPageObj.assertionTest(strWord,strWord);
        //if assert function is true then only translation of word is added.
            translationSubMenuPageObj.setTranslationOfWord(strWord, translationOfStr);
            Thread.sleep(2000);
            translationSubMenuPageObj.clickSaveTranslationOfWord();
            Thread.sleep(3000);



        translationSubMenuPageObj.loginInoFrontend();
        translationSubMenuPageObj.clickHomeIcon();
        translationSubMenuPageObj.clickLanguageButton();
        translationSubMenuPageObj.clickJapanLanguageButton();
        Thread.sleep(2000);
        translationSubMenuPageObj.clickHomeIcon();
        Thread.sleep(3000);

        //call for assert function to verify translation of word in frontend.
        translationSubMenuPageObj.assertionTest(translationOfStr, translationSubMenuPageObj.getButtonText());
        System.out.println("Translation successful");


    }
}
