package test.frontend.elements;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateSpacePage {
    public WebDriver myWebDriver;
    public CreateSpacePage(WebDriver pWebDriver) {

        PageFactory.initElements(pWebDriver, this);
        myWebDriver = pWebDriver;
    }



    @FindBy(xpath = "//a[@class='icon-container']//img[@class='img-fluid']")
    WebElement createSpaceButton;

    @FindBy(xpath = "//input[@id='spaceTitle']")
    WebElement spaceTitle;

    //choose space type 2D
    @FindBy(xpath = "//label[contains(text(),'2D')]")
    WebElement choose2DSpaceType;

    //choose space type 3D
    @FindBy(xpath = "//label[contains(text(),'3D')]")
    WebElement choose3DSpaceType;

    //choose space type Video
    @FindBy(xpath = "//label[contains(text(),'Video')]")
    WebElement chooseVideoSpaceType;

    @FindBy(xpath = "//div[@class='input-group m-b-30']//input[@id='file-upload']")
    WebElement chooseImage;

    @FindBy(xpath = "/html//div[@id='createSpace']/app-createspace/div[@role='document']/div//form/div/div/div[@class='form-group row']/div[@class='col-sm-9']/div[@class='custom-file space-custom-file']/input[@id='file-upload']")
    WebElement chooseAudioFile;

    @FindBy(xpath = "//input[@id='cInfo']")
    WebElement setPresentedBy;

    @FindBy(xpath = "//input[@id='author']")
    WebElement setAuthorName;

    @FindBy(xpath = "//input[@id='contact_name']")
    WebElement setContactName;

    @FindBy(xpath = "//input[@id='contact_email']")
    WebElement setContactEmail;

    //set contact phone number

    @FindBy(xpath = "/html//div[@id='createSpace']/app-createspace/div[@role='document']/div//form//button[@id='dropdownMenuButton']/i")
    WebElement clickCountryCode;

   //input data for country search
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement setCountryCodeName;

    //select nepal as country code
    @FindBy(xpath = "//span[@class='m-l-5']")
    WebElement clickCountryName;

    //set phone number
    @FindBy(xpath = "//input[@id='phone']")
    WebElement setPhoneNumber;

    //set address
    @FindBy(xpath = "//input[@id='address']")
    WebElement setAddress;

    //set external link address
    @FindBy(xpath = "//input[@id='webAddress']")
    WebElement setExtLinkAddress;

    //set published date
    @FindBy(xpath = "//input[@placeholder='2019-07-17']")
    WebElement setPublishedDate;

    @FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-today']")
    WebElement clickDate;

    //set summary
    @FindBy(xpath = "//textarea[@id='summary']")
    WebElement setSummary;

    @FindBy(xpath = "//select[@id='category']")
    WebElement chooseSpaceCategory;

    @FindBy(xpath = "//button[@class='btn btn-orange d-flex align-center justify-content-center']")
    WebElement nextButton;




    /**     * Payment wizard section     */

    @FindBy(xpath = "/html//div[@id='createSpace']/app-createspace/div[@role='document']//form//button[@type='submit']")
    WebElement clickPaymentNextButton;

    @FindBy(xpath = "/html//div[@id='createSpace']/app-createspace/div[@role='document']//div[@class='space-confirm-details']/div[3]/button[2]")
    WebElement clickPaymentNextButton1;

    public void clickCreateSpaceButton()
    {
        callForWaitMethod(createSpaceButton);
    }

    public void setSpaceTitle(String SpaceName)
    {
        callForWaitMethod(spaceTitle);
        spaceTitle.sendKeys(SpaceName);


    }

    //set ClickSpaceType
    public void Click2DSpaceType()
    {
        callForWaitMethod(choose2DSpaceType);
    }

    public void Click3DSpaceType()
    {
        callForWaitMethod(choose3DSpaceType);
    }

    public void ClickVideoSpaceType()
    {
        callForWaitMethod(chooseVideoSpaceType);
    }

    //set getThumbImage
    public void getThumbImage()
    {
        chooseImage.sendKeys("E:\\qa_betaspace_automation\\Files\\ThumbImage\\1.jpg");
    }

    //set getAudioFile
    public void getAudioFile()
    {
        chooseAudioFile.sendKeys("E:\\qa_betaspace_automation\\Files\\AudioFile\\audioFile.mp3");
    }

    //set setPresentedBy
    public void setPresentedBy()
    {
       callForWaitMethod(setPresentedBy);
       setPresentedBy.sendKeys("Presented by Sanjay");
    }

    //set setAuthorName
    public void setAuthorName()
    {
        callForWaitMethod(setAuthorName);
        setAuthorName.sendKeys("Author Name Sanjay");
    }

    //set setContactName
    public void setContactName()
    {
        callForWaitMethod(setContactName);
        setContactName.sendKeys("Contact Name Sanjay");
    }

    //set setContactEmail
    public void setContactEmail()
    {
        callForWaitMethod(setContactEmail);
        setContactEmail.sendKeys("rawnboy+123@gmail.com");
    }

   //set contact phone number

    public void clickCountryCode()
    {
        callForWaitMethod(clickCountryCode);
    }

    public void setCountryCodeName()
    {
        callForWaitMethod(setCountryCodeName);
        setCountryCodeName.sendKeys("nepal");
    }

    public void clickCountryName()
    {
        callForWaitMethod(clickCountryName);
    }

    public void setPhoneNumber()
    {
        callForWaitMethod(setPhoneNumber);
        setPhoneNumber.sendKeys("9849929787");
    }

    //set setAddress
    public void setAddress()
    {
        callForWaitMethod(setAddress);
        setAddress.sendKeys("bhaktapur, nepal");
    }

    //set external link address
    public void setExtLinkAddress()
    {
        callForWaitMethod(setExtLinkAddress);
        setExtLinkAddress.sendKeys("https://dev-bspace.ekbana.net");
    }

    //set published date
    public void setPublishedDate()
    {
       // callForWaitMethod(setPublishedDate);
        //clickDate.click();
        setPublishedDate.sendKeys("2019-10-23", Keys.ENTER);
    }

    //set summary
    public void setSummary()
    {
        callForWaitMethod(setSummary);
        setSummary.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when ");
    }

    //set ChooseSpaceCategory
    public void clickChooseSpaceCategory()
    {
        Select ChooseSpaceCategory=new Select(chooseSpaceCategory);
        ChooseSpaceCategory.selectByIndex(1);
    }

    public void clickNextButton()
    {
        callForWaitMethod(nextButton);
    }

    /**     * Payment wizard section     */
    public void clickPaymentNextButton()
    {
        callForWaitMethod(clickPaymentNextButton);
    }

    public void clickPaymentNextButton1()
    {
        callForWaitMethod(clickPaymentNextButton1);
    }

    public void callForWaitMethod(WebElement elementToWait)
    {
        WebDriverWait wait=new WebDriverWait(myWebDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable((elementToWait)));
        elementToWait.click();
    }
}
