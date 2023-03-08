package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataPages {

public DataPages(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy (xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastName;
    @FindBy (xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy (xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;
    @FindBy (xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extension;
    @FindBy (xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement date;
    @FindBy (xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy (xpath = "//div[@class='DTE_Form_Buttons']")
    public WebElement create;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy (xpath = "//td[@class='sorting_1']")
    public WebElement name;




}
