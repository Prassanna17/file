package org.nishamam.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Windows extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserConFig();
		loadUrl("https://www.amazon.in/");
		maximize();
		
		waitImplicit();
		WebElement txtSearch = locateByXpath("//input[@id=\"twotabsearchtextbox\"]");
		sendKeys(txtSearch, "iphone");
		click(txtSearch);
		locateByXpath("//input[@type=\"submit\"]").click();
		
		List<WebElement> phoness = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		
		for (WebElement ph : phoness) {
			click(ph);
		}
		
//		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		
		List<String> li=new ArrayList<>();
		li.addAll(all);
		for (int i = 0; i < li.size(); i++) {
			
			if (i!=1) {
				driver.switchTo().window(li.get(i)).close();
				
			}
			
		}	
	}
}
