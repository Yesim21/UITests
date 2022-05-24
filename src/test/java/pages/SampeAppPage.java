package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SampeAppPage {

    public SampeAppPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@href='/sampleapp']")
    public WebElement sampleApp;
    @FindBy (xpath = "//input[@name='UserName']")
    public WebElement userName;
    @FindBy (xpath = "//input[@name='Password']")
    public WebElement password;
    @FindBy (xpath = "//button[@id='login']")
    public WebElement logInButton;
    @FindBy (xpath = "//*[text()='Welcome, yesim!']")
    public WebElement verifyText;
}
