package test.frontend.elements;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadVideoSpaceFilesPage {
    WebDriver myWebDriver;

    public UploadVideoSpaceFilesPage(WebDriver pWebDriver) {

        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }

    @FindBy(xpath = "//a[@class='icon-container']//img")
    WebElement clickToUploadVideo;

    @FindBy(xpath = "//div[@id='uploadVideo']//img[@class='img-fluid']")
    WebElement clickToBrowseVideo;

    @FindBy(xpath = " //div[@id='uploadVideo']//button[@class='btn btn-orange'][contains(text(),'Upload')]")
    WebElement clickUploadButton;

    public void clickBrowseVideo()
    {
        clickToUploadVideo.click();
    }


    public void getVideo()
    {
        String uploadObjFile="E:\\Automation projects\\qa_betaspace_automation\\Files\\360 video\\ 360 Video.mp4";
        clickToBrowseVideo.sendKeys(uploadObjFile );
    }

    public void ClickUploadButton()
    {
        clickUploadButton.click();
    }

}
