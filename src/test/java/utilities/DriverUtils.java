package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtils {
    public static WebDriver driver;

    public static void createDriver() {
//        switch (ConfigReader.getProperty("browser")) {
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            case "chrome":
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//                break;
//            default:
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       // driver.get(PropertyReader.getProperty("app.baseurl"));

    }


    public static WebDriver getDriver() {
        return driver;
    }
}
