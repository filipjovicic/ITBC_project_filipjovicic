package tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ButtonsTests extends BaseTest {

    @Test
    public void verifyUserCanDoubleClickTheDoubleClickMeButton(){
        getButtonsPage().open();
        doubleClick(getButtonsPage().getDoubleClickButton());
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void verifyUserCanRightClickButton(){
        getButtonsPage().open();
        rightClick(getButtonsPage().getRightClickMe());
        Assert.assertTrue(getButtonsPage().getRightClickMessage().isDisplayed());
    }

    @Test
    public void verifyUserCanClickButton(){
        getButtonsPage().open();
        clickButton(getButtonsPage().getClickMe());
        Assert.assertTrue(getButtonsPage().getClickMessage().isDisplayed());
    }



}
