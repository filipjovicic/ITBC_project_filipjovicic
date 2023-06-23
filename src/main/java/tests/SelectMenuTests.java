package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectMenuTests extends BaseTest {


    @Test
    public void verifyCorrectValueIsSelected(){
        getSelectMenuPage().open()
                .clickOnSelectMenu()
                .clickOnSelected();
        Assert.assertTrue(getSelectMenuPage().getSelectValue().getText().contains(getSelectMenuPage().getSelectedStringValue()));
    }
}
