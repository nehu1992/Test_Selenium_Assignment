package Cucumber_Framework.stepDefinations;


import Cucumber_Framework.POM.LoginPage;
import Cucumber_Framework.POM.SignupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class stepDefinations {
    WebDriver driver;
    SignupPage signupPage;
    LoginPage loginPage;

    static String userName;
    static String password = "Test@123";
    static String email;



    @Given("I Open the website")
    public void i_open_the_website() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        signupPage = PageFactory.initElements(driver, SignupPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Given("I click on createAccount Link")
    public void i_click_on_link() {
        // Write code here that turns the phrase above into concrete actions
        signupPage.createAccountLink.click();

    }
    @Given("Enter User Details")
    public void enter_user_details() {
        // Write code here that turns the phrase above into concrete actions
        userName = "UserName_"+String.valueOf(System.currentTimeMillis());
        signupPage.firstName.sendKeys(userName);
        signupPage.lastName.sendKeys("last_name");
        email=userName+"_email@gmai.com";
        signupPage.email.sendKeys(email);
        signupPage.password.sendKeys(password);
        signupPage.confirmedPassword.sendKeys(password);


    }
    @Given("Click on Create an Account button")
    public void click_on_button() {
        // Write code here that turns the phrase above into concrete actions
        signupPage.createAccountButton.submit();
    }
    @Then("Check user account")
    public void check_user_account_creation() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(signupPage.successTitle.getText().contains("Welcome, "+userName));
        driver.quit();

    }




    @Given("Click on signin link")
    public void click_on_signin_link() {
        // Write code here that turns the phrase above into concrete actions

        loginPage.signIn.click();


    }
    @Given("Enter username and password")
    public void enter_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.userName.sendKeys(email);
        loginPage.passowrd.sendKeys(password);

    }

    @Given("Click on signin button")
    public void click_on_signin_button() {
        // Write code here that turns the phrase above into concrete actions

        loginPage.signInButton.click();


    }
    @Then("Check sign flow pass")
    public void check_sign_flow_pass() {
        // Write code here that turns the phrase above into concrete actions

    }

}
