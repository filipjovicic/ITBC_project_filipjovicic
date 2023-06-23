package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TextBoxTests extends BaseTest {

    @Test
    public void verifyUserCanSubmitValidInformation() {
        getTextBoxPage().open()
                .enterFullName(getFaker().name().fullName())
                .enterEmail(getFaker().internet().emailAddress())
                .enterCurrentAddress(getFaker().address().fullAddress())
                .enterPermanentAddress(getFaker().address().fullAddress())
                .clickSubmit();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getTextBoxPage().getSubmitField().getText().contains(getTextBoxPage().getFullNameField().getText()));
        Assert.assertTrue(getTextBoxPage().getSubmitField().getText().contains(getTextBoxPage().getEmailField().getText()));
        Assert.assertTrue(getTextBoxPage().getSubmitField().getText().contains(getTextBoxPage().getCurrentAddress().getText()));
        Assert.assertTrue(getTextBoxPage().getSubmitField().getText().contains(getTextBoxPage().getPermanentAddress().getText()));
    }

    @Test
    public void verifyUserCannotSubmitInvalidEmailInformation() {
        getTextBoxPage().open()
                .enterEmail(getFaker().funnyName().name())
                .clickSubmit();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getTextBoxPage().getEmailField().getAttribute("class").contains("error"));
    }

    @Test
    public void verifyUserCannotSubmitInvalidFullName(){
        getTextBoxPage().open()
                .enterFullName(getFaker().number().digit())
                .clickSubmit();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getTextBoxPage().getSubmitField().getText().contains(getTextBoxPage().getFullNameField().getText()));
    }








}
