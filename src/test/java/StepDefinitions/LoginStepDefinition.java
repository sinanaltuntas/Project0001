package StepDefinitions;

import Pages.DashboardPage;
import Pages.LoginPage;
import Utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinition {

    @Given("User should open login page")
    public void user_should_open_login_page() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @When("User should enter valid username and password")
    public void user_should_enter_valid_username_and_password() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"), Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User should see main page")
    public void user_should_see_main_page() throws InterruptedException {

        DashboardPage dashboardPage = new DashboardPage();
        String expectedResult = "Ana Sayfa";
        Thread.sleep(3000);
        Assert.assertEquals(expectedResult, dashboardPage.dashboardTitle.getText());
    }

    @When("User should enter invalid username and password")
    public void user_should_enter_invalid_username_and_password() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.get("invalidUsername"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("invalidPassword"),Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("User should see error")
    public void user_should_see_error() {
        LoginPage loginPage = new LoginPage();
        String expectedResult = "Login Failed!";
        String actualResult = loginPage.alertText.getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

}