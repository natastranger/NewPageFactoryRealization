package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 28.01.2015.
 */
public class BasicConfiguration {
    public static final String BASE_URL="https://www.facebook.com/";
   public WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeSuit(){
        driver.get(BASE_URL);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
            }

    @AfterTest
    public void afterSuit(){
        driver.quit();
    }

}
