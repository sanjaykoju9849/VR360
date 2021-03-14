package test.frontend.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload2DSpaceFilesPage {
    WebDriver myWebDriver;
    public Upload2DSpaceFilesPage(WebDriver pWebDriver) {

        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }


    /***..Elements for uploading 360 Images ..*/

    @FindBy (xpath = "//a[@class='icon-container']//img")
    WebElement clickBrowseImageButton1;

    @FindBy (xpath = "//input[@id='customFile']")
    WebElement clickBrowseImageButton2;

    @FindBy (xpath = "//button[@class='btn btn-orange']")
    WebElement clickImageUploadButton;


    /***..Elements for uploading Floor plan ..*/

    @FindBy (xpath = "//span[contains(text(),'Floorplan')]")
    WebElement clickFloorPlanSubModule;

    @FindBy (xpath = "//input[@id='customFile']")
    WebElement clickBrowseFloorPlanButton;

    @FindBy (xpath = "//button[contains(@class,'btn btn-orange')]")
    WebElement clickFloorPlanUploadButton;

    /***..Methods for uploading 360 Images ..*/

    /***..Elements for Adding link Hotspot in Floor Plan ..*/

    @FindBy (xpath = "//i[@class='la la-pencil']")
    WebElement clickEditFloorPlanButton;

    @FindBy(xpath = "(//img[@class='img-fluid'])[3]")
    WebElement clickToAddLinkHotSpot;

    @FindBy(xpath = "//input[@id='title']")
    WebElement clickToAddTitleForLinkHotSpot;

    @FindBy(xpath = "//div[@id='floorplanModal']//div[@class='row']//div[1]//img[1]")
    WebElement clickToSelectImageToLink;

    @FindBy(xpath = "//button[@class='btn btn-orange m-r-10 ng-star-inserted']")
    WebElement clickSaveButton;

    @FindBy(xpath = "//button[@id='deleteBtnClose']")
    WebElement clickToCloseFloorPlan;

    public WebElement clickSpaceName(String xpathPart ) throws InterruptedException {
        Thread.sleep(5000);
        WebElement SpaceName=myWebDriver.findElement(By.xpath("//h1[contains(text(),'"+xpathPart+"')]"));
        callForWaitMethod(SpaceName);
        return null;
    }

    public void clickImageUploadButton() throws InterruptedException {
        Thread.sleep(3000);
        (clickBrowseImageButton1).click();
    }


   // upload 360 multiple images
    public void get2D360Images() throws InterruptedException {

        String uploadFilePath ="E:\\Automation projects\\qa_betaspace_automation\\Files\\2D_360-Images\\a.jpg";
        String uploadFilePath2="E:\\Automation projects\\qa_betaspace_automation\\Files\\2D_360-Images\\b.jpg";
        Thread.sleep(2000);
        clickBrowseImageButton2.sendKeys(uploadFilePath + "\n " + uploadFilePath2 );
    }

    public void setClickToUpload360Images()
    {
        callForWaitMethod(clickImageUploadButton);

    }

    /***..Methods for uploading 360 Images Ends here ..*/


    /***..Methods for uploading Floor plan ..*/

    public void setClickFloorPlanSubModule()
    {
        callForWaitMethod(clickFloorPlanSubModule);
    }

    public void getFloorPlanImage() throws InterruptedException {
        String uploadFilePath1 ="E:\\Automation projects\\qa_betaspace_automation\\Files\\Floor plan\\floor plan.jpg";
        Thread.sleep(2000);
        clickBrowseFloorPlanButton.sendKeys(uploadFilePath1);
    }

    public void setClickFloorPlanUploadButton() {
        JavascriptExecutor js = (JavascriptExecutor) myWebDriver;
        //This will scroll the page till the element is found.
        js.executeScript("arguments[0].scrollIntoView();", clickFloorPlanUploadButton);
       callForWaitMethod(clickFloorPlanUploadButton);
    }


    /***..Methods for Adding link Hotspot in Floor Plan ..*/

    public void setClickEditFloorPlanButton() {
       callForWaitMethod(clickEditFloorPlanButton);
    }

    public void setClickToAddLinkHotSpot() throws InterruptedException {
        Thread.sleep(2000);
        callForWaitMethod(clickToAddLinkHotSpot);
    }

    public void setClickToAddTitleForLinkHotSpot() {
        clickToAddTitleForLinkHotSpot.sendKeys("Link Hotspot in Floor Plan");
    }

    public void setClickToSelectLinkToImage() {
        callForWaitMethod(clickToSelectImageToLink);
    }

    public void setClickSaveButton() throws InterruptedException {
        callForWaitMethod(clickSaveButton);
        Thread.sleep(2000);
    }

    public void setClickToCloseFloorPlan()
    {
        callForWaitMethod(clickToCloseFloorPlan);
    }


    public void callForWaitMethod(WebElement elementToWait)
    {
        WebDriverWait wait=new WebDriverWait(myWebDriver,10);
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
        wait.until(ExpectedConditions.elementToBeClickable((elementToWait)));
        elementToWait.click();
    }

}
