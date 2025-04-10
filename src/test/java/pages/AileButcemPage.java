package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    public void ilkEkranAyarlari() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i < 6; i++) {
            ReusableMethods.ekranKaydirmaMethodu(900,1200,500,130,1200);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement passwordKutusu;

    @FindBy(xpath = " (//*[@class='android.widget.TextView'])[2]")
    public MobileElement girisYapButonu;

}
