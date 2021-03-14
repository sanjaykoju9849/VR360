package test.backend.tests;

import utils.Constant;
import org.testng.annotations.Test;
import test.backend.elements.DashboardPage;

public class DashboardTest extends Setup{

    public DashboardTest() {
        super(Constant.backendType);
    }

    @Test
       public void dashBoardPage() throws InterruptedException {

       DashboardPage DashboardPageObj=new DashboardPage(myWebDriver);


        loginToTheModule();

        /*** CheckBoxes click***/

        DashboardPageObj.SalesCheckBox();
        DashboardPageObj.accountsCheckBox();
        DashboardPageObj.spaceCheckBox();
        DashboardPageObj.cameraLeaseCheckBox();
        DashboardPageObj.additionalSpaceCheckBox();

       /**
     * Duration dropdown for yearly/monthly/7days
     **/

        DashboardPageObj.durationDropDown();


    }

}
