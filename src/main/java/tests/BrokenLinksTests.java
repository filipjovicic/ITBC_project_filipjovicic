package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinksTests extends BaseTest {

    @Test
    public void verifyUserNavigatesToABrokenLink(){
        getBrokenLinksPage().open()
                .clickBrokenLink();
        Assert.assertTrue(getBrokenLinksPage().getStatusCode().getText().contains(getBrokenLinksPage().getCodeValue()));
    }

    @Test
    public void verifyUserNavigatesToAValidLink(){
        getBrokenLinksPage().open()
                .clickValidLink();
        assertCurrentUrl(getIndexPage().getIndexUrlValue());
    }
}
