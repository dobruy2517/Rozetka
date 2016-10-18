package SeleniunTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium12 {
    @Test
    public void searchForProduct() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://27.ua");
        driver.findElement(By.id("title-search-input")).sendKeys("Дюбель");
        driver.findElement(By.name("s")).click();
        String actualResults = driver.findElement(By.cssSelector(".product h3")).getText().toLowerCase();
        Assert.assertEquals(actualResults.contains("дюбель"), true);
        driver.quit();

    }
}
