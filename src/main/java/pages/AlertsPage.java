package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{

    private WebElement confirmButton;
    private WebElement confirmResult;
    private WebElement promptButton;
    private WebElement promptResult;
    private String okResult;
    private String cancelResult;

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getConfirmButton(){
        confirmButton = getDriver().findElement(By.id("confirmButton"));
        return confirmButton;
    }
    public WebElement getConfirmResult(){
        confirmResult = getDriver().findElement(By.id("confirmResult"));
        return confirmResult;
    }
    public WebElement getPromptButton(){
        promptButton = getDriver().findElement(By.id("promtButton"));
        return promptButton;
    }
    public WebElement getPromptResult(){
        promptResult = getDriver().findElement(By.id("promptResult"));
        return promptResult;
    }
    public String getOkResult(){
        okResult = "Ok";
        return okResult;
    }

    public String getCancelResult(){
        cancelResult = "Cancel";
        return cancelResult;
    }

    public AlertsPage open(){
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }

    public AlertsPage clickConfirmButton(){
        getConfirmButton().click();
        return this;
    }

    public AlertsPage alertAccept(){
        getDriver().switchTo().alert().accept();
        return this;
    }

    public AlertsPage clickPromptButton(){
        getPromptButton().click();
        return this;
    }

    public AlertsPage typeInAlert(String text){
        getDriver().switchTo().alert().sendKeys(text);
        return this;
    }
    public AlertsPage cancelAlert(){
        getDriver().switchTo().alert().dismiss();
        return this;
    }

}
