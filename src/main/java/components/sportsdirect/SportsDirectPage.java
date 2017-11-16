package components.sportsdirect;

import core.framework.page.PageComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class SportsDirectPage extends PageComponent {
    private static final By SPORTS_DIRECT_PAGE_TITLE = By.cssSelector("#dnn_dnnLogo_hypSDLogo[title=\"Home page\"]");
    private static final By SPORTS_DIRECT_PAGE_HEADER_MENS = By.cssSelector("#topMenu a[href=\"/mens\"]");
    private static final By MAIN_MENU_ROOT_ELEMENT = By.cssSelector(".clsPopDropNav");
    private static final String MENU_ITEM = "#idPopDropNav ";
    private static FluentWait<WebDriver> wait;

    public SportsDirectPage (WebDriver driver){super(driver); }

    @Override
    public void verify() {
        waitForPageElementPresent(SPORTS_DIRECT_PAGE_TITLE, "Error, sportsdirect.com page not loaded");
    }

   public SportsDirectPage openMensSection(){
       Actions actions = new Actions(driver);
       WebElement element = driver.findElement(SPORTS_DIRECT_PAGE_HEADER_MENS);
       actions.doubleClick(element).perform();
        return this;
   }

    public SportsDirectPage expandFootwear(){
        driver.findElement(By.cssSelector(".menu-item[href=\"#footwear\"]")).click();
        return this;
    }

    public ShoesPage selectShoes(){
        driver.findElement(By.cssSelector("#footwear a[href=\"/outdoor-footwear/mens-outdoor-footwear/mens-walking-boots?promo_name=mens-lp\"]")).click();
        return new ShoesPage(driver);
    }



}
