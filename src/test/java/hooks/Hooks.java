package hooks;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    herbir senaryo yada senaryo outlineden önce veya sonra çalışmasını istediğim metodlarını içerir @befoe @after
    burda önemli olan raporlama işleminin ekran görüntüsüyle birlkte hooks yardımıyla yapılmasınıdır
     */
    @Before
    public void seUpScenarios() {
        System.out.println("before metodu");
    }

    @After
    public void tearDownScenarios(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] failedScereenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScereenShot, "image/png", "failed_scenario_");
            Driver.closeDriver();
        }
    }
}