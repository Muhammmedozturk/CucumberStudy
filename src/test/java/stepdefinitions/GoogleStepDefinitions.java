package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePage googlePage=new GooglePage();
    @Given("kullanici google gider")
    public void kullanici_google_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @When("kullanici iphone için arama yapar")
    public void kullanici_iphone_için_arama_yapar() {
googlePage.searchBox.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("apple"));
    }
    @Then("close the application")
    public void close_the_application() {
        // Write code here that turns the phrase above into concrete actions
       Driver.closeDriver();
    }
    @When("kullanici tesla için arama yapar")
    public void kullanici_tesla_için_arama_yapar() {
    googlePage.searchBox.sendKeys("tesla",Keys.ENTER);
    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclarda_tesla_oldugunu_dogrular() {
       Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }
    @When("kullanici {string} için arama yapar")
    public void kullanici_için_arama_yapar(String string) {
        googlePage.searchBox.sendKeys(string,Keys.ENTER);
    }
    @Then("sonuclarda {string} oldugunu dogrular")
    public void sonuclarda_oldugunu_dogrular(String string) {
   Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
    }

    @Then("kullanıcı {string} için arama yapar")
    public void kullanıcıIçinAramaYapar(String string) {
googlePage.amazonSeaarch.sendKeys(string);
    }

    @And("sayfa baslıgının {string} içerdiğini test eder")
    public void sayfaBaslıgınınIçerdiğiniTestEder(String string) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));

    }
}
