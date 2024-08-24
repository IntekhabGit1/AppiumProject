//package com.appium;
//
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class CalcTest {
//
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//        // TODO Auto-generated method stub
//
//        // Gather Desired capabilities
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName", "motorola_edge_20"); // Ensure the correct device name
//        capabilities.setCapability("platformName", "Android");     
//        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("platformVersion", "13");
//        
//        capabilities.setCapability("appPackage", "com.google.android.calculator");
//        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//
//        URL url = URI.create("http://127.0.0.1:4723/").toURL(); // Ensure the correct URL path
//        
//        AndroidDriver driver = new AndroidDriver(url, capabilities);
//        Thread.sleep(5000);
//        System.out.println("Application Started");
//
//        // Click on Login field and enter username
//        WebElement digit8 = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
//        digit8.click();
//        
//        WebElement plusicon = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//        plusicon.click();
//        
//        WebElement digit2 = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
//        digit2.click();
//        WebElement equaltobutton = driver.findElement(By.id("com.google.android.calculator:id/eq"));
//        equaltobutton.click();
//        
//        WebElement result = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
//        String resultFinal=result.getText();
//        
//        if(resultFinal.equals("10"))
//        {
//        	System.out.println("PASS");
//        }
//        else
//        {
//        	System.out.println("Fail");
//        }
//        driver.quit();
//    }
//}