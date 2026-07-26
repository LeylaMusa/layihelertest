package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    WebDriver driver = new ChromeDriver();
    By productsButton = By.xpath("//a[@href='/products']");

    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public void clickProducts(){

        driver.findElement(productsButton).click();
    }
}
