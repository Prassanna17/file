package org.nishamam.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSet {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13",Keys.ENTER);
		
		List<WebElement> iPhones = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 13')]"));

		Set si=new HashSet();
		
		for (WebElement iPhone : iPhones) {
			
			String phoneName = iPhone.getText();
			
			if (!si.contains(phoneName)) {
				si.add(phoneName);
			
			}
		}
		System.out.println(si);
	}

}
