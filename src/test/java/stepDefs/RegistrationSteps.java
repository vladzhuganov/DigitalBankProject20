package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.RegistrationPage;
import utilities.DriverUtils;

public class RegistrationSteps {

    RegistrationPage registrationPage = new RegistrationPage(DriverUtils.getDriver());
    ;


    @Then("verify user is on the registration page")
    public void verify_user_is_on_the_registration_page() {
        Assert.assertTrue(registrationPage.verifyTitleRegistrationPage());
        // Assert.assertTrue(registrationPage.titleText.isDisplayed());
    }

    @When("user click on {string} field")
    public void user_click_on_field(String title) throws InterruptedException {

        registrationPage.titleRegistrationField.sendKeys(title);

        Thread.sleep(2000);
    }

    @Then("Verify user can see the drop down window with title option")
    public void verify_user_can_see_the_drop_down_window_with_title_option() {
        Assert.assertTrue(registrationPage.titleRegistrationField.isDisplayed());

        //Select s = new Select(registrationPage.titleRegistrationField);
        // isMultiple() returns a boolean value
        //  Assert.assertTrue(s.isMultiple());
    }


    @Then("verify chosen selection appears in the Title field")
    public void verify_chosen_selection_appears_in_the_title_field() {

    }


    @When("user clicks on please select dropdown menu")
    public void userClicksOnPleaseSelectDropdownMenu() throws InterruptedException {
        registrationPage.titleRegistrationField.click();
        Thread.sleep(3000);
    }

    @And("user clicks on proper selection {string}")
    public void userClicksOnProperSelection(String selection) {

        registrationPage.titleRegistrationField.sendKeys(selection);
    }

    @Then("verify chosen selection appears in the {string} field")
    public void verifyChosenSelectionAppearsInTheField(String title) {

    }
}
