package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataPages;
import utilities.Driver;

public class DatTablesStepdefinitions {
    DataPages dataPages=new DataPages();
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
dataPages.newButton.click();
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
dataPages.firstName.sendKeys(string);
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
dataPages.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
dataPages.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
dataPages.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
dataPages.extension.sendKeys(string);
    }
    @When("kullanici start date {string} girer")
    public void kullanici_start_date_girer(String string) {
dataPages.date.sendKeys(string);
       }
    @When("kullanici start salary {string} girer")
    public void kullanici_start_salary_girer(String string) {
dataPages.salary.sendKeys(string);
    }
    @When("kullanici create butonuna tiklar")
    public void kullanici_create_butonuna_tiklar() {
dataPages.create.click();
    }
    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
    dataPages.search.sendKeys(string);
    }
    @When("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Assert.assertTrue(dataPages.name.getText().contains(string));
    }


    }



