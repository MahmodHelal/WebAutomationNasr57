package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {
    @Test
    public void ensureAddAndDeleteFunc(){
        addRemovePage=homePage.clickOnAddRemovePage();
        addRemovePage.clickOnAddButton(5);
        addRemovePage.clickDelete(3);
        Assert.assertEquals(addRemovePage.getNumberOfDeleteButtons(),2);
    }
}
