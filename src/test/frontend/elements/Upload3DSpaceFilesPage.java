package test.frontend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload3DSpaceFilesPage {
    WebDriver myWebDriver;

    public Upload3DSpaceFilesPage(WebDriver pWebDriver) {
        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }

    @FindBy(xpath = "//input[@id='objFile']")
    WebElement clickToChooseObjFile;

    @FindBy(xpath = "//input[@id='mtlFile']")
    WebElement clickToChooseMtlFile;

    @FindBy(xpath = "//input[@id='imagesFile']")
    WebElement clickToChooseZipFile;

    @FindBy(xpath = "//button[@class='btn btn-orange']")
    WebElement clickUploadButton;



    // upload 360 multiple images
    public void get3DFiles()
    {
        String uploadObjFile="E:\\qa_betaspace_automation\\Files\\3Dfiles\\Large Mechanical Facility\\obj-file\\ec527d9146654ef6b1a8e9c43160c030_50k.obj";
        String uploadMtlFile="E:\\qa_betaspace_automation\\Files\\3Dfiles\\Large Mechanical Facility\\obj-file\\11.mtl";
        String uploadZipFile="E:\\qa_betaspace_automation\\Files\\3Dfiles\\Large Mechanical Facility\\obj-file\\1.zip";

        clickToChooseObjFile.sendKeys(uploadObjFile);
        clickToChooseMtlFile.sendKeys(uploadMtlFile);
        clickToChooseZipFile.sendKeys(uploadZipFile );
    }

    public void clickUploadButton()
    {
        clickUploadButton.click();
    }



}
