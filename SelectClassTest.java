package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassTest {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriverManager.edgedriver().setup();
	     
		 WebDriver driver = new EdgeDriver();
	        
	        driver.manage().window().maximize();
	        
	        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        Thread.sleep(5000);
	        
	        // Locate and fill the email field
	        WebElement DD = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	        
	        Select dd=new Select(DD);
	        
	       // dd.selectByVisibleText("Option3");
	        
	       // dd.selectByValue("option2");
	        
	        dd.selectByIndex(1);
	        
	      //  driver.quit();
	        driver.close();
		

	}

}
