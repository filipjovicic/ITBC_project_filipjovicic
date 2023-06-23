package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxTests extends BaseTest {

    @Test
    public void verifyUserCanCheckABox(){
        getCheckBoxPage().open()
                .clickCheckBox();
        Assert.assertTrue(getCheckBoxPage().getResultText().isDisplayed());
    }

    @Test
    public void verifyUserCanCheckAllBoxes(){
        getCheckBoxPage().open()
                .clickExpandAllButton();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                getCheckBoxPage().clickHomeCheckBox();
        Assert.assertTrue(getCheckBoxPage().getResultText().isDisplayed());
    }

}
