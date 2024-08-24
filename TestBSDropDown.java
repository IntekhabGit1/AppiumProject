package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBSDropDown {

	public static void main(String[] args) throws Throwable 
	{
		 WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        
	        driver.manage().window().maximize();
	        
	        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        // Open the login page
	       // driver.get("https://sso.teachable.com/secure/9521/identity/login/password"); // Replace with the actual URL
	        driver.get("https://preview.app.perkpayroll.com/login?ReturnUrl=%2Fmyrequests");
	        
	        Thread.sleep(5000);
	        
	        // Locate and fill the email field
	        WebElement emailField = driver.findElement(By.id("usr"));
	        emailField.sendKeys("atif");
	        
	        // Locate and fill the password field
	        WebElement passwordField = driver.findElement(By.id("pwd"));
	        passwordField.sendKeys("open");
	        
	        // Click the login button
	        WebElement loginButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
	        loginButton.click();
	        
	        Thread.sleep(5000);
	        //8276031832 Al khair bank
	        
	        driver.findElement(By.xpath("//button[@id='ddlCardMenuTE']")).click();
	        
	        Thread.sleep(5000);//Apply here Explicit wait
	        
	        driver.findElement(By.xpath("//label[normalize-space()='My Team']")).click();////label[normalize-space()='My Team']////label[normalize-space()='Admin']
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//img[@class='rotate270']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//img[@id='configurationioc']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//li[normalize-space()='Leave']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//div[normalize-space()='Comp-off Policy']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//img[@alt='edit']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[@id='LeaveName']")).click();
	        
	        Thread.sleep(5000);
	        
	       List<WebElement> Leavetype =driver.findElements(By.xpath("//div[@class='w-100 dropdown-menu show']/a"));
	        
	      System.out.println("Total no of leave Type="+Leavetype.size());
	      
	      for(WebElement ltype:Leavetype)
	      {
	    	  if(ltype.getText().equals("Loss of Pay"))
	    	  {
	    		  ltype.click();
	    		  break;
	    	  }
	      }
	      Thread.sleep(5000);
	        
	        
	        ////div[@class='w-100 dropdown-menu show']/a
	      
	    //select[@id='dropdown-class-example']
	      
	     // https://rahulshettyacademy.com/AutomationPractice/
	}

}
