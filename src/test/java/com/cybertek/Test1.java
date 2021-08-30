package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {
    public static void main(String[] args) {


        // 1.set up Chrome driver so selenium can use it to automate chrome

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.navigate().to("http://google.com");





    }

}
