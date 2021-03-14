package test.backend.elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {
    WebDriver myWebDriver;

    public DashboardPage(WebDriver pWebDriver) {

        PageFactory.initElements(pWebDriver, this);


        myWebDriver = pWebDriver;
    }


    /**
     * View graph according to the checkboxes and there titles.
     */

    @FindBy(xpath = "//span[@class='checkmark-label color1']")
    WebElement salesCheckBox;

    @FindBy(xpath = "//span[@class='checkmark-label color2']")
    WebElement accountsCheckBox;

    @FindBy(xpath = "//span[@class='checkmark-label color3']")
    WebElement spaceCheckBox;

    @FindBy(xpath = "//span[@class='checkmark-label color4']")
    WebElement cameraLeaseCheckBox;

    @FindBy(xpath = "//span[@class='checkmark-label color5']")
    WebElement additionalSpaceCheckBox;


    public void SalesCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        salesCheckBox.click();
        Thread.sleep(2000);

    }

    public void accountsCheckBox() throws InterruptedException {
        accountsCheckBox.click();
        Thread.sleep(2000);
        accountsCheckBox.click();
        Thread.sleep(2000);
    }

    public void spaceCheckBox() throws InterruptedException {
        spaceCheckBox.click();
        Thread.sleep(2000);
        spaceCheckBox.click();
        Thread.sleep(2000);
    }


    public void cameraLeaseCheckBox() throws InterruptedException {
        cameraLeaseCheckBox.click();
        Thread.sleep(2000);
        cameraLeaseCheckBox.click();
        Thread.sleep(2000);
    }

    public void additionalSpaceCheckBox() throws InterruptedException {
        additionalSpaceCheckBox.click();
        Thread.sleep(2000);
        additionalSpaceCheckBox.click();
        Thread.sleep(2000);
    }


    /**
     * End of check boxes
     */

    /**
     * Select time duration(Yearly/Monthly/7Days) to view graph
     */

    @FindBy(xpath = "//select[@id='duration']")
    WebElement durationDropDown;

    public void durationDropDown() throws InterruptedException {
        Select dropdown = new Select(durationDropDown);
        dropdown.selectByIndex(1);
        Thread.sleep(2000);
        dropdown.selectByIndex(0);
        Thread.sleep(2000);
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
    }
}



