package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {
    public static void main(String[] args) {

        // set up chrome driver

        WebDriverManager.chromedriver().setup();
        // create ChromeDriver object
        WebDriver driver = new ChromeDriver();
        // navigate to google.com
        driver.get("https://google.com");

        //Maximize the browser
       // driver.manage().window().maximize();

        //make the browser window full size
        driver.manage().window().fullscreen();

        //quit the browser
       // driver.quit();






    }
}
