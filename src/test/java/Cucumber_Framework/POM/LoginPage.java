package Cucumber_Framework.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindAll(
            @FindBy(linkText = "Sign In")
    )
    public  WebElement signIn;

    @FindBy(id = "email")
    public WebElement userName;

    @FindBy(id="pass")
    public WebElement passowrd;

    @FindBy(id="send2")
    public WebElement signInButton;


    public void LogIn_Action(String username, String password){

    }

}
