package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenuPage extends BasePage {

    private WebElement selectValue;
    private WebElement selectedValue;
    private String selectedStringValue;

    public SelectMenuPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSelectValue(){
        selectValue = getDriver().findElement(By.id("withOptGroup"));
        return selectValue;
    }

    public WebElement getSelectedValue(){
        selectedValue = getDriver().findElement(By.xpath("//div[contains(text(), 'Group 2, option 1')]"));
        return selectedValue;
    }
    public String getSelectedStringValue(){
        selectedStringValue = "Group 2, option 1";
        return selectedStringValue;
    }

    public SelectMenuPage open(){
        getDriver().get("https://demoqa.com/select-menu");
        return this;
    }

    public SelectMenuPage clickOnSelectMenu(){
        getSelectValue().click();
        return this;
    }

    public SelectMenuPage clickOnSelected(){
        getSelectedValue().click();
        return this;
    }


}
