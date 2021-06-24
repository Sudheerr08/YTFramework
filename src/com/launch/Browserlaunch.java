package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserlaunch  {

    public static void main(String[] args) throws InterruptedException {
        String title = "Facebook – log in or sign up";
        System.setProperty("webdriver.Chrome.driver","/Users/labbuser/IdeaProjects/YTFramework/Driver/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        Browserlaunch bl =new Browserlaunch();
        bl.launch(driver1);
        WebElement register = driver1.findElement(By.linkText("Create New Account"));
        register.click();
       Thread.sleep(2000);
        bl.registration(driver1);
        Thread.sleep(40000);
        driver1.quit();

    }
    void launch(WebDriver driver )
    {
     driver.get("https://en-gb.facebook.com//");
        driver.manage().window().maximize();;
    }

     void login(WebDriver driver)
    {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Sudheerr08@gmail.com");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("dhar6199");
        WebElement login =driver.findElement(By.name("login"));
        login.click();
    }

    void registration(WebDriver driver) throws InterruptedException {
        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("Sudhir");
        WebElement lname = driver.findElement(By.name("lastname"));
        lname.sendKeys("Rathore");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("sudhirtest08@gmail.com");
        Thread.sleep(500);
        WebElement emailconfirm = driver.findElement(By.name("reg_email_confirmation__"));
        emailconfirm.sendKeys("sudhirtest08@gmail.com");
        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("Dhar@6199");
        WebElement date = driver.findElement(By.name("birthday_day"));
        Select st = new Select(date);
        st.selectByIndex(25);
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select st1 = new Select(month);
        st1.selectByIndex(5);

        WebElement year = driver.findElement(By.name("birthday_year"));
        Select st2 = new Select(year);
        st2.selectByIndex(33);
       WebElement sex =  driver.findElement(By.xpath("//label[contains(.,'Male')]"));
       sex.click();
        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();



    }
}
