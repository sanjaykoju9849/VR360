package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public WebDriver myWebDriver;
    public HomePage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }

    public void waitForThisTobeClickable(WebElement elementToWait) {
        WebDriverWait waitForOption = new WebDriverWait(myWebDriver, 10);
        waitForOption.until(ExpectedConditions.visibilityOf(elementToWait));
    }


    @FindBy(xpath = "//i[@class='ti-user login-icon user-icon font-18']")
    WebElement loginIcon;

    @FindBy(xpath = "//p[@class='user-title m-b-5']")
    WebElement login;

    /**...........Register button.............**/
    @FindBy(xpath = "//li[@class='nav-item btn-nav-item p-t-15']//a[@class='btn btn-white'][contains(text(),'Register')]")
    WebElement registerBtn;

    public WebElement clickOnLoginIcon(){
        return loginIcon;
    }
    public WebElement clickOnLogin(){
        return login;
    }
    public WebElement clickOnRegisterBtn(){
        waitForThisTobeClickable(registerBtn);
        return registerBtn;
    }

}
