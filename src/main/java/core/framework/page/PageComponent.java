package core.framework.page;

import core.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public abstract class PageComponent implements IPageComponent {

    protected WebDriver driver;
    private FluentWait<WebDriver> wait;

    public PageComponent (WebDriver driver){
        this.driver = driver;
        verify();
    }

    public FluentWait<WebDriver> getWait(){
        return wait = new FluentWait<>(driver)
                .withTimeout(Configuration.getSeleniumWebDriverWait(), TimeUnit.SECONDS)
                .ignoring(StaleElementReferenceException.class, NoSuchElementException.class);
    }

    //click element by
    protected void click(By by){
        getWait().until(elementToBeClickable(by)).click();
    }


    protected String getText(By by){
        return getElement(by).getText();
    }

    protected void setText(By by, String value){
        //return setText(getElement(by), value);
    }

    protected WebElement getElement (By by){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
