package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {
    public static void main(String[] args) throws InterruptedException {


        //set up chrome driver, open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to http://google.com
        driver.get("https://google.com/");
        // try to identify search box using both name and id
        WebElement searchbox = driver.findElement(By.name("q"));
        //submit the search by clicking on the search button
 searchbox.sendKeys("Everything is awesome");
        //
WebElement searchBtn = driver.findElement(By.name("btnK"));
searchBtn.submit();
//navigate back to gogle hoem page
        driver.navigate().back();
        //wait few seconds
Thread.sleep(3000);
        //click on about link
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();
        //wait few seconds
        Thread.sleep(3000);
        //close the browser
        driver.quit();



    }
}
