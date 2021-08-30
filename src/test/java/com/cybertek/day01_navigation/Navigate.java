package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


        //open chrome and navigate to yahoo

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");

        //locate search box and enter selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));

        //locate an element by its name
        //WebDriver searchBox = driver.findElement(By.name("p"));

        // enter text inside inputbox element using sendkey("your text");
        searchBox.sendKeys("Selenium");
        // locate the search button and click (or submit)
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));

        //searchBtn.click; to submit the search
        searchBtn.submit();
        Thread.sleep(5000);

        // quit browser
        driver.quit();


    }
}
