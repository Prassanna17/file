package org.nishamam.task;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//if you want occurance of letter with count===> map interface used to find 
public class OccuranceWithCount {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.manage().window().maximize();
		
		WebElement btnlogin = driver.findElement(By.id("wp-submit"));
		btnlogin.click();
		
		List<WebElement> allCat = driver.findElements(By.xpath("//td[@data-colname=\"Category\"]"));
		
		Map<String,Integer> mp= new LinkedHashMap<>();
		
		for (WebElement cat : allCat) {
			String text = cat.getText();
			
			if (mp.containsKey(text)) {
				Integer count = mp.get(text);
				mp.put(text, count+1);
			} 
			else {
				mp.put(text, 1);
			}
		}
		System.out.println(mp);
	}
}
