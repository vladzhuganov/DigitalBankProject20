package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[1]/label/strong")
    public WebElement titleText;
    @FindBy(id = "title")
    public WebElement titleRegistrationField;

    @FindBy(id = "firstName")
    public WebElement firstNameRegistrationField;

    @FindBy(id = "lastName")
    public WebElement lastNameRegistrationField;

    @FindBy(xpath = "//input[@value = 'M']")
    public WebElement genderMaleRegistrationField;

    @FindBy(xpath = "//input[@value = 'F']")
    public WebElement genderFemaleRegistrationField;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dobRegistrationField;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnRegistrationField;

    @FindBy(xpath = "//input[@id='emailAddress']")
    public WebElement emailAddressRegistrationField;
    @FindBy(id = "password")
    public WebElement passwordRegistrationField;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordRegistrationField;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    public WebElement nextButton;

    public boolean verifyTitleRegistrationPage() {

        return titleText.isDisplayed();
    }


    public void fillOutStandardInfo() {
        titleRegistrationField.sendKeys("Mr.");
        firstNameRegistrationField.sendKeys("John");
        lastNameRegistrationField.sendKeys("Green");
        genderMaleRegistrationField.click();
        dobRegistrationField.sendKeys("01/12/1983");
        ssnRegistrationField.sendKeys("123-45-6789");
        emailAddressRegistrationField.sendKeys("johngreen@fake.com");
        passwordRegistrationField.sendKeys("Demo1234");
        confirmPasswordRegistrationField.sendKeys("Demo1234");
        nextButton.click();

    }

}
