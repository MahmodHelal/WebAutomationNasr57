package BaseTest;

import Pages.*;
import Pages.DynamicLoading.DynamicLoadingPage;
import Pages.DynamicLoading.Examples.Ex1;
import Pages.Form.FormPage;
import Pages.Form.SecureArea;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected HomePage homePage;
    protected  WebDriver driver;
    protected FormPage formPage;
    protected SecureArea secureArea;
    protected CheckBoxesPage checkBoxesPage;
    protected AddRemovePage addRemovePage;
    protected DropdownPage dropdownPage;
    protected DynamicLoadingPage dynamicLoadingPage;
    protected Ex1 ex1;

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
