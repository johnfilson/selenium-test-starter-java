package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BBCPage {

    private final WebDriver driver = Driver.getDriver();
    private final By signInButton = By.xpath("//span[contains(text(),'Sign in')]");
    private final By userName =  By.id("user-identifier-input");
    private final By password = By.id("password-input");
    private final By loginButton = By.id("submit-button");

    private final By accountUsername = By.xpath("//span[contains(text(),'John')]");

    private final By weatherButton = By.xpath("//span[contains(text(),'Weather')]");

    private final By searchBar = By.id("ls-c-search__input-label");

    private final By searchList = By.xpath("//*[contains(@id, 'location-list')]//li");
    private final By addMyLocation = By.xpath("//*[contains(@id, 'wr-forecast')]//button");






    public void getUrl(final String url) {
        driver.navigate().to(url);
    }


    public void clickButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(signInButton).click();}

    public void enterUserName(final String Username){
        driver.findElement(userName).sendKeys(Username);
    }
    public void enterPassword(final String Password){
        driver.findElement(password).sendKeys(Password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();}

    public void clickButtonWeather() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(weatherButton).click();}


    public void confirmLogIn(final String Name){
        String accountName = driver.findElement(this.accountUsername).getText();
        try{
            assertEquals(accountName, Name);
        } catch (Exception e) {
            System.out.println("User is not logged in" + accountName);
        }
    }
    public void enterWeather(final String Weather){
        driver.findElement(searchBar).sendKeys(Weather );
        driver.findElement(searchBar).sendKeys(Keys.ENTER);
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(searchList).isDisplayed();
            driver.findElement(searchList).click();
        }catch (StaleElementReferenceException e){
            System.out.println("Search List Item not visible");
            driver.findElement(searchList).sendKeys(Keys.ENTER);
        }
    }

    public void clickAddMyLocation() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(addMyLocation).click();}

}
