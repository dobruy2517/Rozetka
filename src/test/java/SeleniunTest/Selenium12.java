package SeleniunTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import packageTest.FrontPage;

import java.util.concurrent.TimeUnit;

public class Selenium12 {
    static WebDriver driver;

    @Before
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void postCondition() {
        driver.quit();
    }

    @Test
    public void searchForProduct() {
        FrontPage frontPage = new FrontPage(driver);
        frontPage.open();
        frontPage.enterSearchWord("Дюбель");
        frontPage.clickSearchButton();
        String actualResult = frontPage.element();
        Assert.assertEquals(actualResult.contains("дюбель"), true);


    }
}
