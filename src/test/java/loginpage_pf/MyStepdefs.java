package loginpage_pf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class MyStepdefs {
    @Given("^browser is open$")
    public void browserIsOpen() {
        // Implementation for opening the browser
    }

    @And("^user is on login page$")
    public void userIsOnLoginPage() {
        // Implementation for navigating to the login page
    }

    @When("^User enters (.*) and (.*)$")
    public void userEntersLoginNameAndPassword(String loginName, String password) {
        // Implementation for entering login name and password
    }

    @And("^click on login button$")
    public void clickOnLoginButton() {
        // Implementation for clicking on the login button
    }

    @Then("^User is navigated to the home page$")
    public void userIsNavigatedToHomePage() {
        // Implementation for verifying the user is on the home page
    }
}
