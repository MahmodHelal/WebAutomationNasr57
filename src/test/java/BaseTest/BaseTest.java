package BaseTest;

import Pages.*;
import Pages.Alerts.AlertPage;
import Pages.ContextMenu.ContextMenuPage;
import Pages.DragAndDrop.DragAndDropPage;
import Pages.DynamicLoading.DynamicLoadingPage;
import Pages.DynamicLoading.Examples.Ex1;
import Pages.Form.FormPage;
import Pages.Form.SecureArea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;


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
    protected AlertPage alertPage;
    protected ContextMenuPage contextMenuPage;
    protected DragAndDropPage dragAndDropPage;
/*
    @BeforeClass
    public void setup(){
//        WebDriverManager.chromedriver().setup();
        DriverFactory.setDriver(new FirefoxDriver());
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goToFormPage(){
        DriverFactory.setDriver(driver);
        DriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
    }*/


/*
    @AfterClass
    public void tearDown(){
        DriverFactory.removeDriver();
    }
*/


    @BeforeMethod
    public void setUp() {
        WebDriver d = new FirefoxDriver();            // new driver per method
        DriverFactory.setDriver(d);                         // bind to this thread
        d.manage().window().maximize();
        d.get("https://the-internet.herokuapp.com/"); // open home
        homePage = new HomePage(d);                   // page per driver
    }

/*    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.removeDriver();                         // clean this thread's driver
    }*/
}
