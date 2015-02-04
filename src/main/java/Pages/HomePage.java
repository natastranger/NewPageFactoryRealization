package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 28.01.2015.
 */
public class HomePage {
    public WebDriver driver;

    @FindBy(id = "email")
    private WebElement user;

    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(id = "u_0_n")
    private WebElement submitButton;

    @FindBy(css = ".uiTextareaAutogrow.input.autofocus.mentionsTextarea.textInput")
    private WebElement textArea;

    @FindBy(className = "_42ft _4jy0 _11b _4jy3 _4jy1 selected _51sy")
    private WebElement postButtonHelper;

    @FindBy(linkText = "Post")
    private WebElement postButton;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        user.sendKeys("natastranger@rambler.ru");
        pass.sendKeys("Rfcnfkbz2013");
        submitButton.click();
    }

    public void wallPost() {
        textArea.sendKeys("ckjdfgjkl;dkg;");
        postButtonHelper.getLocation();
        postButtonHelper.click();

    }

}
