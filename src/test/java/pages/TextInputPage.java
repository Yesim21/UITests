package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TextInputPage {

    public TextInputPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/textinput']")
    public WebElement textInput;
    @FindBy(xpath="//input[@id='newButtonName']")
    public WebElement newButtonName;
    @FindBy(xpath="//button[@id='updatingButton']")
    public WebElement updatingButton;
    @FindBy(xpath="//button[@id='updatingButton']")
    public WebElement verifiesUpdatingButton;
}
