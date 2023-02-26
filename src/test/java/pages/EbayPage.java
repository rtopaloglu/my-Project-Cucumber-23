package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {
    public EbayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()=\"Einloggen\"])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id=\"login-email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id=\"login-password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id=\"login-submit\"]")
    public WebElement signInSubmitButton;


    @FindBy(xpath = "//*[text()=\"Alle akzeptieren\"]")
    public WebElement cookieAcceptButton;



}
