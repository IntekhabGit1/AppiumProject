package com.appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LoginLogoutPerk {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Gather Desired capabilities
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
        Loginid.sendKeys("Atif");
        
        Thread.sleep(3000);
        
        WebElement pwd = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]"));
        pwd.sendKeys("open");
        
        Thread.sleep(3000);
        
        WebElement clickbtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        clickbtn.click();
        
        Thread.sleep(8000);
        
        System.out.println("Login Successful...!");//
        
        
        WebElement optionPage = driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.perkpayroll:id/nav_host\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
        optionPage.click();
        
        System.out.println("OptionPage Loaded");
        
        Thread.sleep(5000);
        ////android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]
        
        WebElement logoutClick = driver.findElement(By.xpath("//android.widget.Button[@text=\"Logout\"]"));
        logoutClick.click();
        
        Thread.sleep(5000);
        
        WebElement OkBtn = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        OkBtn.click();
        
        Thread.sleep(2000);
        
        
   /*     // Interact with the calculator app
        WebElement digit8 = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        digit8.click();

        WebElement plusIcon = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plusIcon.click();

        WebElement digit2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        digit2.click();

        WebElement equalToButton = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        equalToButton.click();

        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        String resultFinal = result.getText();

        if (resultFinal.equals("10")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }*/
        
       // Thread.sleep(5000);
        driver.quit();
    }
}
