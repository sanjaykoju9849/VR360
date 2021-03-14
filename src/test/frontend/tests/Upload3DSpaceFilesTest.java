package test.frontend.tests;

import utils.Constant;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.Upload2DSpaceFilesPage;
import test.frontend.elements.Upload3DSpaceFilesPage;

public class Upload3DSpaceFilesTest extends Setup {

    public Upload3DSpaceFilesTest()
    {
        super(Constant.frontendType);
    }


    @Test
    public void upload3DSpaceFilesTest() throws InterruptedException {
        Upload3DSpaceFilesPage upload3DSpaceFilesPageObj = new Upload3DSpaceFilesPage(myWebDriver);

        loginToTheModule();
        String xpathPart="SpaceNameVideo02";

        Upload2DSpaceFilesPage upload2DSpaceFilesPageObj=new Upload2DSpaceFilesPage(myWebDriver);

        Thread.sleep(5000);
        upload2DSpaceFilesPageObj.clickSpaceName(xpathPart);
        Thread.sleep(3000);
        upload3DSpaceFilesPageObj.get3DFiles();
        Thread.sleep(20000);
        upload3DSpaceFilesPageObj.clickUploadButton();
    }
}
