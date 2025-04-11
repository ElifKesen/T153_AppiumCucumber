package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {

    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

    }
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));

    }
    @Then("Arama kutusunun oldugunu dogrular")
    public void arama_kutusunun_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='searchBoxMobile-LcFBew99VnEBicYKIF5Q']").isDisplayed());
        Thread.sleep(5000);

      BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='sf-DownloadAppIcon-HqDeeweXhmgtqbV9yykK']").click();

    }

}
