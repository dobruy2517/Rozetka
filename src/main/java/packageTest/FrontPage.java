package packageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrontPage {
    WebDriver driver;
    private By searchField = By.id("title-search-input");
    private By searchButton = By.name("s");
    private By element = By.cssSelector(".product h3");

    public FrontPage() {
    }

    public FrontPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://27.ua");
    }

    public void enterSearchWord(String searchWord) {
        driver.findElement(searchField).sendKeys(searchWord);
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public String element(){
       return driver.findElement(element).getText().toLowerCase();
    }

}
