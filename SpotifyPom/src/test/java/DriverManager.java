import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public  class DriverManager {
    public static WebDriver driver;
    protected static  WebDriverWait webDriverWait;

    @BeforeAll
    public static void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        webDriverWait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://open.spotify.com");

    }
    @AfterAll
    public static void end(){
        if(driver!= null){
            driver.quit();
        }
    }



}