package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductsPage {

    WebDriver driver;

    By searchInput=By.id("search_product");
    By searchButton=By.id("submit_search");
    By searchedProducts=By.xpath("//h2[text()='Searched Products']");
    By allProducts=By.xpath("//h2[text()='All Products']");
    By products = By.cssSelector(".overlay-content p");

    public ProductsPage(WebDriver driver){
        this.driver= driver;
    }
    public boolean isAllProductsVisible(){

        return driver.findElement(allProducts).isDisplayed();
    }
    public void searchProducts(String product){
        driver.findElement(searchInput).sendKeys(product);
        driver.findElement(searchButton).click();
    }
    public boolean isSearchedProductsVisible(){

        return driver.findElement(searchedProducts).isDisplayed();
    }
    public boolean verifyProducts(String keyword)();

}
