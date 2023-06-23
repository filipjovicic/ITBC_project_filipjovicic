package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DroppableTests extends BaseTest {

    @Test
    public void verifyUserCanDragAndDropAnElement(){
        getDroppablePage().open();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                moveObject(getDroppablePage().getDragMe(), getDroppablePage().getDropHere());
        Assert.assertTrue(getDroppablePage().getDropHere().getText().contains(getDroppablePage().getDropResponse()));
    }

    @Test
    public void verifyNotAcceptableDragItemIsNotAcceptedByDropField() {
        getDroppablePage().open()
                .clickOnAcceptTab();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        moveObject(getDroppablePage().getNotAcceptableElement(), getDroppablePage().getDropHereNot());
        Assert.assertFalse((getDroppablePage().getDropHereNot().getText().contains(getDroppablePage().getDropResponse())));
    }
}
