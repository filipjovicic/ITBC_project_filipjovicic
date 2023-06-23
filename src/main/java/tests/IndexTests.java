package tests;


import org.testng.annotations.Test;

public class IndexTests extends BaseTest {

    @Test
    public void verifyElementsCardTakesUserToCorrectUrl(){
        getIndexPage().open()
                .clickOnElementsCard();
        assertCurrentUrl(getIndexPage().getIndexUrlValue());
    }

    @Test
    public void verifyBookStoreCardTakesUserToCorrectUrl(){
        getIndexPage().open();
        scrollDown(400);
                getIndexPage().clickOnBookStoreCard();
        assertCurrentUrl(getIndexPage().getBookStoreUrlValue());
    }

}
