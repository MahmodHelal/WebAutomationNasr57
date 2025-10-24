package Tests;

import Pages.CheckBoxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTest.BaseTest;



public class CheckBoxTest extends BaseTest {

    @Test
    public void verifyThatSecondOneIsSelected(){

        checkBoxesPage = homePage.clickOnCheckBoxes();
        Assert.assertTrue(checkBoxesPage.checkboxTwoIsSelected());
    }

    @Test
    public void verifyThatFirstOneIsSelected(){
        checkBoxesPage = homePage.clickOnCheckBoxes();
        Assert.assertFalse(checkBoxesPage.checkboxOneIsSelected());
        checkBoxesPage.clickOnCheckBoxOne();
        Assert.assertTrue(checkBoxesPage.checkboxOneIsSelected());
    }
}
