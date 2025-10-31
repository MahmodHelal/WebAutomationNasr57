package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTest extends BaseTest {
    @Test
    public void jsAlertTest(){

        SoftAssert softAssert = new SoftAssert();

        alertPage = homePage.clickOnAlertsPage();
        alertPage.clickOnJsAlert();
        System.out.println("Alert Text is  :- "+ alertPage.getAlertMessage());
        softAssert.assertEquals(alertPage.getAlertMessage(),alertPage.expectedJsAlertMessage,"Actual result does not match expected result");
        alertPage.acceptAlert();
        System.out.println("Actual Result is  :- "+ alertPage.getActualResult());
        softAssert.assertEquals(alertPage.getActualResult(),alertPage.expectedJsAlertText,"Actual result does not match expected result");

        softAssert.assertAll();
    }

    @Test
    public void jsConfirmTest(){
        alertPage = homePage.clickOnAlertsPage();
        alertPage.clickOnJsConfirm();
        Assert.assertEquals(alertPage.getActualResult(),alertPage.expectedJsConfirmText,"Actual result does not match expected result");
    }

    @Test
    public void jsDismissTest(){
        alertPage = homePage.clickOnAlertsPage();
        alertPage.clickOnJsConfirm();
        alertPage.dismissAlert();
        Assert.assertEquals(alertPage.getActualResult(),alertPage.expectedJsDismissText,"Actual result does not match expected result");
    }

    @Test
    public void jsPromptTest(){
        SoftAssert softAssert = new SoftAssert();
        alertPage = homePage.clickOnAlertsPage();
        alertPage.clickOnJsPrompt();
        alertPage.sendKeysToAlert("wrongValue");
        softAssert.assertTrue(alertPage.getActualResult().contains("wrongValue"),"Actual result does not match expected result");
    }
}
