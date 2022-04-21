package org.nishamam.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonList {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13",Keys.ENTER);
		
		List<WebElement> iPhones = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		
			for (WebElement phone : iPhones) {
				
				System.out.println(phone.getText());
				
			}
	}

}
