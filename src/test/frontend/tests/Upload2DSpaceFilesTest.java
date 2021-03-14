package test.frontend.tests;

import org.testng.annotations.Parameters;
import utils.Constant;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.Upload2DSpaceFilesPage;

public class Upload2DSpaceFilesTest extends Setup {
    public Upload2DSpaceFilesTest()
    {
        super(Constant.frontendType);
    }


    @Parameters({ "SpaceName parameter" })
    @Test

    public void upload2DSpace360ImagesTest(String SpaceName) throws InterruptedException {

        Upload2DSpaceFilesPage upload2DSpaceFilesPageObj=new Upload2DSpaceFilesPage(myWebDriver);
        loginToTheModule();

        Thread.sleep(5000);
        upload2DSpaceFilesPageObj.clickSpaceName(SpaceName);
        //click to the space that was recently created.

        upload2DSpaceFilesPageObj.clickImageUploadButton();
        upload2DSpaceFilesPageObj.get2D360Images();
        upload2DSpaceFilesPageObj.setClickToUpload360Images();
        Thread.sleep(5000);
    }

    @Parameters({ "SpaceName parameter" })
    @Test

    public void uploadFloorPlan(String spaceName) throws InterruptedException {
        Upload2DSpaceFilesPage upload2DSpaceFilesPageObj1=new Upload2DSpaceFilesPage(myWebDriver);
        loginToTheModule();
        Thread.sleep(5000);
        upload2DSpaceFilesPageObj1.clickSpaceName(spaceName);
        Thread.sleep(3000);
        upload2DSpaceFilesPageObj1.setClickFloorPlanSubModule();
        upload2DSpaceFilesPageObj1.getFloorPlanImage();
        upload2DSpaceFilesPageObj1.setClickFloorPlanUploadButton();
        Thread.sleep(2000);
        upload2DSpaceFilesPageObj1.setClickEditFloorPlanButton();
        upload2DSpaceFilesPageObj1.setClickToAddLinkHotSpot();
        upload2DSpaceFilesPageObj1.setClickToAddTitleForLinkHotSpot();
        upload2DSpaceFilesPageObj1.setClickToSelectLinkToImage();
        upload2DSpaceFilesPageObj1.setClickSaveButton();
        upload2DSpaceFilesPageObj1.setClickToCloseFloorPlan();
    }
}
