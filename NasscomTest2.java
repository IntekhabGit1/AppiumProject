package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NasscomTest2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet = workbook.createSheet("Nasscom MembersList1");

			int rowCount = 0;

			int no = 0;

			for (int i = 1; i <=237; i++) {//i+no

			    driver.get("https://www.nasscom.in/members-listing/a?page=" + i);

			    List<WebElement> companyNames = driver.findElements(By.xpath("//h3[@class='job_title']"));
			    if (companyNames.size() > 0) {
			        no =no+1;
			    }
			    List<WebElement> locations = driver.findElements(By.xpath("//div[@class='category']"));

			    int compCount = companyNames.size();

			    System.out.println("CompanyCount= " + compCount);

			    System.out.println("Company names:");

			    for (int j = 0; j < compCount; j++) {
			        WebElement companyName = companyNames.get(j);
			        WebElement companyLoc = locations.get(j);

			        System.out.println(companyName.getText());
			        System.out.println(companyLoc.getText());

			        Row row = sheet.createRow(rowCount++);
			        Cell cell1 = row.createCell(0);
			        Cell cell2 = row.createCell(1);

			        cell1.setCellValue(companyName.getText());
			        cell2.setCellValue(companyLoc.getText());
			    }

			    System.out.println("======================================================================================");

			    System.out.println("LocationCount= " + locations.size());

			    System.out.println("Location names:");

			    for (WebElement companyLoc : locations) {
			        System.out.println(companyLoc.getText());
			    }
			}

			try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Brio-LT-Intekhab\\Pictures\\Screenshots\\May@25\\NasscomMembersList1.xlsx")) {
			    workbook.write(outputStream);
			} catch (IOException e) {
			    e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			driver.quit();
		}
        //driver.quit();
    }
}