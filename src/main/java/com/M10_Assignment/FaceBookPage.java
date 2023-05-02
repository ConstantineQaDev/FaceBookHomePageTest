package com.M10_Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPage {

    private static WebDriver webDriver;
    public static WebDriver getWebDriver() {

        if(webDriver == null){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
    public static void closeBrowser(){

        if(webDriver != null){
            webDriver.close();
        }
    }
}