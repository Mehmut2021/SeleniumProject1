package com.cybertek.day01_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        // aet up chrome driver
        WebDriverManager.chromedriver().setup();

        //create ChromeDriverManager

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");



        driver.navigate().to("https://amazon.com/");
        //navigate().back()

        // navigate().back()
        driver.navigate().back();
        // navigate().forward()
        driver.navigate().forward();

        driver.navigate().refresh();


        // closing browser
        /*
         * close() method , will close current tab
         * quit() method , will close all tabs if there is more than one
         * */
//        driver.close();
        driver.quit();









    }
}
