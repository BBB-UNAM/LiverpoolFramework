package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver startThread(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static void closeThread(WebDriver driver){
        driver.close();
        driver.quit();
    }

    public static void setExplictWait(WebDriver driver, int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void MaximizeWindow(WebDriver driver){
        driver.manage().window().maximize();
    }

    public static void openUrl(WebDriver driver, String url){
        driver.get(url);
    }
}
