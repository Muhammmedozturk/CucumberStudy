package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BluePages {
    public BluePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginButton;
    @FindBy (id = "formBasicEmail")
    public WebElement email;
    @FindBy (id = "formBasicPassword")
    public WebElement password;
    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement lgn;
    @FindBy (id = "dropdown-basic-button")
    public WebElement cıkıs;
    @FindBy (xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement logout;
    @FindBy (xpath = "//*[@class='ajs-button ajs-ok']")
    public WebElement ok;

}
