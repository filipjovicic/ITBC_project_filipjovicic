package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IndexPage extends BasePage{

    private WebElement headerImg;
    private WebElement elementsCard;
    private String indexUrlValue;
    private WebElement bookStoreCard;
    private String bookStoreUrlValue;


    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHeaderImg(){
        headerImg = getDriver().findElement(By.cssSelector("#app > div > div > div.home-banner > a > img"));
        return headerImg;
    }
    public WebElement getElementsCard(){
        elementsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Elements')]"));
        return elementsCard;
    }
    public String getIndexUrlValue(){
        indexUrlValue = "https://demoqa.com/";
        return indexUrlValue;
    }

    public WebElement getBookStoreCard(){
        bookStoreCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Book Store Application')]"));
        return bookStoreCard;
    }
    public String getBookStoreUrlValue(){
        bookStoreUrlValue = "https://demoqa.com/books";
        return bookStoreUrlValue;
    }

    public IndexPage open(){
        getDriver().get("https://demoqa.com/");
        return this;
    }
    public IndexPage clickOnElementsCard(){
        getElementsCard().click();
        return this;
    }
    public IndexPage clickOnBookStoreCard(){
        getBookStoreCard().click();
        return this;
    }


}
