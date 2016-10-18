package SeleniunTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.findElement(By.name("goods_list"));
        String actualResult = driver.findElement(By.xpath("//*[@id=\"block_with_goods\"]/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[4]/a")).getText();
        Assert.assertEquals(actualResult.contains("Samsung"), true);
        driver.quit();
    }
}
