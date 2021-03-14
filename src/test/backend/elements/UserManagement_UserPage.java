package test.backend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManagement_UserPage {

    public UserManagement_UserPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/user']")
    WebElement userElement;

    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/user/create']")
    WebElement addUserButton;


    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstNameElement;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameElement;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailElement;

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameElement;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordElement;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    WebElement password_confirmationElement;

    @FindBy(xpath = "//select[@name='roles']")
    WebElement roleDropdownElement;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement saveUserButton;

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='btn login-btn btn-block']")
    WebElement loginButton;


    public void clickUsersSubModule() {
        userElement.click();
    }

    public void setAddUserButton()
    {
        addUserButton.click();
    }

    public void setFirstNameElement(String firstName) {
        firstNameElement.sendKeys(firstName);
    }

    public void setLastNameElement(String lastName) {
        lastNameElement.sendKeys(lastName);
    }

    public void setEmailElement(String email) {
        emailElement.sendKeys(email);
    }

    public void setUsernameElement(String username) {
        usernameElement.sendKeys(username);
    }

    public void setPasswordElement(String password) {
        passwordElement.sendKeys(password);
    }

    public void setPassword_confirmationElement(String confirmpassword) {
        password_confirmationElement.sendKeys(confirmpassword);
    }

    public void clickRolesDropDown(String Role)
    {
        Select dropdown= new Select(roleDropdownElement);
        dropdown.selectByVisibleText(Role);
    }

    public void setSaveUserButton()
    {
        saveUserButton.click();
    }

    public void UsernameElement(String Username)
    {
        username.sendKeys(Username);
    }

    public void setPassword(String Password)
    {
        password.sendKeys(Password);
    }

    public void setLoginButton()
    {
        loginButton.click();
    }


}
