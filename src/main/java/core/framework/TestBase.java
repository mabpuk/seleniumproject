package core.framework;


import core.Configuration;
import core.driverfactory.ChromeDriverFactory;
import core.driverfactory.FirefoxDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {
        this.driver = getDriver();
        this.driver.manage().window().maximize();
    }

    private WebDriver getDriver() {
        String driverName = Configuration.get().getDriverName();
        if (driver == null) {
            switch (driverName) {
                case "firefox":
                    return new FirefoxDriverFactory().getWebDriver();
                case "chrome":
                    return new ChromeDriverFactory().getWebDriver();
            }
        } else {
            return driver;
        }
        throw new IllegalStateException("No driver found with name " + driverName);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
