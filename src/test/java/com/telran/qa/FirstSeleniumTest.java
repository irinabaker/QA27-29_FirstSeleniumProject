package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
        driver.get("https://www.google.com");
    }
    //Test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!");
    }
    //after - tearDawn
}
