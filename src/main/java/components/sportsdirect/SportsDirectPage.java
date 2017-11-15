package components.sportsdirect;

import components.sportsdirect.popup.AdvertPopUp;
import core.framework.page.PageComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SportsDirectPage extends PageComponent {
    private static final By ADVERT_POPUP = By.cssSelector("#advertPopup");
    private static final By SPORTS_DIRECT_PAGE_TITLE = By.cssSelector("#dnn_dnnLogo_hypSDLogo[title=\"Home page\"]");
    private static FluentWait<WebDriver> wait;

    public SportsDirectPage (WebDriver driver){super(driver); }

    @Override
    public void verify() {
        waitForPageElementPresent(SPORTS_DIRECT_PAGE_TITLE, "Error, sportsdirect.com page not loaded");
    }

    private boolean checkAdvertPopUpAppeared(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ADVERT_POPUP));
            System.out.println(true);
            return true;
        }catch (Throwable e){
            return false;
        }
    }

    public SportsDirectPage closeAdvertPopUp(){
        if(checkAdvertPopUpAppeared() == true){
            AdvertPopUp advertPopUp = new AdvertPopUp(driver);
            advertPopUp.clickClose();
            System.out.println("Pop up closed");
            return this;
        }else{
            return this;
        }
    }

}
