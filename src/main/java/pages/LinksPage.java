package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LinksPage extends BasePage {

    private WebElement simpleLink;
    private WebElement notFoundLink;
    private WebElement linkResponse;
    private String linkResponseValue;





    public LinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSimpleLink(){
        simpleLink = getDriver().findElement(By.id("simpleLink"));
        return simpleLink;
    }

    public WebElement getNotFoundLink(){
        notFoundLink = getDriver().findElement(By.id("invalid-url"));
        return notFoundLink;
    }

    public WebElement getLinkResponse(){
        linkResponse = getDriver().findElement(By.id("linkResponse"));
        return linkResponse;
    }
    public String getLinkResponseValue(){
        linkResponseValue = "404";
        return linkResponseValue;
    }

    public LinksPage open(){
        getDriver().get("https://demoqa.com/links");
        return this;
    }

    public LinksPage clickSimpleLink(){
        getSimpleLink().click();
        return this;
    }

    public LinksPage currentUrl(){
        getDriver().getCurrentUrl();
        return this;
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

    public LinksPage clickNotFoundLink(){
        getNotFoundLink().click();
        return this;
    }


}
