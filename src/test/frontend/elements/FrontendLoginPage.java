package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontendLoginPage {
    public FrontendLoginPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }
    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(xpath = "//button[@class='btn btn-orange w-100']")
    WebElement loginBtn;



    public void setEmailInput(String userEmail) {
        emailInput.clear();
        emailInput.sendKeys(userEmail);
    }
    public void setPasswordInput(String userPassword) {
        passwordInput.clear();
        passwordInput.sendKeys(userPassword);
    }
    public void clickLoginBtn() {
        loginBtn.click();
    }


}
