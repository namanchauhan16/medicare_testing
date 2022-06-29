package com.testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainTesting {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://elasticbeanstalk-us-east-1-815392558919.s3-website-us-east-1.amazonaws.com/signin");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("naman");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("psw")).sendKeys("naman123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formDiv\"]/form/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		if(driver.getTitle().contentEquals("Medicare | products: pain relirf, medical suppiles, baby care, personal care")) {
			System.out.println("successfuly logged into medicare");
		}else {
			System.out.println("login failed");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"productSelection\"]/mat-form-field/div/div[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]")).click();
		
		System.out.println("category selected");
		
		js.executeScript("window.scrollBy(0,1400)");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/div/div[7]/button")).click();
		
		System.out.println("product selected");
		
		Thread.sleep(2000);

		driver.findElement(By.name("quantity")).sendKeys("1");
		
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//*[@id=\"innerDiv\"]/div/button[2]")).click();
		
		System.out.println("product addded to the cart");
		
		Thread.sleep(2000);		

		js.executeScript("window.scrollBy(0,-1400)");
		
		Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//*[@id=\"navRight\"]/ul/li[2]/a")).click();
		
		Thread.sleep(2000);		

		driver.findElement(By.xpath("//*[@id=\"cartTable\"]/table/tbody/td[6]/button")).click();
		
		System.out.println("order successfuly paced");
		
		Thread.sleep(4000);	
		
		driver.findElement(By.xpath("//*[@id=\"navRight\"]/ul/li[3]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/table/tbody/td[5]/button")).click();
		
		System.out.println("order caceled");
		
		driver.findElement(By.xpath("//*[@id=\"navRight\"]/ul/li[4]/a")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		System.out.println("successfuly logged out");
	}
}