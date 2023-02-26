package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement researchResult;

    @FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    public WebElement signInSubmitButton;

}
