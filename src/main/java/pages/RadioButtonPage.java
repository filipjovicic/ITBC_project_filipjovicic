package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {

    private WebElement yesRadioButton;
    private WebElement impressiveRadioButton;
    private WebElement noRadioButton;
    private WebElement resultRadio;
    private WebElement contentArea;
    private String yesRadioBtnValue;
    private String impressiveRadioBtnValue;
    private String noRadioBtnValue;


    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesRadioButton(){
        yesRadioButton = getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return yesRadioButton;
    }

    public WebElement getImpressiveRadioButton(){
        impressiveRadioButton = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveRadioButton;
    }

    public WebElement getNoRadioButton() {
        noRadioButton = getDriver().findElement(By.xpath("//label[@for='noRadio']"));
        return noRadioButton;
    }
    public WebElement getResultRadio(){
        resultRadio = getDriver().findElement(By.xpath("//p[@class='mt-3']"));
        return resultRadio;
    }
    public WebElement getContentArea(){
        contentArea = getDriver().findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
        return contentArea;
    }
    public String getYesRadioBtnValue(){
        yesRadioBtnValue = "Yes";
        return yesRadioBtnValue;
    }

    public String getImpressiveRadioBtnValue(){
        impressiveRadioBtnValue = "Impressive";
        return impressiveRadioBtnValue;
    }
    public String getNoRadioBtnValue(){
        noRadioBtnValue = "You have selected";
        return noRadioBtnValue;
    }

    public RadioButtonPage open(){
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }

    public RadioButtonPage clickYes(){
        getYesRadioButton().click();
        return this;
    }
    public RadioButtonPage clickImpressive(){
        getImpressiveRadioButton().click();
        return this;
    }

    public RadioButtonPage clickNo(){
        getNoRadioButton().click();
        return this;
    }


}
