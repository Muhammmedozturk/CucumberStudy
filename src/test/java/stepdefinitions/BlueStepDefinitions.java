package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BluePages;

public class BlueStepDefinitions {
BluePages bluePages=new BluePages();
        @When("kullanici login butonuna tiklar")
        public void kullanici_login_butonuna_tiklar() {
bluePages.loginButton.click();
        }
        @When("kullanici email {string} girer")
        public void kullanici_email_girer(String string) {
bluePages.email.sendKeys(string);
        }
        @When("kullanici password {string} girer")
        public void kullanici_password_girer(String string) {
bluePages.password.sendKeys(string);
        }

        @And("kullanici lgn basar")
        public void kullaniciLgnBasar() {
                bluePages.lgn.click();
        }

        @And("kullanıcı ismine tıkla")
        public void kullanıcıIsmineTıkla() {
                bluePages.cıkıs.click();
        }

        @And("kullanıcı logout tıklar")
        public void kullanıcıLogoutTıklar() {
                bluePages.logout.click();
        }

        @And("ok tıkla")
        public void okTıkla() {
                bluePages.ok.click();
        }
}

