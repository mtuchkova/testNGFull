package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public By loginField = By.cssSelector("#login_field");
    public By passwordField = By.cssSelector("#password");
    public By signInButton = By.cssSelector("[name=commit]");
}
