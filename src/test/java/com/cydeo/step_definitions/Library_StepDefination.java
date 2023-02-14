package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefination {

    @Given("user is on the login page of teh library application")
    public void user_is_on_the_login_page_of_teh_library_application() {
        System.out.println("User is on the login page of the library application.");
    }
    @When("user enters librarian usurname")
    public void user_enters_librarian_usurname() {
        System.out.println("User enters librarian usurname.");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enter librarian password.");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User see the dashbord.");
    }


    @When("user enters student usurname")
    public void userEntersStudentUsurname() {
        
        
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        
    }

    @Given("user is on the login page of the library application")
    public void userIsOnTheLoginPageOfTheLibraryApplication() {
    }

    @Given("user is on the login page of the library application ")
    public void userIsOnTheLoginPageOfTheLibraryApplicationApplication() {


    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        
    }

    @When("user enters admin usurname")
    public void userEntersAdminUsurname() {
    }
}
