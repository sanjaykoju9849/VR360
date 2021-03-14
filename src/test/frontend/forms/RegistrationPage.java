package test.frontend.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public WebDriver myWebDriver;

    public RegistrationPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }

    public void waitForThisTobeClickable(WebElement elementToWait) {
        WebDriverWait waitForOption = new WebDriverWait(myWebDriver, 10);
        waitForOption.until(ExpectedConditions.visibilityOf(elementToWait));
    }

    @FindBy(id ="first_name")
    WebElement firstName;
    @FindBy(id = "namek")
    WebElement lastname;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "cname")
    WebElement password;
    @FindBy(xpath = "//button[@id='dropdownMenuButton']//i[@class='language-img flag-icon flag-icon-jp']")
    WebElement countryCodeSelectionDropDown;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement countryCodeSearchField;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement dropdownItem;
    @FindBy(xpath = "cName")
    WebElement companyName;
    @FindBy(xpath = "//button[@class='btn btn-orange w-100']")
    WebElement submitBtn;

    public WebElement setFirstName() {
        waitForThisTobeClickable(firstName);
        return firstName;
    }

    public WebElement setLastName()
    {
        waitForThisTobeClickable(lastname);
        return lastname;
    }

    public WebElement setEmail() {
        waitForThisTobeClickable(email);
        return email;
    }
    public WebElement setPassword(){
        waitForThisTobeClickable(password);
        return password;
    }
    public WebElement clickSelectCountryCodeDropdown(){
        waitForThisTobeClickable(countryCodeSelectionDropDown);
        return countryCodeSelectionDropDown;
    }
    /*public void selectCountryCodeSelectionDropDown(String countryCodeDropDown){
        Select dropdown = new Select(countryCodeSelectionDropDown);
        dropdown.selectByVisibleText(countryCodeDropDown);

    }*/
    public WebElement clickCountryCodeSearchField(){
        waitForThisTobeClickable(countryCodeSearchField);
        return countryCodeSearchField;
    }
    public WebElement clickDropdownItem(){
        waitForThisTobeClickable(dropdownItem);
        return dropdownItem;
    }
    public WebElement setCompanyName(){
        waitForThisTobeClickable(companyName);
        return companyName;
    }

    public WebElement clickSubmitBtn() {
        waitForThisTobeClickable(submitBtn);
        return submitBtn;
    }


}
