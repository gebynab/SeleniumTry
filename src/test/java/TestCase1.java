/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author PLUTO5
 */
public class TestCase1 {
    
WebDriver driver = null;
    
    @BeforeTest
    public void setUp (){
        WebDriverManager.firefoxdriver().setup();
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        options.setHeadless(true);  // <-- headless set here
        driver = new FirefoxDriver(options);
    }
    
    @Test
    public void firstTry(){
        driver.get("https://google.com");
        String expectedTittle = "Google";
        String actualTittle = driver.getTitle();
        Assert.assertEquals(actualTittle,expectedTittle);
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
        //driver.quit();
    }
}
