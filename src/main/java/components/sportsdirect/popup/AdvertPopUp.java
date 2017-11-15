package components.sportsdirect.popup;

import core.framework.page.PageComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertPopUp extends PageComponent{

    private static final By POPUP_ROOT_ELEMENT = By.cssSelector("#advertPopup");
    private static final By BTN_CLOSE = By.cssSelector("#advertPopup .close");


    public AdvertPopUp (WebDriver driver) {super(driver);}


    @Override
    public void verify() {
      waitForPageElementPresent(POPUP_ROOT_ELEMENT, "Error, pop up not loaded");
    }

    private WebElement getRootElement(){
        return driver.findElement(POPUP_ROOT_ELEMENT);}

    public void clickClose(){
        getRootElement().findElement(BTN_CLOSE).click();}

}
