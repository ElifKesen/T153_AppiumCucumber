package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AileButcemStepDef {
    AileButcemPage page=new AileButcemPage();

    @Given("Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        page.ilkEkranAyarlari();

    }
    @When("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String mail, String password, String GirişYap) throws InterruptedException {
        Thread.sleep(2000);
        page.emailKutusu.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(2000);
        page.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
        Thread.sleep(2000);
        page.girisYapButonu.click();
    }
    @Then("Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() throws InterruptedException {
        Thread.sleep(2000);
       Assert.assertTrue(page.girisYazisiDogrulama.isDisplayed());
    }
    @Given("Sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String IlgiliBolum) throws InterruptedException {
        Thread.sleep(3000);
        page.hamburgerMenu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(IlgiliBolum);
    }
    @When("Hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} ve cinsiyet {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_ve_cinsiyet_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String isim, String soyisim, String sehir, String yas, String meslek, String cinsiyet) throws InterruptedException {
        page.bilgileriYazmaMethodu(isim,soyisim,sehir,yas,meslek,cinsiyet);
        Thread.sleep(5000);
        page.bilgileriDogrulamaMethodu(isim,soyisim,sehir,yas,meslek,cinsiyet);
        Thread.sleep(3000);
        page.kaydetbutonu.click();
    }

    @Then("Uygulamayi kapatir")
    public void uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

    @Then("Anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() {
        ReusableMethods.koordinatTiklamaMethodu(530,2030,500);
       // ReusableMethods.koordinatTiklamaMethodu(530,2150,500); gercek telefondaki y degeri
    }

    @Then("{string} Butonuna text uzerinden tiklayin")
    public void butonuna_text_uzerinden_tiklayin(String secenek) {
        ReusableMethods.scrollWithUiScrollableAndClick(secenek);
    }

    @Then("Gelir Ekle sayfasinda Gelir tipi {string} secin")
    public void gelir_ekle_sayfasinda_gelir_tipi_secin(String gelirtipi) throws InterruptedException {
        page.GelirTipiYazisi.click();
        Thread.sleep(2000);
        ReusableMethods.scrollWithUiScrollableAndClick(gelirtipi);
    }

    @Then("Gelir Ekle sayfasinda Kategori {string} secin")
    public void gelir_ekle_sayfasinda_kategori_secin(String kategoriAdi) throws InterruptedException {
        page.KategoriYazisi.click();
        Thread.sleep(2000);
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriAdi);
    }

    @Then("Gelir Ekle sayfasinda Tarih belirlemesi gun secimi {string} yapin")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_gun_secimi_yapin(String secilecekgun) throws InterruptedException {
        page.TarihButonu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(secilecekgun);
        ReusableMethods.scrollWithUiScrollableAndClick("OK");

        Thread.sleep(2000);
    }

    @Then("Gelir Ekle sayfasinda Tutar bilgisi {string} girin")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girin(String miktar) throws InterruptedException {
        page.TutarAlani.click();
        page.TutarAlani.sendKeys(miktar);
        Thread.sleep(2000);
    }

    @Then("Gelir Ekle sayfasinda aciklama kismina {string} degeri girin")
    public void gelir_ekle_sayfasinda_aciklama_kismina_degeri_girin(String aciklama) {
        page.AciklamaAlani.sendKeys(aciklama);
    }

    @Then("Basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {
       Assert.assertTrue(page.BasariliKayitYazisi.isDisplayed());


    }


}
