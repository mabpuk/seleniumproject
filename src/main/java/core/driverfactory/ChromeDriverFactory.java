package core.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements WebDriverFactory {

    public WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", getClass().getClassLoader().getResource("drivers/chromedriver.exe").getPath());
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
