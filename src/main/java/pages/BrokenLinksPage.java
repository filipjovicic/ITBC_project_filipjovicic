package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksPage extends BasePage {

    private WebElement brokenLink;

    private WebElement statusCode;
    private String codeValue;
    private WebElement validLink;

    public BrokenLinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getBrokenLink(){
        brokenLink = getDriver().findElement(By.xpath("//a[contains(text(), 'Broken Link')]"));
        return brokenLink;
    }

    public WebElement getStatusCode(){
        statusCode = getDriver().findElement(By.id("content"));
        return statusCode;
    }
    public String getCodeValue(){
        codeValue = "500";
        return codeValue;
    }
    public WebElement getValidLink(){
        validLink = getDriver().findElement(By.xpath("//a[contains(text(), 'Click Here for Valid Link')]"));
        return validLink;
    }

    public BrokenLinksPage open(){
        getDriver().get("https://demoqa.com/broken");
        return this;
    }
    public BrokenLinksPage clickBrokenLink(){
        getBrokenLink().click();
        return this;
    }
    public BrokenLinksPage clickValidLink(){
        getValidLink().click();
        return this;
    }


}
