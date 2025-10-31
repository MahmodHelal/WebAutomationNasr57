package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropTest()  {
     dragAndDropPage = homePage.clickOnDragAndDrop();
     dragAndDropPage.dragAtoB();
     Assert.assertEquals(dragAndDropPage.getFirstHeader(), "B");
     dragAndDropPage.dragBtoA();
     Assert.assertEquals(dragAndDropPage.getSecondHeader(), "A");
    }
}
