package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage {
    public GuruPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    public WebElement guruIframe;

    @FindBy(id = "denyAll")
    public WebElement declineCookie;


    @FindBy(xpath = "//*[text()=\"Accept All\"]")
    public WebElement acceptCookie;


}