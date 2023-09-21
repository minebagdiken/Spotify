import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class LoginTests extends DriverManager{
    Methods methods = new Methods();

    @Test
    void spotifyTesti(){
        By oturumAc = By.cssSelector("[data-testid='login-button'] > .ButtonInner-sc-14ud5tc-0");
        By mailGir = By.id("login-username");
        By sifreGir = By.id("login-password");
        By girisYapButon = By.cssSelector(".ButtonInner-sc-14ud5tc-0");
        By eklemeButon = By.cssSelector("[aria-label='Çalma listesi veya klasör oluştur'] .Svg-sc-ytk21e-0");
        By yeniListeOlustur = By.cssSelector(".SboKmDrCTZng7t4EgNoM > li:nth-of-type(1) .Type__TypeElement-sc-goli3j-0");
        By adRenameBas = By.cssSelector(".dYGhLW");
        By adEkle = By.cssSelector("[placeholder='Ad ekle'");
        By adKaydet = By.cssSelector(".bABUvF");
        By sarkiAra = By.cssSelector("[placeholder='Şarkı veya bölüm ara']");
        By sarkiEkle = By.xpath("//button[@class='Button-sc-y0gtbx-0 dUWDDu']");




        methods.waitSeconds(2);
        methods.click(By.id("onetrust-close-btn-container"));

        methods.click(oturumAc);
        methods.sendKeys(mailGir,"bagdikenmine@gmail.com");
        methods.sendKeys(sifreGir, "Mine2001");
        methods.click(girisYapButon);
        methods.click(eklemeButon);
        methods.click(yeniListeOlustur);
        methods.click(adRenameBas);
        methods.sendKeys(adEkle,"MentorLabss Challenge");
        methods.click(adKaydet);
        methods.sendKeys(sarkiAra,"DaftPunk");
        methods.click(sarkiEkle);
        methods.waitSeconds(5);






    }
}
