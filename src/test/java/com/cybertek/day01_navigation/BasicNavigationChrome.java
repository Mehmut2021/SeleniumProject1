package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigationChrome {
    public static void main(String[] args) {

        // set up Chrome driver
        WebDriverManager.chromedriver().setup();

        //Create Webdriver instance using ChromeDriver object

        WebDriver driver = new ChromeDriver();

        // navigate to "https//cybertekschool.com");
        driver.get("https://cybertekschool.com");

        System.out.println("About to quit");
        //quit the browser

        driver.quit();


    }
}
