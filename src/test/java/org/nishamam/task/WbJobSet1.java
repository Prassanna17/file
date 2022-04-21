package org.nishamam.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Remove the repeated value====> we can go for Set ---> {If condition used to execute}
public class WbJobSet1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.manage().window().maximize();
		
		WebElement btnlogin = driver.findElement(By.id("wp-submit"));
		btnlogin.click();
		
		List<WebElement> allCat = driver.findElements(By.xpath("//td[@data-colname=\"Category\"]"));
	 
		Set si=new HashSet();
		
		for (WebElement webElement : allCat) {
			
			String text = webElement.getText();
			si.add(text);
		}
		System.out.println(si);
	}
}
