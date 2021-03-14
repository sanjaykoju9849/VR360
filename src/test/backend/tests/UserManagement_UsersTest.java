package test.backend.tests;

import org.testng.annotations.Test;
import test.backend.elements.RolesPage;
import test.backend.elements.UserManagement_UserPage;


public class UserManagement_UsersTest extends Setup {

    public UserManagement_UsersTest(String type) {

    }

    @Test(dataProvider="UserManagement_UsersData",dataProviderClass= test.backend.data.DataforUsers.class, priority=1)

    public void userManagement_UsersTest(String First_Name,String Last_Name,String Email,String Username,String Password,String Confirm_Password,String Role) throws InterruptedException{

        RolesPage rolesPageObj=new RolesPage(myWebDriver);
        UserManagement_UserPage usersPageObj=new UserManagement_UserPage(myWebDriver);


/**
 * User Management Module, Roles sub-Module and other process to add Roles.
 */
        loginToTheModule();

        rolesPageObj.clickUserManagementModule();
        usersPageObj.clickUsersSubModule();

        usersPageObj.setAddUserButton();

        Thread.sleep(1000);
        usersPageObj.setFirstNameElement(First_Name);
        Thread.sleep(1000);
        usersPageObj.setLastNameElement(Last_Name);
        Thread.sleep(1000);
        usersPageObj.setEmailElement(Email);
        Thread.sleep(1000);
        usersPageObj.setUsernameElement(Username);
        Thread.sleep(1000);
        usersPageObj.setPasswordElement(Password);
        Thread.sleep(1000);
        usersPageObj.setPassword_confirmationElement(Confirm_Password);
        Thread.sleep(1000);

        usersPageObj.clickRolesDropDown(Role);
        usersPageObj.setSaveUserButton();
        Thread.sleep(3000);


        myWebDriver.get("https://devadmin-bspace.ekbana.net/system/logout");
        Thread.sleep(3000);

        usersPageObj.UsernameElement(Username);
        Thread.sleep(1000);
        usersPageObj.setPassword(Password);
        Thread.sleep(1000);
        usersPageObj.setLoginButton();
        Thread.sleep(10000);

    }

}
