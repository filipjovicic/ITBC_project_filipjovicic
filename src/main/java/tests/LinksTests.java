package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LinksTests extends BaseTest {

    @Test
    public void verifyUserCanOpenALinkInANewTab(){
        getLinksPage().open()
                .clickSimpleLink();
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertCurrentUrl(getIndexPage().getIndexUrlValue());

    }

    @Test
    public void verifyLinkSendsCorrectStatusMessage(){
        getLinksPage().open()
                .clickNotFoundLink();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(getLinksPage().getLinkResponse().getText().contains(getLinksPage().getLinkResponseValue()));
    }

}
