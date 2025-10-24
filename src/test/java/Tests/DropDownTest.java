package Tests;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {


    @Test
    public void ensureSelectByText() throws InterruptedException {
        dropdownPage = homePage.clickOnDropdown();
        dropdownPage.selectByText("Option 1");
        Thread.sleep(1000);
    }

    @Test
    public void ensureSelectByIndex(){
        homePage.clickOnDropdown();
        dropdownPage.selectByIndex(1);
    }
}
