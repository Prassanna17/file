package org.nishamam.task;

import org.baseclass.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElementHighlight extends BaseClass{
	public static void main(String[] args) {
		
		browserConFig();
		waitImplicit();
		loadUrl("https://www.facebook.com/");
		maximize();
		
		WebElement txtUser = locateById("email");
		WebElement txtPass = locateById("pass");
		WebElement btnLogin = locateByName("login");
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].style.background='green'", txtUser);
		
		executor.executeScript("arguments[0].style.border='2px solid green'", txtPass);
		
		executor.executeScript("arguments[0].style.background='green'", btnLogin);
		
//		Actions action=new Actions(driver);
//		
//		Action build = action.moveToElement(txtUser).build();
		
		
	}
	

}
