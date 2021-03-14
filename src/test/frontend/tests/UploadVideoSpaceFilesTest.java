package test.frontend.tests;

import utils.Constant;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.Upload2DSpaceFilesPage;
import test.frontend.elements.UploadVideoSpaceFilesPage;

import java.io.File;
import java.io.IOException;

public class UploadVideoSpaceFilesTest extends Setup {
    public UploadVideoSpaceFilesTest()
    {
        super(Constant.frontendType);
    }

    @Test
    public void uploadVideoSpaceFilesTest() throws InterruptedException {
        try{

            UploadVideoSpaceFilesPage UploadVideoSpaceFilesPageObj = new UploadVideoSpaceFilesPage(myWebDriver);
            Upload2DSpaceFilesPage upload2DSpaceFilesPageObj=new Upload2DSpaceFilesPage(myWebDriver);
            String xpathPart="SpaceNameVideo02";

            loginToTheModule();
            Thread.sleep(3000);
            upload2DSpaceFilesPageObj.clickSpaceName(xpathPart);
            UploadVideoSpaceFilesPageObj.clickBrowseVideo();
            UploadVideoSpaceFilesPageObj.getVideo();
            Thread.sleep(20000);
            UploadVideoSpaceFilesPageObj.ClickUploadButton();





        }catch(Exception e){
            myLoggerSetup.info("Error occurred while video file is uploading, please verify.\n" + e.getMessage() + "\n");
            e.printStackTrace();
            File scrFile = ((TakesScreenshot)myWebDriver).getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(scrFile, new File("./screenshot/reg_process_error.png"));


    }


    }
}
