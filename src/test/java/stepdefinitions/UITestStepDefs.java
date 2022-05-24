package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ClickPage;
import pages.SampeAppPage;
import pages.TextInputPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Helper;

public class UITestStepDefs {

    ClickPage clickPage = new ClickPage();
    TextInputPage textInputPage= new TextInputPage();
    SampeAppPage sampleAppPage = new SampeAppPage();

    @Given("User is on home")
    public void user_is_on_home() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

    @Given("user clicks on Click")
    public void user_clicks_on_click() {
        Helper.waitAndClick(clickPage.click,5);
    }

    @When("user clicks on Button")
    public void user_clicks_on_button() {
        Helper.waitAndClick(clickPage.buttonThatIgnoresDOMClickEvent,5);
    }

    @Then("user verifies Button That is green color")
    public void user_verifies_button_that_is_green_color() {
        Assert.assertTrue(Helper.waitForVisibility(clickPage.verifiesButtonThatIgnoresDOMClickEvent,5).isDisplayed());
    }

    @Given("user clicks on Text Input")
    public void userClicksOnTextInput() {
        Helper.waitAndClick(textInputPage.textInput,5);
    }

    @When("user writes text {string} into the input field and pressing the button")
    public void userWritesTextIntoTheInputFieldAndPressingTheButton(String me) {
        textInputPage.newButtonName.sendKeys(me);
        Helper.waitAndClick(textInputPage.updatingButton,5);
    }

    @Then("user verifies the button name is changing as {string}")
    public void userVerifiesTheButtonNameIsChanging(String name) {
        Helper.waitForVisibility(textInputPage.verifiesUpdatingButton,5).getText().equals(name);
    }

    @Given("user clicks on Sample App")
    public void userClicksOnSampleApp() {
        Helper.waitAndClick(sampleAppPage.sampleApp,5);
    }

    @When("user provides user name {string}")
    public void userProvidesUserName(String yesim) {
        sampleAppPage.userName.sendKeys(yesim);
    }

    @And("user provides password as {string}")
    public void userProvidesPasswordAs(String pwd) {
        sampleAppPage.password.sendKeys(pwd);
    }

    @And("user clicks on login in button")
    public void userClicksOnLoginInButton() {
        Helper.waitAndClick(sampleAppPage.logInButton,5);
    }

    @Then("user verifies {string} text")
    public void userVerifiesText(String text) {
        Assert.assertTrue(Helper.waitForVisibility(sampleAppPage.verifyText,5).isDisplayed());
    }
}
