package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BluePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
    BluePages bluePages;
    ExcelUtils excelUtils;
    List<Map<String,String>>exceldatalari;

    @Given("kullanıcı \"customer_info\"bilgileri ile giriş yapar")
    public void kullanıcı_customer_info_bilgileri_ile_giriş_yapar() {
String path="./src/test/resources/testdata/mysmoketestdata.xlsx";
String sayfa="customer_info";
excelUtils=new ExcelUtils(path, sayfa);
exceldatalari=excelUtils.getDataList();

for (Map<String,String>data:exceldatalari){
    Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    bluePages=new BluePages();
    bluePages.loginButton.click();
    bluePages.email.sendKeys(data.get("username"));
    bluePages.password.sendKeys(data.get("password"));
    bluePages.lgn.click();
}

    }
}
