package com.appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CheckinCheckoutPerk {

	public static void main(String[] args) throws Throwable 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "motorola motorola edge 20"); // Ensure the correct device name
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformVersion", "13"); // Ensure the correct Android version

//        capabilities.setCapability("appPackage", "com.google.android.calculator");
//        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        capabilities.setCapability("appPackage", "com.perkpayroll");
        capabilities.setCapability("appActivity", "crc642586edc169cd8101.MainActivity");
        
        // Ensure the correct Appium server URL
        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        // Create the AndroidDriver instance
        AndroidDriver driver = new AndroidDriver(url, capabilities);
        Thread.sleep(5000); // Wait for the app to load
        System.out.println("Application Started");
        
        WebElement Loginid = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username or Email\"]"));
        Loginid.sendKeys("perk"); // UnAuthorised Location
     
        
        Thread.sleep(3000);
        
        WebElement pwd = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]"));
        pwd.sendKeys("open");
        
        Thread.sleep(3000);
        
        WebElement clickbtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        clickbtn.click();
        
        //Thread.sleep(15000);
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        
        System.out.println("Login Successful1...!"); 
        
        WebElement popup = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
        popup.click();////android.widget.TextView[@text=""]
        
        Thread.sleep(2000);
        
        System.out.println("Pop Up Closed...!");
        
       ////android.widget.TextView[@text=""]
        
        WebElement checkinbtn1 = driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.perkpayroll:id/nav_host\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
        checkinbtn1.click();
        
        Thread.sleep(2000);
        
        WebElement pp1 = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
        pp1.click();
         
        Thread.sleep(2000);
        
        WebElement pp2 = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
        pp2.click();
        
        Thread.sleep(2000);
        
        WebElement pp3 = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
        pp3.click();
         
        Thread.sleep(2000);
     //   (//android.widget.FrameLayout[@resource-id="com.perkpayroll:id/nav_host"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup
        
       WebElement checkinbtn2 = driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.perkpayroll:id/nav_host\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup"));
       checkinbtn2.click();
                
       
                
       Thread.sleep(2000);
       
       WebElement checkinbtn3 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup"));
       checkinbtn3.click();
       
       Thread.sleep(3000);
        
        
       
     
       
       WebElement backBtn = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
       backBtn.click();
       
       Thread.sleep(3000);
       
       WebElement checkoutbtn1 = driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.perkpayroll:id/nav_host\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
       checkoutbtn1.click();
       
       Thread.sleep(3000);
       
       WebElement checkoutbtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Out\"]"));
       checkoutbtn2.click();
       
       Thread.sleep(3000);
       
       WebElement checkoutbtn3 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Check Out\"]"));
       checkoutbtn3.click();
       
       Thread.sleep(5000);
       
       System.out.println("Checkout Done....!");
       
       
       WebElement backbtn2 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
       backbtn2.click();
       
       Thread.sleep(3000);
       
       System.out.println("Clicked on BackButton after CheckOut...!");
       
       Thread.sleep(3000);
       
       driver.quit();
       
       System.out.println("Closed Application Successfully!");
       
       
    
    		 	   
	
    		 
	
	
	
	
	
	}

}
