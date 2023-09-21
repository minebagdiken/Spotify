import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Methods extends DriverManager{
    private static final WebDriver driver = DriverManager.driver;
    private static final WebDriverWait webDriverWait = DriverManager.webDriverWait;

    public WebElement findElement(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by) {
        return webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by,String text) {
        findElement(by).sendKeys(text);
    }


    public void waitSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
