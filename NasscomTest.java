package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NasscomTest {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
    
		driver.manage().window().maximize();
    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			int no =0;
		
			for(int i=1;i<=i+no;i++) {
			
			driver.get("https://www.nasscom.in/members-listing/a?page="+i);
		    
			List<WebElement> companyNames = driver.findElements(By.xpath("//h3[@class='job_title']"));////div[@class='category']
			if(companyNames.size()>0) {
				no=no+1;
			}
			List<WebElement> locations = driver.findElements(By.xpath("//div[@class='category']"));//
			
			int compCount=companyNames.size();
			
			System.out.println("CompanyCount= "+compCount);
			
			System.out.println("Company names:");
	  
			for (WebElement companyName : companyNames) 
			{
				
				System.out.println(companyName.getText());

			}
			
			System.out.println("======================================================================================");
			
			
			int locCount=locations.size();
			System.out.println("LocationCount= "+locations.size());
			
			System.out.println("Location names:");
	  
			for (WebElement companyLoc : locations) 
			{
				System.out.println(companyLoc.getText());

			}
		}
		/*for(int i=0;i<compCount-1;i++)
		{
		 System.out.println(companyNames.getText());
		}*/
	
        driver.quit();
    }

}

