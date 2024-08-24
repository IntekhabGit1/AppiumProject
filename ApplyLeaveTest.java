package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;


public class ApplyLeaveTest {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
       // driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

      
            // Navigate to the web page
        driver.get("https://preview.app.perkpayroll.com/dashboard");

           
          
            
         // Locate and fill the email field
            WebElement emailField = driver.findElement(By.id("usr"));
            emailField.sendKeys("a123");
            
            // Locate and fill the password field
            WebElement passwordField = driver.findElement(By.id("pwd"));
            passwordField.sendKeys("open");
            
            Thread.sleep(3000);
            
            // Click the login button
            WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
            loginButton.click();
            
            
            
            Thread.sleep(3000);
            

            WebElement leavePage=driver.findElement(By.xpath("//img[@id='leaveioc']"));
            leavePage.click();

           
            Thread.sleep(3000);
            

            WebElement MyTeamOption1=driver.findElement(By.xpath("//img[@src='./images/downarrowSelect.svg']"));
            MyTeamOption1.click();
            
           
            
            WebElement MeOption1=driver.findElement(By.xpath("//label[normalize-space()='Me']"));
            MeOption1.click();
            
            
            
            WebElement ApplyLeaveOption=driver.findElement(By.xpath("//button[@class='btn btn-primary rounded float-right']"));
            ApplyLeaveOption.click();
            
            Thread.sleep(3000);
            
            WebElement LeaveType=driver.findElement(By.xpath("//button[@id='dropdown-levType']"));
            LeaveType.click();
            
            
            
            WebElement CL=driver.findElement(By.xpath("//a[text()='Casual Leave']"));
            CL.click();
            
            Thread.sleep(3000);
            
            WebElement StartDate=driver.findElement(By.cssSelector("#reqFromCal"));
            StartDate.click();
            
         
            //Change the Start-Date as per your requirement(Xpath)
            WebElement pickDate1=driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[3]//div[1]//div[1]//div[2]//div[2]//div[1]//div[6]//button[5]"));
            pickDate1.click();
            
            Thread.sleep(3000);
            
            WebElement EndDate=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > main:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > svg:nth-child(1) > path:nth-child(1)"));
            EndDate.click();
            
         
          //Change the End-Date as per your requirement(Xpath)
            WebElement pickDate2=driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[3]//div[1]//div[1]//div[2]//div[2]//div[1]//div[6]//button[5]"));
            pickDate2.click();
            
            Thread.sleep(3000);
            
           WebElement reason=driver.findElement(By.xpath("//textarea[@id='reasons']"));
            reason.sendKeys("Testing_LeaveApply@2507");
            
           Thread.sleep(3000);
           
           WebElement notifyOthers=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > main:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
           notifyOthers.click();
           
           WebElement notifyOthers1=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > main:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
           notifyOthers1.sendKeys("Atif");
           
           WebElement pickName=driver.findElement(By.xpath("//span[@class='mr-4']"));
           pickName.click();
           
           Thread.sleep(3000);
           
           WebElement submit=driver.findElement(By.cssSelector("button[class='rounded ml-3 float-right btn btn-primary']"));
           submit.click();
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//a[text()='Ok']")).click();
          
           Thread.sleep(3000);
           
           System.out.println("Test Success i.e Leave Applied Successfully....!");
       
           driver.quit();
        }
    }
