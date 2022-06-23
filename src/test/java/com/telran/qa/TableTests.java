package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTests {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void tableTestWithCss() {
        //get row 4
        WebElement element = wd.findElement(By.cssSelector("tr:nth-child(4)"));
        System.out.println(element.getText());
        //get td 3
        WebElement element1 = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(3)"));
        System.out.println(element1.getText());
        //get last child
        WebElement element2 = wd.findElement(By.cssSelector("tr:nth-child(4) td:last-child"));
        System.out.println(element2.getText());
        //get rows
        List<WebElement> table = wd.findElements(By.cssSelector("tr"));
        System.out.println(table.size());
        //get headers
        List<WebElement> table1 = wd.findElements(By.cssSelector("tr th"));
        System.out.println(table1.size());
    }
}
