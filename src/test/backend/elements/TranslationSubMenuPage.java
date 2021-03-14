package test.backend.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class TranslationSubMenuPage {
    WebDriver MyWebDriver;
    public  TranslationSubMenuPage(WebDriver pWebDriver)
    {
        super();
        PageFactory.initElements(pWebDriver, this);
        MyWebDriver=pWebDriver;

    }


        @FindBy(xpath = "//a[@title='Languages']")
        WebElement languageModuleElement;

        @FindBy(xpath = "//*[@id=\"sidenavlanguage\"]/li[4]/a")
        WebElement wordsSubModuleElement;


        //assert function to call to search word before adding a word to confirm word is unique


       @FindBy(xpath = "//button[@id='addNew']")
       WebElement addNewWordButton;

    @FindBy(xpath = "//input[@name='words[]']")
    WebElement NewWord;

    @FindBy(xpath = "//*[@id=\"addNewpanel\"]/div/form/div[3]/div/button[1]")
    WebElement saveNewWordButton;


    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/translation']")
    WebElement translationSubModuleElement;

    @FindBy(xpath = "//select[@name='lang']")
    WebElement selectLangDropDown;



    @FindBy(xpath = "//input[@class='form-control search-box']")
    WebElement searchWord;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement searchWordButton;


    /*** Dynamic xpath for inserting for Locating element to add translation of word. */
   public WebElement callForDynamicXpath (String XpathUnit)
   {
       String  dynamicXpath="//input[@name='transwordWord[jp]["+XpathUnit+"]']";
       return MyWebDriver.findElement(By.xpath(dynamicXpath));
   }


    @FindBy(xpath = "//button[@class='btn  btn-info pull-right']")
    WebElement saveTranslationOfWord;



    /*** Frontend login */

    @FindBy(xpath = "//input[@ id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@ id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='btn btn-orange w-100']")
    WebElement LoginButton;

    @FindBy(xpath = "//div[@class=\"logo-left-block\"]/a/img")
    WebElement homeIcon;


    /***  for changing language*/
    @FindBy (xpath = "//img[@src='https://devadmin-bspace.ekbana.net/backend/css/icons/flag-icon-css/flags/us.svg']")
    WebElement languageButton;


    @FindBy (xpath = " //*[@id=\"navbarSupportedContent\"]/ul/div/li[1]/div/div[2]/a")
    WebElement japaneseLanguageButton;

    /***   //get text to compare in assert function.*/

    @FindBy (xpath = "//a[@class='btn btn-orange']")
    WebElement ButtonText;

    public String getButtonText() {
        String str = ButtonText.getText();
        return str;
    }

    public void clickLanguageModule()
        {
            languageModuleElement.click();
        }
    public void clickWordSubModule()
        {
            wordsSubModuleElement.click();
        }


    /*** Add new word Begins here*/

    public void clickAddNewWordButton()
        {
            addNewWordButton.click();
        }
    public void setNewWord(String str)
        {
            NewWord.sendKeys(str);
        }
    public void clickSaveNewWordButton()
        {
            saveNewWordButton.click();
        }

    /*** Add new word Ends here*/


    /*** Translation of new word Begins here*/


    public void clickTranslationSubModule()
    {
        translationSubModuleElement.click();
    }


    /*** //dropdown change to japanese*/
    public void clickToChooseDropDown()
    {
        Select dropdown=new Select(selectLangDropDown);
        dropdown.selectByVisibleText("Japanese");
    }


    public void setSearchWord(String strWord)
    {
        searchWord.sendKeys(strWord);
    }
    public  void clickSearchWordButton()
    {
        searchWordButton.click();
    }
    public void setTranslationOfWord(String strWord, String translationOfStr)
    {
        callForDynamicXpath(strWord).sendKeys(translationOfStr);
    }

    public void clickSaveTranslationOfWord()
    {
        saveTranslationOfWord.click();
    }


    /*** Frontend login method*/

    public void loginInoFrontend()
    {

        MyWebDriver.get("https://dev-bspace.ekbana.net/login");

        emailField.sendKeys("rawnboy+1212@gmail.com");
        passwordField.sendKeys("password");
        LoginButton.click();
    }

    public void clickHomeIcon()
    {
        homeIcon.click();
    }
    public void clickLanguageButton()
    {
        languageButton.click();
    }
    public void clickJapanLanguageButton()
    {
        japaneseLanguageButton.click();
    }


    public void assertionTest(String a,String b)
    {
        System.out.println("assert statement taking place");
            assertEquals(a,b);
            //Assert.assertTrue("Login was not successful!", myWebDriver.getPageSource().contains());

            System.out.println("\n assert statement took place and the result should be in above line");

    }





}



