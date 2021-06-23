package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver","/Users/labbuser/IdeaProjects/YTFramework/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();


    }
}
