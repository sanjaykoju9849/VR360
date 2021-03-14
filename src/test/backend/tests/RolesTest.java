package test.backend.tests;

import utils.Constant;
import org.testng.annotations.Test;
import test.backend.elements.RolesPage;

public class RolesTest extends  Setup {
    public RolesTest() {
        super(Constant.backendType);
    }

    @Test
    public void rolesTest() throws InterruptedException {

       RolesPage rolesPageObj=new RolesPage(myWebDriver);
       loginToTheModule();



/**
 * User Management Module, Roles sub-Module and other process to add Roles.
 */

        rolesPageObj.clickUserManagementModule();
        Thread.sleep(2000);
        rolesPageObj.clickRolesSubModule();

        Thread.sleep(2000);
        rolesPageObj.clickAddRolesButton();
        Thread.sleep(2000);
        rolesPageObj.clickNameRoleFieldAndPermissions();



    }
}