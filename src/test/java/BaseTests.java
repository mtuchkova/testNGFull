import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class BaseTests {

    WebDriver driver;
    ElementsHelper elementsHelper;

    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        elementsHelper = new ElementsHelper(driver);

    }


//    @BeforeGroups(groups = "gitHubPages_tests")
//    @Parameters("browser")
//    public void setUp (Browsers browser){
//
//      //  switch (browser) {
//           // case CHROME:
//                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//                driver = new ChromeDriver();
//              //  break;
////            case FIREFOX:
////                WebDriverManager.firefoxdriver().setup();
////                driver = new FirefoxDriver();
////                break;
////            case OPERA:
////                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
////                driver = new OperaDriver();
////                break;
////            case EDGE:
////                EdgeDriverManager.getInstance(DriverManagerType.EDGE).setup();
////                driver = new EdgeDriver();
////                break;
//          //  default:
//         //       throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA', 'EDGE'");
//      //  }
//
//        driver.get("https://github.com/login");
//        driver.manage().window().maximize();
//
//    }

    @AfterGroups(groups = "gitHubPages_tests")
    public void SignOut () {

        driver.quit();
    }
}
//    @BeforeClass
//    public void login(){
//        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://github.com/login");
//    }

