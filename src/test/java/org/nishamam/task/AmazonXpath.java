package org.nishamam.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonXpath {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement txtSearch = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	txtSearch.sendKeys("iphone 13",Keys.ENTER);
	
//	WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (512GB) - (Product) RED']//ancestor::div[1]//following-sibling::div[2]//child::div[1])[6]"));
//	WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (512GB) - (Product) RED']//ancestor::div[1]//following-sibling::div[2]//descendant::div[7])[1]"));
	
	WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - (Product) RED']//ancestor::div[1]//following-sibling::div[2]//descendant::span[@class=\"a-color-base a-text-bold\"]"));
	
	
	System.out.println(iphone.getText());
}
}
