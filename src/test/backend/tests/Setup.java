package test.backend.tests;

import org.testng.annotations.*;
import utils.Constant;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import test.backend.elements.LoginPage;
import test.frontend.elements.FrontendLoginPage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class Setup {

    public WebDriver myWebDriver;
    public String MYURL;
    public String loginEmail;
    public String loginPassword;
    public String driver_selection;
    public Properties propertiesObject = new Properties();
    private String type="frontend";

   public Logger myLoggerSetup = Logger.getLogger("Setup");





   public Setup(String type){
       this.type=type;

   }

    public Setup() {

    }

    @BeforeSuite

    public void baseSetup() throws IOException {

        PropertyConfigurator.configure("src/log4j.properties");
        myLoggerSetup.info("Running the baseSetup, laying the ground work properly");
        checkOS();
    }

    public void checkOS() throws IOException {

        FileWriter setUpPropertiesFile = new FileWriter("src/driver-select.properties");

        String OperatingSystem = System.getProperty("os.name");

        myLoggerSetup.info("Running tests on " + OperatingSystem + " system. Now setting the correct Driver.");

        if (OperatingSystem.contains("Linux")) {
            propertiesObject.setProperty("driver_status", "chromedriver");
        } else {
            propertiesObject.setProperty("driver_status", "chromedriver2.40.exe");
        }

        propertiesObject.store(setUpPropertiesFile, null);
        setUpPropertiesFile.close();

    }

    public void readConstantsValues() throws IOException {
        FileReader readMyConfig = new FileReader("src/config.properties");
        propertiesObject.load(readMyConfig);
        myLoggerSetup.info("Reading the config file now ...");
        if (type == "backend") {
            MYURL = propertiesObject.getProperty("Backend_URL");
            loginEmail = propertiesObject.getProperty("backend_email");
            loginPassword = propertiesObject.getProperty("backend_password");
        } else {
            MYURL = propertiesObject.getProperty("Frontend_URL");
            loginEmail = propertiesObject.getProperty("Frontend_email");
            loginPassword = propertiesObject.getProperty("Frontend_password");

        }
        readMyConfig.close();
        FileReader readDriverSelect = new FileReader("src/driver-select.properties");
        propertiesObject.load(readDriverSelect);
        driver_selection = propertiesObject.getProperty("driver_status");
        readDriverSelect.close();

    }


    @BeforeMethod
    public void setup() throws IOException {


        readConstantsValues();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "./WebDrivers/" + driver_selection);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        myWebDriver = new ChromeDriver(options);
        myLoggerSetup.info("Driver Defined");
        myWebDriver.manage().window().maximize();
        myLoggerSetup.info("Window maximized, now getting the URL");

        myWebDriver.get("http://" + MYURL);
        myLoggerSetup.info("Login-page opened successfully");
    }

    @AfterMethod
    public void teardown() {
        myLoggerSetup.info("All test completed, quitting the driver ...");
        myWebDriver.quit();
    }

    public void loginToTheModule() throws InterruptedException {

       if (Constant.backendType==type){
        LoginPage loginPageObj = new LoginPage(myWebDriver);

        Thread.sleep(2000);
        loginPageObj.setEmailInput(loginEmail);
        loginPageObj.setPasswordInput(loginPassword);
        myLoggerSetup.info("Email and Password entered");
        loginPageObj.clickLoginBtn();
       } else {
           FrontendLoginPage frontendLoginPageObj = new FrontendLoginPage(myWebDriver);
           Thread.sleep(5000);
           frontendLoginPageObj.setEmailInput(loginEmail);
           frontendLoginPageObj.setPasswordInput(loginPassword);
           myLoggerSetup.info("Email and Password entered");
           frontendLoginPageObj.clickLoginBtn();
       }



    }

    public void assertThis(WebElement elementToAssert, String actualValue){
        Assert.assertEquals(actualValue, elementToAssert.getText());
        myLoggerSetup.info("Expected Value: "+actualValue+"\n"+"Actual Value: "+elementToAssert.getText());
    }

    public void invalidLoginAttempt() throws InterruptedException {
        FrontendLoginPage frontendLoginPageObj = new FrontendLoginPage(myWebDriver);

        frontendLoginPageObj.setEmailInput("rajnishofficeuse@gmail.com");
        frontendLoginPageObj.setPasswordInput("wrong123");
        for(int i=0; i<6; i++) {
            frontendLoginPageObj.clickLoginBtn();
            Thread.sleep(6000);
        }


    }


}
