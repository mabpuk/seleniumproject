package core.framework.page;

import components.sportsdirect.SportsDirectPage;
import org.openqa.selenium.WebDriver;

public class NavigationPromise {
    private WebDriver driver;

    public NavigationPromise (WebDriver driver){
        this.driver = driver;
    }

    public SportsDirectPage andGetSportsDirectPage(){
        return new SportsDirectPage(driver);
    }

}
