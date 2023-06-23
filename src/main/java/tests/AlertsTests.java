package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest{

    @Test
    public void verifyUserCanAcceptPromptInAlertBox(){
        getAlertsPage().open()
                .clickConfirmButton()
                .alertAccept();
        Assert.assertTrue(getAlertsPage().getConfirmResult().isDisplayed());
        Assert.assertTrue(getAlertsPage().getConfirmResult().getText().contains(getAlertsPage().getOkResult()));
    }

    @Test
    public void verifyUserCanEnterNameIntoAlertBox(){
        getAlertsPage().open()
                .clickPromptButton()
                .typeInAlert(getFaker().funnyName().name())
                .alertAccept();
        Assert.assertTrue(getAlertsPage().getPromptResult().isDisplayed());
    }

    @Test
    public void verifyUserCanCancelPromptInAlertBox(){
        getAlertsPage().open()
                .clickConfirmButton()
                .cancelAlert();
        Assert.assertTrue(getAlertsPage().getConfirmResult().isDisplayed());
        Assert.assertTrue(getAlertsPage().getConfirmResult().getText().contains(getAlertsPage().getCancelResult()));
    }

}
