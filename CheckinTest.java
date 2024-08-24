package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckinTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
    		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
       // driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        try {
            // Navigate to the web page
            driver.get("https://perkprod.azurewebsites.net/dashboard#Me");

            // Maximize the browser window
          
            
         // Locate and fill the email field
            WebElement emailField = driver.findElement(By.id("usr"));
            emailField.sendKeys("Atif");
            
            // Locate and fill the password field
            WebElement passwordField = driver.findElement(By.id("pwd"));
            passwordField.sendKeys("open");
            
            // Click the login button
            WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
            loginButton.click();
            
            WebElement AdminOption=driver.findElement(By.xpath("//button[@id='ddlCardMenuTE']"));
            AdminOption.click();
            
            Thread.sleep(3000);
            
            WebElement MeOption=driver.findElement(By.xpath("//label[normalize-space()='Me']"));
            MeOption.click();

            // Wait for the "Check In" button to be clickable ////img[@class='loginiconarrow']>>>//logoutinonarrow
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           
     //       WebElement checkInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='loginiconarrow']")));
            

            // Click the "Check In" button
          //  checkInButton.click();
            
            WebElement CheckoutButton=driver.findElement(By.xpath("//img[@class='logoutinonarrow']"));
            CheckoutButton.click();

            // Verify the check-in action (this is a placeholder, replace with actual verification)
            // For example, check if a certain element is displayed after check-in
           /* WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-message-id")));
            if (successMessage.isDisplayed()) {
                System.out.println("Check-in was successful!");
            } else {
                System.out.println("Check-in failed.");
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}