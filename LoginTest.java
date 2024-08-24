package com.example;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
       // WebDriverManager.chromedriver().setup();
    	
    //	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brio-LT-Intekhab\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");
        
    //	WebDriver driver = new ChromeDriver();
    	
    		WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        
      //  WebDriverManager.edgedriver().setup();
      //  WebDriver driver = new EdgeDriver();
            
           // WebDriverManager.firefoxdriver().setup();
           // WebDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        
        
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Open the login page
       // driver.get("https://sso.teachable.com/secure/9521/identity/login/password"); // Replace with the actual URL
        driver.get("https://preview.app.perkpayroll.com/login?ReturnUrl=%2Fmyrequests");
        
        Thread.sleep(5000);
        
        // Locate and fill the email field
        WebElement emailField = driver.findElement(By.id("usr"));
        emailField.sendKeys("a123@t");
        
        // Locate and fill the password field
        WebElement passwordField = driver.findElement(By.id("pwd"));
        passwordField.sendKeys("open");
        
        // Click the login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        loginButton.click();
        
        Thread.sleep(5000);
        
        WebElement dd=driver.findElement(By.xpath("//*[@class=\"rotate270 ml-2 mr-3\"]"));
        dd.click();
        
        Thread.sleep(5000);
        
        // Validate login success (Example: Check if logout button is present)
        boolean isLoggedIn = driver.findElement(By.linkText("Sign Out")).isDisplayed();
        if (isLoggedIn) {
            System.out.println(" Login successful!");
        } else {
            System.out.println(" Login failed!");
        }
        
        System.out.println("\n Url of the page is: "+driver.getCurrentUrl());  
        
        System.out.println("\n Title of the page is: "+driver.getTitle());   
     
        //System.out.println("\n Page Source for this page is: "+driver.getPageSource()); 
        
        //Click the Sign Out button
        driver.findElement(By.linkText("Sign Out")).click();
       
        Thread.sleep(5000);
        // Close the browser
       driver.quit();
    }
}