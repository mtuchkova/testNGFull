package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsHelper {

    private WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresence(By element, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("WebElement in not presence " + element, e);
        }
    }

    public boolean isElementVisible(By element, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("WebElement in not visible " + element, e);
        }
    }

    public boolean isElementClickable(By element, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("WebElement in not clickable " + element, e);
        }
    }

    public boolean clickOnVisibelAndClicabkleElement(By element, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("WebElement in not clickable " + element, e);
        }
    }

    public boolean textInputField(By element, String text, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            driver.findElement(element).sendKeys(text);
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("WebElement in not clickable " + element, e);
        }
    }

}