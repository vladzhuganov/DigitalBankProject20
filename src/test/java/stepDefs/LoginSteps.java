package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverUtils;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverUtils.getDriver());

    @Given("user open website")
    public void userOpenWebsite() {
        loginPage.openWebsite();
    }


    @Given("user entered correct URL")
    public void user_entered_correct_url() {
        loginPage.verifyURL();
    }

    @When("user clicks on the sign up here link")
    public void user_clicks_on_the_sign_up_here_link() {
        loginPage.signUpHereBtn.click();
    }
}
