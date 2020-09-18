package Coding_Hub;

import Util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsClass {

    WebDriver driver;
    String browserType = "chrome";
    String URL = "https://www.phptravels.net/";

    WebElement loginButton = driver.findElement(By.xpath("//form[@id='loginfrm']/button[@type='submit']"));

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void logintest1(){
        //create action object
        Actions action = new Actions(driver);
        //move to (hover over) login button
        action.moveToElement(loginButton).perform();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
