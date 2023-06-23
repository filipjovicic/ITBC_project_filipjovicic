package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {

    private WebElement doubleClickButton;
    private WebElement rightClickMe;
    private WebElement clickMe;
    private WebElement doubleClickMessage;
    private WebElement rightClickMessage;
    private WebElement clickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickButton(){
        doubleClickButton = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickButton;
    }

    public WebElement getRightClickMe(){
        rightClickMe = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMe;
    }
    public WebElement getClickMe(){
        clickMe = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']/following::button[1]"));
        return clickMe;
    }
    public WebElement getDoubleClickMessage(){
        doubleClickMessage = getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMessage;
    }
    public  WebElement getRightClickMessage(){
        rightClickMessage = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }

    public WebElement getClickMessage(){
        clickMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return clickMessage;
    }

    public ButtonsPage open(){
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }





}
