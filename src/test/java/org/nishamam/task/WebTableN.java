package org.nishamam.task;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableN extends BaseClass{
	public static void main(String[] args) {
		
		browserConFig();
		waitImplicit();
		loadUrl("https://demo.guru99.com/test/web-table-element.php");
		maximize();
		
		List<WebElement> all = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < all.size(); i++) {
			WebElement row = all.get(i);
			if(i==0) {
			List<WebElement> heading = row.findElements(By.tagName("th"));
			String text2 = heading.get(3).getText();
			System.out.println(text2);
			}
		
		else {
			List<WebElement> data = row.findElements(By.tagName("td"));
			String tex2 = data.get(3).getText();
			System.out.println(tex2);
		}
			
		}

	}
}