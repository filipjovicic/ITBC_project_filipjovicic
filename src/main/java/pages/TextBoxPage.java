package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitButton;
    private WebElement submitField;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddress(){
        currentAddress = getDriver().findElement(By.id("currentAddress"));
        return currentAddress;
    }

    public WebElement getPermanentAddress(){
        permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }
    public WebElement getSubmitButton(){
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public WebElement getSubmitField(){
        submitField = getDriver().findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
        return submitField;
    }

    public TextBoxPage open(){
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage enterFullName(String text){
        getFullNameField().sendKeys(text);
        return this;
    }

    public TextBoxPage enterEmail(String text){
        getEmailField().sendKeys(text);
        return this;
    }
    public TextBoxPage enterCurrentAddress(String text){
        getCurrentAddress().sendKeys(text);
        return this;
    }

    public TextBoxPage enterPermanentAddress(String text){
        getPermanentAddress().sendKeys(text);
        return this;
    }

    public TextBoxPage clickSubmit(){
        getSubmitButton().click();
        return this;
    }

















}