package BaseTest;

import Pages.CheckBoxesPage;
import Pages.FormPage;
import Pages.HomePage;
import Pages.SecureArea;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected HomePage homePage;
    protected  WebDriver driver;
    protected FormPage formPage;
    protected SecureArea secureArea;
    protected CheckBoxesPage checkBoxesPage;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goToFormPage(){
        driver.get("https://the-internet.herokuapp.com/");
    }


/*    @AfterClass
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }*/

}
