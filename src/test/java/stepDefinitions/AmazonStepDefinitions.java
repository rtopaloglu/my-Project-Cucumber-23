package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to the Amazon page")
    public void user_goes_to_the_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("user search for Nutella")
    public void user_search_for_nutella() {

        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("user tests the results contains Nutella")
    public void user_tests_the_results_contains_nutella() {
        String searchWord = "Nutella";
        String actualSearchWord = amazonPage.researchResult.getText();
        Assert.assertTrue(actualSearchWord.contains(searchWord));
    }

    @Then("user close the page")
    public void user_close_the_page() {
        Driver.getDriver().close();
    }

    @Then("user search for Java")
    public void userSearchForJava() {
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @And("user tests the results contains Java")
    public void userTestsTheResultsContainsJava() {
        String searchWord = "Java";
        String actualSearchWord = amazonPage.researchResult.getText();
        Assert.assertTrue(actualSearchWord.contains(searchWord));
    }

    @Then("user search for {string}")
    public void user_search_for(String Word) {
        amazonPage.searchBox.sendKeys(Word + Keys.ENTER);
    }

    @Then("user tests the results contains {string}")
    public void user_tests_the_results_contains(String Word) {
        String searchWord = Word;
        String actualSearchWord = amazonPage.researchResult.getText();
        Assert.assertTrue(actualSearchWord.contains(searchWord));

    }

    @Given("user goes to the {string}")
    public void userGoesToThe(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }

    @Then("user waits {int} sn")
    public void user_waits_sn(Integer int1) throws InterruptedException {
        Thread.sleep(int1 * 1000);
    }

    @Given("user is in the {string}")
    public void userIsInThe(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("user asserts that url contains {string}")
    public void userAssertsThatUrlContains(String arg0) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arg0));
    }

    @And("user assert that the result contains {string}")
    public void userAssertThatTheResultContains(String arg0) {
        String word = arg0;
        String actualResult = amazonPage.researchResult.getText();
        Assert.assertTrue(actualResult.contains(word));

    }
}
