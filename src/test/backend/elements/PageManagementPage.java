package test.backend.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManagementPage {

    public void PageManagementPage(WebDriver pWebDriver)
    {
        PageFactory.initElements(pWebDriver, this);
    }
}
