package test.frontend.tests;

import org.testng.annotations.Parameters;
import utils.Constant;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.EditFunctionFor2DSpacePage;
import test.frontend.elements.Upload2DSpaceFilesPage;

/**
 * @author Ekuser-QA
 */
public class EditFunctionFor2DSpace extends Setup {

    public EditFunctionFor2DSpace(){
        super(Constant.frontendType);
    }

   @Parameters({ "SpaceName parameter" })
    @Test
    public void editFunctionFor2DSpace(String spaceName) throws InterruptedException {
        EditFunctionFor2DSpacePage editFunctionFor2DSpacePageObj=new EditFunctionFor2DSpacePage(myWebDriver);
        Upload2DSpaceFilesPage upload2DSpaceFilesPageObj =new Upload2DSpaceFilesPage(myWebDriver);
        loginToTheModule();

        Thread.sleep(5000);
        upload2DSpaceFilesPageObj.clickSpaceName(spaceName);
        editFunctionFor2DSpacePageObj.clickEditSpaceButton();
        editFunctionFor2DSpacePageObj.clickCameraSideMenuButton();
        Thread.sleep(2000);
        editFunctionFor2DSpacePageObj.clickToTakeSnapShot();
        Thread.sleep(1000);
        //call for assert function.
        editFunctionFor2DSpacePageObj.assertionTest();

        editFunctionFor2DSpacePageObj.setClickImageSideMenu();
        editFunctionFor2DSpacePageObj.setClickToChooseSecImage();
        editFunctionFor2DSpacePageObj.clickCameraSideMenuButton();
        editFunctionFor2DSpacePageObj.clickToTakeSnapShot();
        //call for assert function.
        editFunctionFor2DSpacePageObj.assertionTest();

        editFunctionFor2DSpacePageObj.clickToHighLightReelSideMenu();
        editFunctionFor2DSpacePageObj.clickAddFromPhotosButton();
        editFunctionFor2DSpacePageObj.clickToSelectSnapShots();
        editFunctionFor2DSpacePageObj.clickToAddSelectedPhotosButton();
        editFunctionFor2DSpacePageObj.clickToViewHighLightReel();

    }
}
