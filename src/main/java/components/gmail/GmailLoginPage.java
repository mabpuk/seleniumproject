package components.gmail;

import core.framework.page.PageComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPage extends PageComponent {

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void verify() {
        driver.findElement(By.cssSelector("#logo[title=\"Google\"]")).isDisplayed();
    }
}
