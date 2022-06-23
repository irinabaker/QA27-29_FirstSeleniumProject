package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumLocators {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-1578153671498.web.app/registration?url=%2Fsearch");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void startFindLocators() {
        //id
        wd.findElement(By.id("name"));
        //className
        wd.findElement(By.className("input-label"));
        //name
        wd.findElement(By.name("viewport"));
        //linkText
        WebElement car = wd.findElement(By.linkText("Let the car work"));
        System.out.println(car.getText());
        //partialLinkText
        WebElement car1 = wd.findElement(By.partialLinkText("car"));
        System.out.println(car1.getText());
    }

    @Test
    public void startFindCss() {
        //tag name
        // wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector("div"));
        //id --> #
        // wd.findElement(By.id("name"));
        wd.findElement(By.cssSelector("#name"));
        //class name --> .
        //  wd.findElement(By.className("input-label"));
        wd.findElement(By.cssSelector(".input-label"));
        //attribute --> []
        wd.findElement(By.cssSelector("[href='/search']"));
        wd.findElement(By.cssSelector("[for='password']"));
        //    wd.findElement(By.cssSelector("[type='email']"));
        //contains --> * ("ssw")
        wd.findElement(By.cssSelector("[for*='ssw']"));
        //    wd.findElement(By.cssSelector("[type*='mai']"));
        //start with with "pas" --> ^
        wd.findElement(By.cssSelector("[for^='pas']"));
        //    wd.findElement(By.cssSelector("[type^='em']"));
        //end on "rd" --> $
        wd.findElement(By.cssSelector("[for$='rd']"));
        //    wd.findElement(By.cssSelector("[type$='il']"));
    }

    @Test
    public void startFindXpath() {
        //  "//*[@attr='value']"
        //tag name --> //
        // wd.findElement(By.tagName("div"));
        wd.findElement(By.xpath("//div"));
        //id
        // wd.findElement(By.id("name"));
        wd.findElement(By.xpath("//*[@id='email']"));
        wd.findElement(By.xpath("//input[@id='email']"));
        //class name
        //  wd.findElement(By.className("input-label"));
        wd.findElement(By.xpath("//*[@class='input-label']"));
        //attribute
        wd.findElement(By.xpath("//*[@href='/search']"));
        //start with "pas"
        //  wd.findElement(By.cssSelector("[for^='pas']"));
        wd.findElement(By.xpath("//*[starts-with(@for,'pas')]"));
        // contains "ssw"
        //   wd.findElement(By.cssSelector("[for*='ssw']"));
        wd.findElement(By.xpath("//*[contains(.,'ssw')]"));
        //end on "rd"
        //   wd.findElement(By.cssSelector("[for$='rd']"));
        wd.findElement(By.xpath("//*[contains(.,'rd')]"));
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
