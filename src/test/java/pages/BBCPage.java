package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.time.Duration;

public class BBCPage {

    private final WebDriver driver = Driver.getDriver();
    private final By signInButton = By.xpath("//span[contains(text(),'Sign in')]");
    private final By userName =  By.id("user-identifier-input");
    private final By password = By.id("password-input");
    private final By loginButton = By.id("submit-button");




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

}
