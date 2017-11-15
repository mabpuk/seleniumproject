package core.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverFactory implements WebDriverFactory {
    public WebDriver getWebDriver() {
        System.setProperty("webdriver.gecko.driver", getClass().getClassLoader().getResource("drivers/geckodriver.exe").getPath());
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
