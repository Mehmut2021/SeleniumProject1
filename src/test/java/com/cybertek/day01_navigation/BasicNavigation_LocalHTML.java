package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML {
    public static void main(String[] args) {

        //file:///Users/mm/Desktop/HTML/TeslaPage.html
        WebDriverManager.chromedriver().setup();


        //set up chrome driver, open crhome browser
        WebDriver driver = new ChromeDriver();

        //navigate to the file using the path copied from browser
        driver.get("file:///Users/mm/Desktop/HTML/TeslaPage.html");
        driver.manage().window().fullscreen();


        //close the browser
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.close();




    }







}
