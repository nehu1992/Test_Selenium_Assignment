package Cucumber_Framework.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    final WebDriver driver;

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    @FindAll(
            @FindBy(linkText = "Create an Account")
    )
    public  WebElement createAccountLink;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id="lastname")
    public WebElement lastName;

    @FindBy(id="email_address")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="password-confirmation")
    public WebElement confirmedPassword;

    @FindBy(xpath = "//button[@title=\"Create an Account\"]")
    public WebElement createAccountButton;

    @FindBy(className = "logged-in")
    public WebElement successTitle;



    public void LogIn_Action(String username, String password){

    }

}
