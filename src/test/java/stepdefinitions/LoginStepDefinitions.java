package stepdefinitions;

import io.cucumber.java.en.When;
import pages.BluePages;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    @When("kullanici email ve sifresini girer")
    public void kullanici_email_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        BluePages bluePages=new BluePages();
//    List<String> musteriBilgisi=dataTable.row(1);
//        System.out.println(musteriBilgisi.get(0));
//        System.out.println(musteriBilgisi.get(1));
//        bluePages.email.sendKeys(musteriBilgisi.get(0));
//        bluePages.password.sendKeys(musteriBilgisi.get(1));
//        bluePages.lgn.click();
        //2. yol
        List<Map<String,String>>musteriBilgisi=dataTable.asMaps(String.class,String.class);
        for(Map<String,String> musteri:musteriBilgisi){
            bluePages.email.sendKeys(musteri.get("email"));
            bluePages.password.sendKeys(musteri.get("password"));
            bluePages.lgn.click();
        }
    }
}
