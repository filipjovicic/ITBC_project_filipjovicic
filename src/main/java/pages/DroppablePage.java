package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroppablePage extends BasePage {

    private WebElement dragMe;
    private WebElement dropHere;
    private WebElement acceptTab;
    private WebElement notAcceptableElement;
    private WebElement dropHereNot;
    private String dropResponse;

    public DroppablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getDragMe(){
        dragMe = getDriver().findElement(By.id("draggable"));
        return dragMe;
    }
    public WebElement getDropHere(){
        dropHere = getDriver().findElement(By.id("droppable"));
        return dropHere;
    }

    public WebElement getAcceptTab(){
        acceptTab = getDriver().findElement(By.id("droppableExample-tab-accept"));
        return acceptTab;
    }
    public WebElement getNotAcceptableElement(){
        notAcceptableElement = getDriver().findElement(By.cssSelector("#notAcceptable"));
        return notAcceptableElement;
    }

    public WebElement getDropHereNot(){
        dropHereNot = getDriver().findElement(By.xpath("//div[@id='notAcceptable']/following::div[1]"));
        return dropHereNot;
    }
    public String getDropResponse(){
        dropResponse = "Dropped!";
        return dropResponse;
    }

    public DroppablePage open(){
        getDriver().get("https://demoqa.com/droppable");
        return this;
    }

    public DroppablePage clickOnAcceptTab(){
        getAcceptTab().click();
        return this;
    }





}
