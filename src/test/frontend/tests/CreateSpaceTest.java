package test.frontend.tests;

import org.testng.annotations.Parameters;
import utils.Constant;
import org.testng.annotations.Test;
import test.backend.tests.Setup;
import test.frontend.elements.CreateSpacePage;

public class CreateSpaceTest extends Setup {
    public CreateSpaceTest()
    {
        super(Constant.frontendType);
    }

    @Parameters({ "SpaceName parameter" , "Space Type parameter"})
    @Test
    public void createSpace(String SpaceName, String spaceType) throws InterruptedException{
        CreateSpacePage createSpacePageObj =new CreateSpacePage(myWebDriver);

        loginToTheModule();
        createSpacePageObj.clickCreateSpaceButton();
        createSpacePageObj.setSpaceTitle(SpaceName);

        if(spaceType=="2D")
        {
            /**     * choose space type 2D   */
            createSpacePageObj.Click2DSpaceType();
        }else
            if (spaceType=="3D")
            {
                /**     * choose space type 3D   */
               // createSpacePageObj.Click3DSpaceType();
            }else
             if (spaceType=="Video")
            {
                /**     * choose space type Video  */
               createSpacePageObj.ClickVideoSpaceType();
            }

       // createSpacePageObj.getThumbImage();
        //createSpacePageObj.getAudioFile();
        //createSpacePageObj.setPresentedBy();
//        createSpacePageObj.setAuthorName();
//        createSpacePageObj.setContactName();
//        createSpacePageObj.setContactEmail();
//        createSpacePageObj.clickCountryCode();
//        createSpacePageObj.setCountryCodeName();
//        createSpacePageObj.setPhoneNumber();
//        createSpacePageObj.setAddress();
//        createSpacePageObj.setExtLinkAddress();
//        createSpacePageObj.setSummary();
        createSpacePageObj.setPublishedDate();
        Thread.sleep(2000);
        createSpacePageObj.clickChooseSpaceCategory();
        //Thread.sleep(5000);
        createSpacePageObj.clickNextButton();

        //Thread.sleep(10000);
        createSpacePageObj.clickPaymentNextButton();
        createSpacePageObj.clickPaymentNextButton1();
        Thread.sleep(2000);

    }

}
