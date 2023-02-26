package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.GuruPage;
import utilities.Driver;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();


    @Given("user does not accept cookies")
    public void user_does_not_accept_cookies() {
        Driver.getDriver().switchTo().frame(guruPage.guruIframe);
        guruPage.acceptCookie.click();

    }

}
