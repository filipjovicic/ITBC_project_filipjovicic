package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RadioButtonTests extends BaseTest {

    @Test
    public void verifyUserCanSelectYesOption(){
        getRadioButtonPage().open()
                .clickYes();
        Assert.assertTrue(getRadioButtonPage().getResultRadio().getText().contains(getRadioButtonPage().getYesRadioBtnValue()));

    }

    @Test
    public void verifyUserCanSelectImpressiveOption(){
        getRadioButtonPage().open()
                .clickImpressive();
        Assert.assertTrue(getRadioButtonPage().getResultRadio().getText().contains(getRadioButtonPage().getImpressiveRadioBtnValue()));

    }

    @Test
    public void verifyUserCannotSelectNoOption(){
        getRadioButtonPage().open()
                .clickNo();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertFalse(getRadioButtonPage().getContentArea().getText().contains(getRadioButtonPage().getNoRadioBtnValue()));
    }

}
