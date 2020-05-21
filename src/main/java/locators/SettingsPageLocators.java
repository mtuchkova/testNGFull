package locators;

import org.openqa.selenium.By;

public class SettingsPageLocators {

    public By nameField = By.xpath("input[@id=\"user_profile_name\"]");
    public By profileImage = By.xpath("form[aria-label=\"Profile picture\"]");
    public By privateContributionsCheckBox = By.xpath("//input[@id='user_show_private_contribution_count']");
    public By updateProfileButton = By.xpath("//button[contains(text(),'Update profile')]");
    public By availableForHireCheckBox = By.xpath("//input[@id='user_profile_hireable']");



}
