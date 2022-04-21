package org.nishamam.task;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripMonth {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Del");
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		WebElement amount = driver.findElement(By.xpath("(//p[text()=14])[2]//following-sibling::p"));
		System.out.println(amount.getText());

		List<WebElement> dates = driver.findElements(By.xpath("//div[@class=\"DayPicker-Month\"][2]"));

		for (WebElement d : dates) {
			System.out.println(d.getText());
		}
		}

}
