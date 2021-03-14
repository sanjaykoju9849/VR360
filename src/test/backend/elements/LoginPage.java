package test.backend.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    WebDriver myWebDriver;
    public LoginPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
        myWebDriver=pWebDriver;
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInputField;

//     public WebElement dynamicXpath(String emailOrPassword1)
//     {
//       String xpath1="//input[@id='"+emailOrPassword1+"']";
//        return myWebDriver.findElement(By.xpath(xpath1));
//     }

    @FindBy(xpath = "//button[@class='btn login-btn btn-block']")
    WebElement loginBtn;


    //for logout button
    @FindBy(xpath = "//img[@src='https://devadmin-bspace.ekbana.net/backend/image-resources/no-image.jpg']")
    WebElement clickLogOutButtonDropdown;

    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/logout']")
    WebElement logOutOptionSelect;

    @FindBy (xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/home']")
    WebElement dashboard;

    //@FindBy


    public void setEmailInput(String loginEmail) {
        emailInputField.sendKeys(loginEmail);

    }
    public void setPasswordInput(String userPassword) {
        passwordInputField.sendKeys(userPassword);

    }
    public void clickLoginBtn() {
        callForWaitMethod(loginBtn);
    }


    public void clickLogOutDropdown()
    {
        callForWaitMethod(clickLogOutButtonDropdown);
    }

    public void clickLogOutOptionSelect()
    {
        callForWaitMethod(logOutOptionSelect);
    }

    public void callForWaitMethod(WebElement elementToWait)
    {
        String emailOrPassword="password";
        //dynamicXpath(emailOrPassword).click();
        WebDriverWait wait=new WebDriverWait(myWebDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable((elementToWait)));
        elementToWait.click();
    }


//
//    @FindBy(xpath = "//input[@name='q']")
//    WebElement searchInputField;
//
//    public void SalesCheckBox() throws InterruptedException {
//        Thread.sleep(1000);
//        searchInputField.click();
//
//    }

//    public void  openNewTab() {
//        //String link = "window.open('https://www.google.com','_blank');";
//
//        String link = "window.open('https://www.google.com','_blank');";
//        ((JavascriptExecutor)myWebDriver).executeScript(link);
//
//        ArrayList<String> tabs = (ArrayList<String>) myWebDriver.getWindowHandles();
//
//        //myWebDriver.switchTo().window(tabs.getIndex(0));
//        myWebDriver.switchTo().window(tabs.get(1));
//        searchInputField.sendKeys("bspace", Keys.ENTER);
//    }


}
