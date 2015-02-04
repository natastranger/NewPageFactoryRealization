import Helpers.BasicConfiguration;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Admin on 28.01.2015.
 */
public class FBTest extends BasicConfiguration {

    @Test
    public void loginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.login();
        homePage.wallPost();
        Assert.assertTrue(driver.getPageSource().contains("ckjdfgjkl;dkg;"));
    }

}
