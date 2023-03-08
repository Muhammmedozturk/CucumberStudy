package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class DemoQAStepDefinitions {
DemoQaPage demoQaPage;
WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Given("kullanici demoqa sayfasina gider")
    public void kullanici_demoqa_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("demo_url"));
    }
    @Then("kullanici alerte tiklar")
    public void kullanici_alerte_tiklar() {
        demoQaPage=new DemoQaPage();
        demoQaPage.alert.click();
    }
    @Then("kullanici on button click alert will appear after bes seconds karsisindaki click me butonuna basar")
    public void kullanici_on_button_click_alert_will_appear_after_bes_seconds_karsisindaki_click_me_butonuna_basar() {
   demoQaPage.onButtonClick.click();
    }
    @Then("kullanici alertin gorunur olmasini bekler")
    public void kullanici_alertin_gorunur_olmasini_bekler() {
   wait.until(ExpectedConditions.alertIsPresent());
    }
    @Then("kullanici alert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder")
    public void kullanici_alert_uzerindeki_yazinin_this_alert_appeared_after_bes_seconds_oldugunu_test_eder() {
 String alertyazisi=Driver.getDriver().switchTo().alert().getText();
 String beklenenYazi="This alert appeared after 5 seconds";
        Assert.assertEquals(alertyazisi,beklenenYazi);
    }
    @Then("kullanici ok diyerek alerti kapatir")
    public void kullanici_ok_diyerek_alerti_kapatir() {
 Driver.getDriver().switchTo().alert().accept();
    }

    @When("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSayi) throws InterruptedException {
        Thread.sleep(istenenSayi*1000);

    }
}
