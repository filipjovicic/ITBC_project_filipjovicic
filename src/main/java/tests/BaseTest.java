package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private TextBoxPage textBoxPage;
    private Faker faker;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private LinksPage linksPage;
    private IndexPage indexPage;
    private BrokenLinksPage brokenLinksPage;
    private SelectMenuPage selectMenuPage;
    private Actions actions;
    private DroppablePage droppablePage;
    private ButtonsPage buttonsPage;
    private AlertsPage alertsPage;
    private JavascriptExecutor js;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public Faker getFaker() {
        return faker;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public LinksPage getLinksPage(){
        return linksPage;
    }

    public IndexPage getIndexPage(){
        return indexPage;
    }
    public BrokenLinksPage getBrokenLinksPage(){
        return brokenLinksPage;
    }
    public SelectMenuPage getSelectMenuPage(){
        return selectMenuPage;
    }
    public Actions getActions(){
        return actions;
    }
    public DroppablePage getDroppablePage(){
        return droppablePage;
    }
    public ButtonsPage getButtonsPage(){
        return buttonsPage;
    }
    public AlertsPage getAlertsPage(){
        return alertsPage;
    }

    public JavascriptExecutor getJs() {
        return js;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//jovic//Documents//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        textBoxPage = new TextBoxPage(driver, wait);
        faker = new Faker();
        checkBoxPage = new CheckBoxPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        linksPage = new LinksPage(driver, wait);
        indexPage = new IndexPage(driver, wait);
        brokenLinksPage = new BrokenLinksPage(driver, wait);
        selectMenuPage = new SelectMenuPage(driver, wait);
        actions = new Actions(driver);
        droppablePage = new DroppablePage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        alertsPage = new AlertsPage(driver, wait);
        js = (JavascriptExecutor) driver;


    }

    @BeforeMethod
    public void beforeEachTest() {
        getDriver().manage().window().maximize();
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

    public void assertCurrentUrl(String email){
        Assert.assertTrue(getDriver().getCurrentUrl().contains(email));
    }

    public void moveObject(WebElement source, WebElement element){
        getActions().dragAndDrop(source, element).perform();
    }

    public void doubleClick(WebElement element){
        getActions().doubleClick(element).perform();
    }

    public void rightClick(WebElement element){
        getActions().contextClick(element).perform();
    }

    public void clickButton(WebElement element){
        getActions().click(element).perform();
    }

    public void moveToElement(WebElement element){
        getActions().moveToElement(element).perform();
    }

    public void scrollDown(int numberOfPixels) {
        getJs().executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }

    @AfterClass
    public void cleanUp() {
        getDriver().close();
    }


}
