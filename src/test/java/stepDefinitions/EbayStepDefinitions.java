package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        ebayPage.signInButton.click();
        Thread.sleep(3000);
    }
    @Then("User enters valid email")
    public void user_enters_valid_email() {
        ebayPage.emailBox.sendKeys("navdirtopal@gmail.com"+ Keys.ENTER);
    }
    @Then("User enters valid password")
    public void user_enters_valid_password() {
       ebayPage.passwordBox.sendKeys(ConfigReader.getProperty("ebayValidPassword"));
        ebayPage.signInSubmitButton.click();
    }
    @Then("User asserts login")
    public void user_asserts_login() {

    }

    @Given("User goes to the ebay page")
    public void userGoesToTheEbayPage() {
        Driver.getDriver().get(ConfigReader.getProperty("ebayUrl"));
        ebayPage.cookieAcceptButton.click();
    }

    @And("User handles the Captcha response")
    public void userHandlesTheCaptchaResponse() {
        
    }
}
