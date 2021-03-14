package test.backend.tests;

import utils.Constant;
import org.testng.annotations.Test;

public class PageManagementTest extends  Setup {

    public PageManagementTest()
    {
        super(Constant.backendType);
    }

    @Test

    public  void pageManagementTest() throws InterruptedException {

        loginToTheModule();

    }


}
