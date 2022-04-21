package org.task;

import java.util.List;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	driver.manage().window().maximize();
	
	List<WebElement> rowDatas = driver.findElements(By.tagName("tr"));
	
	for (int i = 0; i < rowDatas.size(); i++) {
		WebElement row = rowDatas.get(i);
		List<WebElement> cellDatas = row.findElements(By.tagName("td"));
		
		for (int j = 0; j < cellDatas.size(); j++) {
			WebElement cell = cellDatas.get(j);
			String text = cell.getText();
			
			if (text.contains("third cell")) {
				System.out.println(text);
				System.out.println("Row number is "+ i);
				System.out.println("Cell number is  "+j);
			}
			
		}
		
	}
		
}

}
