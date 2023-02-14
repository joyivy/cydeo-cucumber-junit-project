package com.cydeo.step_definitions;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class Googe_StepDefinitions {

    @When("user us on theGoogle search page")
    public void user_us_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();


    }

}
