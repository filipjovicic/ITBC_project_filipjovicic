package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage extends BasePage{

    private WebElement checkBox;
    private WebElement resultText;
    private WebElement expandAllButton;
    private WebElement homeCheckBox;
    private List<WebElement> allCheckedResultValue;

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getCheckBox() {
        checkBox = getDriver().findElement(By.xpath("//span[@class='rct-checkbox']"));
        return checkBox;
    }
    public WebElement getResultText(){
        resultText = getDriver().findElement(By.id("result"));
        return resultText;
    }
    public WebElement getExpandAllButton(){
        expandAllButton = getDriver().findElement
                (By.xpath("//button[@class='rct-option rct-option-expand-all']"));
        return expandAllButton;
    }
    public WebElement getHomeCheckBox(){
        homeCheckBox = getDriver().findElement(By.xpath("//label[@for='tree-node-home']"));
        return homeCheckBox;
    }
    public List<WebElement> getAllCheckedResultValue(){
        allCheckedResultValue = getDriver().findElements(By.xpath("//span[@class= 'text-success']"));
        return allCheckedResultValue;
    }


    public CheckBoxPage open(){
        getDriver().get("https://demoqa.com/checkbox");
        return this;
    }

    public CheckBoxPage clickCheckBox(){
        getCheckBox().click();
        return this;
    }
    public CheckBoxPage clickExpandAllButton(){
        getExpandAllButton().click();
        return this;
    }
    public CheckBoxPage clickHomeCheckBox(){
        getHomeCheckBox().click();
        return this;
    }


}
