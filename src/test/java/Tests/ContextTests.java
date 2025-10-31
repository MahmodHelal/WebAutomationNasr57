package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContextTests extends BaseTest {
    @Test
    public void contextMenuTest(){
        contextMenuPage = homePage.clickOnContextMenu();
        contextMenuPage.clickContextMenu();
        Assert.assertEquals(contextMenuPage.getAlertText(), contextMenuPage.getExpectedText());
        contextMenuPage.acceptAlert();
    }
}
