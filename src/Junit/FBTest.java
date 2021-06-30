package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBTest {

        WebDriver driver;

        @Before
        public void Launch() throws InterruptedException {
            System.setProperty("Webdriver.Chrome.driver","/Users/labbuser/IdeaProjects/Junit/Driver/chromedriver");
            driver = new ChromeDriver();
            driver.navigate().to("https://en-gb.facebook.com//");
            driver.manage().window().maximize();;
            Thread.sleep(2000);



        }
        @Test
        public void signup() throws InterruptedException {
            WebElement register = driver.findElement(By.linkText("Create New Account"));
            register.click();
            Thread.sleep(2000);
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

    @Ignore
    public void TitleTest() throws InterruptedException {
            Thread.sleep(400);
        String title = "Facebook – log in or sign up";
        System.out.println(" "+driver.getTitle());
        if (driver.getTitle()==title)
        {
            System.out.println("Facebook Launched Sucessfully");
        }
        else
        {
            System.out.println("Facebook Launch failed");
        }
    }

    {
       String title = "Facebook – log in or sign up";
    }

        @After
        public void Close() throws InterruptedException
        {
            Thread.sleep(2000);
            driver.quit();

        }


    }

