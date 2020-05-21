import locators.HeaderLocators;
import locators.LoginPageLocators;
import locators.MainPageLocators;
import locators.SettingsPageLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTests {


    LoginPageLocators loginPageLocators = new LoginPageLocators();
    MainPageLocators mainPageLocators = new MainPageLocators();
    HeaderLocators headerLocators = new HeaderLocators();
    SettingsPageLocators settingsPageLocators = new SettingsPageLocators();


    @Test(priority = 1, groups = "gitHubPages_tests")
    public void login() {

        elementsHelper.textInputField(loginPageLocators.loginField, "mtuchkova", 5);
        elementsHelper.textInputField(loginPageLocators.passwordField, "6a7b8c6a7b8c", 5);
        elementsHelper.clickOnVisibelAndClicabkleElement(loginPageLocators.signInButton, 5);
        Assert.assertTrue(driver.findElement(mainPageLocators.pullRequestsButton).isDisplayed(), "Pull requests button should be present");
        Assert.assertTrue(driver.findElement(mainPageLocators.issuesButton).isDisplayed(), "issuesButton should be present");

    }

//    @Test(dataProvider = "Data-Provider-Function")
//    public void parameterIntTest(Class clzz, String[] number) {
//        System.out.println("Parameterized Number is : " + number[0]);
//        System.out.println("Parameterized Number is : " + number[1]);
//    }
//
//    //This function will provide the patameter data
//    @DataProvider(name = "Data-Provider-Function")
//    public Object[][] parameterIntTestProvider() {
//        return new Object[][]{
//                {Vector.class, new String[] {"java.util.AbstractList",
//                        "java.util.AbstractCollection"}},
//                {String.class, new String[] {"1", "2"}},
//                {Integer.class, new String[] {"1", "2"}}
//        };
//    }



    @Test
    public void checkHeaderTabs(){

    }


    @Test(priority = 2, groups = "gitHubPages_tests")
    public void settingsPageTest() {

        elementsHelper.clickOnVisibelAndClicabkleElement(headerLocators.aboutProfileButton,5);
        elementsHelper.clickOnVisibelAndClicabkleElement(headerLocators.settingsButton,5);

        elementsHelper.isElementClickable(settingsPageLocators.privateContributionsCheckBox,5);
        elementsHelper.isElementClickable(settingsPageLocators.updateProfileButton,5);
        elementsHelper.isElementClickable(settingsPageLocators.availableForHireCheckBox,5);
        //elementsHelper.textInputField(settingsPageLocators.nameField,"fjdfhfdh",25);

        //elementsHelper.isElementVisible(settingsPageLocators.profileImage,5);
    }
}
