package test.backend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolesSMPage {

    public RolesSMPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }
    @FindBy(xpath = "//a[@class='btn btn-success pull-right']")
    WebElement addNewBtn;

    @FindBy(xpath = "//input[@name='name']")
    WebElement roleName;

    public void clickOnAddNewBtn(){
        addNewBtn.click();
    }

    public WebElement setRoleName() {
        return roleName;
    }
}
