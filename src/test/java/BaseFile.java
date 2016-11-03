import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseFile {
    WebDriver driver = new FirefoxDriver();

    public void Site() {
        driver.get("https://accounts.google.com");

    }


    public void Email() {
        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("kailash.kh.kumar@gmail.com");
    }

//    public void Next() {
//        driver.findElement(By.id("next")).click();
//    }
//
//    public void password(){
//        WebElement pass = driver.findElement(By.id("Passwd"));
//        pass.sendKeys("ankesh@123");
//    }
//    public void SignIn(){
//
//        driver.findElement(By.id("signIn")).click();
//    }
//
//
    public void Wait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
//
//    public void closek(){
//        driver.close();
//        driver.quit();
    }

