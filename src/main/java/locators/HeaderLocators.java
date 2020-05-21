package locators;

import org.openqa.selenium.By;

public class HeaderLocators {

   public By createNewButton =    By.xpath("//details[@class='details-overlay details-reset']//summary[@class='Header-link']");
   public By aboutProfileButton = By.xpath("//details[@class='details-overlay details-reset js-feature-preview-indicator-container']");
   public By settingsButton = By.xpath("//a[contains(text(),'Settings')]");
}
