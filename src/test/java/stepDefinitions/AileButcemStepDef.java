package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AileButcemPage;
import utilities.ConfigReader;

public class AileButcemStepDef {
    AileButcemPage page=new AileButcemPage();

    @Given("Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        page.ilkEkranAyarlari();

    }
    @When("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String mail, String password, String GirişYap) throws InterruptedException {
        page.emailKutusu.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(2000);
        page.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
        Thread.sleep(2000);
        page.girisYapButonu.click();


    }
    @Then("Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {


    }
    @Given("Sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String string) {

    }
    @When("Hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} ve cinsiyet {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_ve_cinsiyet_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String string, String string2, String string3, String string4, String string5, String string6) {

    }
    @Then("Uygulamayi kapatir")
    public void uygulamayi_kapatir() {

    }

}
