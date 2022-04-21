package org.nishamam.task;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMap {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS );
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("Iphone 13",Keys.ENTER);
		List<WebElement> iPhones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13')]"));
		System.out.println(iPhones.size());
		
		Map<String,Integer> mi=new LinkedHashMap<>();
		
		for (WebElement ph : iPhones) {
			
			String model = ph.getText();
			
			if (mi.containsKey(model)) {
				Integer count = mi.get("model");
				mi.put(model, count+1);
				
			} else {
				mi.put(model, 1);

			}
			
		}
		System.out.println(mi);
	}
}
