package org.nishamam.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wbjob {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\prass\\eclipse-workspace\\day4task1\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.manage().window().maximize();
		
		WebElement btnlogin = driver.findElement(By.id("wp-submit"));
		btnlogin.click();
		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
		
		
//		WebElement rating = driver.findElement(By.xpath("(//a[text()='Carl Mason']//ancestor::tr//child::td[7]//descendant::span[4])[3]"));
//		rating.click();
		
		
//		WebElement rating = driver.findElement(By.xpath("(//a[text()='Content Creator']//parent::td//following-sibling::td[3]//descendant::span[4])[3]"));
//		rating.click();
		
		
		WebElement rating = driver.findElement(By.xpath("//a[text()='Content Creator']//parent::td//following-sibling::td[3]//child::span[4]"));
		rating.click();
		
	}

}
