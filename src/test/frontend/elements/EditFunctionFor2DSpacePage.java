package test.frontend.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Ekuser-QA
 */
public class EditFunctionFor2DSpacePage {
    public WebDriver myWebDriver;

    public EditFunctionFor2DSpacePage(WebDriver pWebDriver) {

        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }


    @FindBy(xpath = "//a[@class='btn btn-tab btn-orange']")
    WebElement editSpaceButton;

    @FindBy(xpath = "//div[@id='sidebar-wrapper']//li[1]//a[1]")
    WebElement clickImageSideMenu;

    @FindBy(xpath = "//p[contains(text(),'Image2')]")
    WebElement clickToChooseSecImage;

    @FindBy(xpath = "//div[@class='col-xl-10 col-lg-9 col-md-10 col-sm-10 col-10 p-l-0 p-r-0']//li[4]//a[1]")
    WebElement clickCameraSideMenu;

    @FindBy(xpath = "//i[@class='la la-camera']")
    WebElement clickCameraIcon;

    @FindBy(xpath = "//li[6]//a[1]")
    WebElement clickHighLightReel;


    @FindBy(xpath = "//button[@class='btn m-r-15 btn-outline-grey-light']")
    WebElement addPhotosButton;

    @FindBy(xpath = "(//img[@class='img-fluid snapshot-image'])[1]")
    WebElement selectImageForSnapShot1;

    @FindBy(xpath = "(//img[@class='img-fluid snapshot-image'])[2]")
    WebElement selectImageForSnapShot2;

    @FindBy(xpath = "//button[@class='btn btn-tab btn-orange']")
    WebElement clickAddSelectedPhotosButton;

    @FindBy(xpath = "(//button[@class=\"close\"])[1]")
    WebElement clickCrossButton1;

    @FindBy(xpath = "(//button[@class=\"close editmodal-close\"])[1]")
    WebElement clickCrossButton2;

    @FindBy(xpath = "//div[@class='highlight-icon-div']")
    WebElement clickShowCaseHighLightReel;

    public void clickEditSpaceButton() {
        try
        { callForWaitMethod(editSpaceButton);
        }catch(Exception e){
            System.out.println("Either space do not contains any images or Edit button is not visible to click \n");
            myWebDriver.quit();
        }
    }

    public void setClickImageSideMenu()
    {
        callForWaitMethod(clickImageSideMenu);
    }

    public void setClickToChooseSecImage()
    {
        callForWaitMethod(clickToChooseSecImage);
    }


    public void clickCameraSideMenuButton()
    {
        callForWaitMethod(clickCameraSideMenu);
    }


    public void clickToTakeSnapShot()
    {
        callForWaitMethod(clickCameraIcon);
    }

    public void clickToHighLightReelSideMenu()
    {
        callForWaitMethod(clickHighLightReel);
    }

    public void clickAddFromPhotosButton()
    {
        callForWaitMethod(addPhotosButton);
    }

    public void clickToSelectSnapShots()
    {
        callForWaitMethod(selectImageForSnapShot1);
        callForWaitMethod(selectImageForSnapShot2);
    }

    public void clickToAddSelectedPhotosButton()
    {
        callForWaitMethod(clickAddSelectedPhotosButton);

    }

    public void clickToViewHighLightReel()
    {
        callForWaitMethod(clickCrossButton1);
        callForWaitMethod(clickCrossButton2);
        callForWaitMethod(clickShowCaseHighLightReel);

    }

    public void assertionTest()
    {
            System.out.println("Assert statement taking place");

            WebDriverWait wait=new WebDriverWait(myWebDriver,10);
            String error   = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[4]//div[1]//div[1]"))).getText();
            System.out.println("snapshot taken success message : "+ error);
            assertEquals(error, "Snapshot saved successfully.");
            System.out.println("\n Assert statement took place and the result should be in above line");
    }

    public void callForWaitMethod(WebElement elementToWait)
    {
        WebDriverWait wait=new WebDriverWait(myWebDriver,10);
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
        wait.until(ExpectedConditions.elementToBeClickable((elementToWait)));
        elementToWait.click();
    }

}
