package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ClickPage {

    public ClickPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/click']")
    public WebElement click;
    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement buttonThatIgnoresDOMClickEvent;
    @FindBy(xpath="//button[@class='btn btn-success']")
    public WebElement verifiesButtonThatIgnoresDOMClickEvent;
}
