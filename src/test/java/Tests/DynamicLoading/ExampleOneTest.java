package Tests.DynamicLoading;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOneTest extends BaseTest {
    @Test
    public void exampleOneTest() {
        dynamicLoadingPage = homePage.clickOnDynamicLoadingPage();
        ex1 = dynamicLoadingPage.clickOnExample1Link();
        ex1.clickOnStartButton();
        Assert.assertTrue(ex1.loadingIndicatorIsDisplayed());
        Assert.assertTrue(ex1.expectedMessageIsDisplayed());
        
    }
}
