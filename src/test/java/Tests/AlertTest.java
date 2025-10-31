package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
@Test
public void testAlert() {
    alertPage = homePage.clickOnAlertsPage();
    alertPage.clickJsAlert();
    Assert.assertTrue(alertPage.getAlertText().contains(alertPage.getExpectedText()));
    alertPage.acceptAlert();
    Assert.assertTrue(alertPage.getResultText().contains(alertPage.getExpectedResultJSAlert()));


    alertPage.clickJsConfirm();
    Assert.assertTrue(alertPage.getAlertText().contains(alertPage.getExpectedTextConfirm()));
    alertPage.dismissAlert();
    Assert.assertTrue(alertPage.getResultText().contains(alertPage.getExpectedResultJSConfirm()));


    alertPage.clickJsPrompt();
    Assert.assertTrue(alertPage.getAlertText().contains(alertPage.getExpectedTextPrompt()));
    alertPage.sendKeysAlert("Hello Iam Helal");
    alertPage.acceptAlert();
    Assert.assertEquals(alertPage.getResultText(), "You entered: Hello Iam Helal");
}
}
