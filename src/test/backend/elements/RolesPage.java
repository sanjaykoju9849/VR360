package test.backend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.backend.tests.Setup;

import java.util.concurrent.TimeUnit;

public class RolesPage extends Setup
{
    LoginPage loginPageObj = new LoginPage(myWebDriver);

    public RolesPage(WebDriver pWebDriver){
        super();
        PageFactory.initElements(pWebDriver, this);
        myWebDriver=pWebDriver;
    }

    @FindBy(xpath = "//a[@title='User Management']")
    WebElement userManagementElement;

    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/role']")
    WebElement rolesElement;

    @FindBy(xpath = "//a[@href='https://devadmin-bspace.ekbana.net/system/role/create']")
    WebElement addRolesButtonElement;

    @FindBy(xpath = "//input[@name='name']")
    WebElement nameRoleFieldElement;

    /***********  for getting Permissions*********/

    //config permission
    @FindBy(xpath = "//input[@id='config']")
    WebElement configCheckBoxElement;

    //user permission
    @FindBy(xpath = "//input[@id='user']")
    WebElement userCheckBoxElement;

    //Pages permission
    @FindBy(xpath = "//input[@id='pages']")
    WebElement pageCheckBoxElement;

    //user Language Permission
    @FindBy(xpath = "//input[@id='language']")
    WebElement languageCheckBoxElement;

    //Log Permission
    @FindBy(xpath = "//input[@id='log']")
    WebElement logCheckboxElement;

    //News Permission
    @FindBy(xpath = "//input[@id='news']")
    WebElement newsCheckboxElement;

    //Member Permission
    @FindBy(xpath = "//input[@id='member']")
    WebElement memberManagementCheckBox;

    //Space Category Permission
    @FindBy(xpath = "//input[@id='spacecategory']")
    WebElement spaceCategoryCheckBox;

    //Space Permission
    @FindBy(xpath = "//input[@id='space']")
    WebElement spaceCheckBox;

    //Plan Permission
    @FindBy(xpath = "//input[@id='plan']")
    WebElement planCheckBox;

    //Faq Permission
    @FindBy(xpath = "//input[@id='faq']")
    WebElement faqCheckBox;

    //subscription Permission
    @FindBy(xpath = "//input[@id='subscription']")
    WebElement subscriptionCheckBox;

    //contact Permission
    @FindBy(xpath = "//input[@id='contact']")
    WebElement contactCheckBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement saveButton;






    /******** Click on User Management Module  ********/
    public void clickUserManagementModule()
    {
        loginPageObj.callForWaitMethod(userManagementElement);

    }

    /********* Click on Roles Sub-Module*********/
    public void clickRolesSubModule() {
        loginPageObj.callForWaitMethod(userManagementElement);

    }

    /*********** Click on Add Roles Button*********/
    public void clickAddRolesButton() {
        loginPageObj.callForWaitMethod(userManagementElement);
        addRolesButtonElement.click();
    }


    /*********** Method for getting name and permissions*********/
    public void clickNameRoleFieldAndPermissions() throws InterruptedException {

        String str;

        for(int i=0;i<5;i++) {

            str=getRoleName(i);

            nameRoleFieldElement.clear();
            nameRoleFieldElement.sendKeys(str);

            Thread.sleep(3000);
            permission(str);
            Thread.sleep(1000);
            clickSetSaveButton();
            Thread.sleep(2000);

            if(i==4){
                break;
            }
            clickAddRolesButton();

        }
    }





    public String  getRoleName(int i) {


        String [] roleName=new String[5];

        roleName[0] = "Admin";
        roleName[1] = "Member Manager";
        roleName[2] = "Page Manager";
        roleName[3] = "News Manager";
        roleName[4] = "Space Manager";

        return roleName[i];
    }

    /*********** End of Method for getting name and permissions*********/


    //config permission
    public void clickConfigCheckBoxElement()  {
        loginPageObj.callForWaitMethod(userManagementElement);
        configCheckBoxElement.click();

    }


    //user permission
    public void clickUserCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        userCheckBoxElement.click();
    }



    //Pages permission
    public void clickPagesCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        pageCheckBoxElement.click();
    }


    //user Language Permission
    public void clickLanguageCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        languageCheckBoxElement.click();
    }


    //Log Permission
    public void clickLogCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        logCheckboxElement.click();
    }


    //News Permission
    public void clickNewsCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        newsCheckboxElement.click();
    }


    //Member Permission
    public void clickMemberManagementCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        memberManagementCheckBox.click();
    }


    //Space Category Permission
    public void clickSpaceCategoryCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        spaceCategoryCheckBox.click();

    }


    //Space Permission
    public void clickSpaceCheckBoXElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        spaceCheckBox.click();

    }



    //Plan Permission
    public void clickPlanCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        planCheckBox.click();

    }



    //Faq Permission
    public void clickFaqCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        faqCheckBox.click();

    }


    //subscription Permission
    public void clickSubscriptionCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        subscriptionCheckBox.click();

    }

    //contact Permission
    public void clickContactCheckBoxElement()
    {
        loginPageObj.callForWaitMethod(userManagementElement);
        contactCheckBox.click();
    }


    /***********  End of getting Permissions*********/

    /***********  Save button for adding Roles*********/

    public void clickSetSaveButton(){
        loginPageObj.callForWaitMethod(saveButton);
        myWebDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
    }


    /***********  Method for choosing Permissions according to Role Names*********/

    public void  permission(String str) throws InterruptedException {
        switch (str) {
            case "Admin":

                clickConfigCheckBoxElement();


                clickUserCheckBoxElement();


                clickLanguageCheckBoxElement();

                break;

            case "Member Manager":

                clickMemberManagementCheckBoxElement();


                clickSpaceCheckBoXElement();

                break;

            case "Page Manager":

                clickPagesCheckBoxElement();
                clickMemberManagementCheckBoxElement();

                break;


            case "News Manager":

                clickNewsCheckBoxElement();
                clickMemberManagementCheckBoxElement();

                 break;

            case "Space Manager":
                Thread.sleep(1000);
                clickSpaceCheckBoXElement();

                Thread.sleep(1000);
                clickSpaceCategoryCheckBoxElement();

                break;
        }

    }

}
