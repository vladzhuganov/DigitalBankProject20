package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.DriverUtils;
import utilities.PropertyReader;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "remember-me")
    public WebElement rememberMe;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[4]/p/a")
    public WebElement signUpHereBtn;

    public void openWebsite() {
        driver.get(PropertyReader.getProperty("app.baseurl"));

    }

    public void signUp() {
        signUpHereBtn.click();
    }

    public void doLogin(String username, String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        submitBtn.click();
    }

    public void verifyURL() {
        Assert.assertEquals("Url is not present", driver.getCurrentUrl(), PropertyReader.getProperty("app.baseurl"));
    }
    public void drpTitleSelect(){
        Select drpTitle = new Select(driver.findElement(By.xpath("//*[@id=\"title\"]/option[2]")));
    }

}