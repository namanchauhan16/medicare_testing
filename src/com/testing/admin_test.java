package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin_test {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://elasticbeanstalk-us-east-1-815392558919.s3-website-us-east-1.amazonaws.com/signin");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"adminBtn\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Naman");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"psw\"]")).sendKeys("Naman12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"formDiv\"]/form/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		if(driver.getTitle().contentEquals("Mediare | admin's page")) {
			System.out.println("successfuly logged into medicare admin page");
		}else {
			System.out.println("login failed");
		}
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1800)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-17\"]")).click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1800)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"topDiv\"]/p[2]/a")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}