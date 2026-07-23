import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterUser {
    WebDriver driver;
    @Before
public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void RegisterUser(){
        driver.get("http://automationexercise.com");
        String homeTitle=driver.getTitle();
        Assert.assertNotNull(homeTitle);
        Assert.assertEquals("Automation Exercise", homeTitle);
    }


}
