package core.framework.page;

import org.openqa.selenium.WebDriver;

public class Navigation {

    private static final String SPORTS_DIRECT_URL = "https://www.sportsdirect.com";

    private static void openPage(WebDriver driver, String url){
        driver.get(url);
    }

    public static NavigationPromise openSportsDirectPage(WebDriver driver){
        openPage(driver, SPORTS_DIRECT_URL);
        return new NavigationPromise(driver);
    }

}
