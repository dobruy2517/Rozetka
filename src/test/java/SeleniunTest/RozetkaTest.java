package SeleniunTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RozetkaTest {

    @Test
    public void goTo() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.cssSelector("a[data-title=\"Смартфоны\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.name("goods_list"));
        List<WebElement> actualResult = driver.findElements(By.cssSelector("div[name=\"promotions_catalog_tile\"]+div>a"));
        for (WebElement i : actualResult) {
            System.out.println(i.getText());
        }
//        Assert.assertEquals(actualResult.contains("Samsung"), true);
        driver.quit();
    }
}
