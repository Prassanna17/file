package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		
		public static WebDriver driver;
		public  static void browserConFig() {
			WebDriverManager.chromedriver().setup();	
			driver= new ChromeDriver();
		}
		
		public  static void loadUrl(String url) {
			driver.get(url);
		}
		
		public static void navigate(String url) {
			driver.navigate().to(url);
		}
		
		public String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		
		public static  void maximize() {
			driver.manage().window().maximize();
		}
		public static void refresh() {
			driver.navigate().refresh();
		}
		
		public static void forward() {
			driver.navigate().forward();
		}
		
		public static void back() {
			driver.navigate().back();
		}
		
		public static void close() {
			driver.close();
		}
		
		//10
		
		public static  void quitWindow() {
			driver.quit();
		}

		public static WebElement locateById(String id) {
			WebElement element = driver.findElement(By.id(id));
			return element;
		}

		public static WebElement locateByName(String name) {
			WebElement element = driver.findElement(By.name(name));
			return element;
		}
		
		public static WebElement locateByclass(String classname) {
			WebElement element = driver.findElement(By.className(classname));
			return element;
		}
		
		public static WebElement locateByXpath(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;
		}
		
		public WebElement locateByXpathWithText(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;
		}
		
		public WebElement locateByXpathContains(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;
		}
		
		
		public WebElement locateByXpathParticallyContains(String xpathExpression) {
			WebElement element = driver.findElement(By.xpath(xpathExpression));
			return element;
		}
		
		public WebElement locateByTagName(String name) {
			WebElement element = driver.findElement(By.xpath(name));
			return element;
		}
		
		public static void sendKeys(WebElement element, String data) {
			element.sendKeys(data);
		}
		
		//20
		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		
		public static String getAttribute(WebElement element) {
			String text = element.getAttribute("value");
			return text;
		}
		
		public static void click(WebElement element) {
			element.click();
		}
		
		public static void clear(WebElement element) {
			element.clear();	
		}
		
		
		public static void alertAccept() {
			Alert alert=driver.switchTo().alert();
			alert.accept();
			}
		
		public static void alertDismiss() {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
			}
		
		public static void alertSendKeys(String keysToSend) {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(keysToSend);
			}
		
		public String alertGetText() {
			Alert alert=driver.switchTo().alert();
			String text = alert.getText();
			return text;
		}
		
		public static void AlertAutheticationBox(String url) {
			driver.get(url);
		}
	
		public static void moveToElement(WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		//30
		
		public static void dragAndDrop(WebElement fromElement, WebElement toElement ) {
			Actions actions=new Actions(driver);
			actions.dragAndDrop(fromElement, toElement).perform();
		}
		
		public static void conTextClick(WebElement element) {
			Actions actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		
		public static void actionsSendKeysInCapital(WebElement element, String keys) {
			Actions actions=new Actions(driver);
			actions.keyDown(Keys.SHIFT).sendKeys(element, keys).keyUp(Keys.SHIFT).perform();
		}
		

		
		public static void takeScreenshot(String location) throws IOException {
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File(location);
			FileUtils.copyFile(srcFile, destFile);
		}
		public static void elementScreenshot(WebElement element,String location) throws IOException {
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File srcFile=element.getScreenshotAs(OutputType.FILE);
			File destFile=new File(location);
			FileUtils.copyFile(srcFile, destFile);
		}
		
		
		public Object JsGetAttribute(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			Object executeScript = executor.executeScript( "arguments[0].getAttribute('value')", element);
			return executeScript;
			}
		
		public static void JsSetAttribute(String data,WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;

			executor.executeScript( "return arguments[0].setAttribute('value','data')", element);
			}
		
		public static void JsClick(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript( "arguments[0].click()", element);
			}
		
		public static void dDSelectByIndex(WebElement element, int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		
		public static void dDSelectByValue(WebElement element, String value) {
			Select select=new Select(element);
			select.selectByValue(value);
		}
		
		//40
		
		public static void dDSelectByVisibleText(WebElement element, String text) {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		public static void dDgetOptions(WebElement element) {
			Select select=new Select(element);
			List<WebElement> options = select.getOptions();
		}
		
		public String dDGetOptionsByIndex(WebElement element,int index) {
			Select select=new Select(element);
			List<WebElement> options = select.getOptions();
			WebElement elementSub = options.get(index);
			String text = elementSub.getText();
			return text;
		}
		
		public String dDGetOptionsByAttribute(WebElement element,int index, String value) {
			Select select=new Select(element);
			List<WebElement> options = select.getOptions();
			WebElement elementSub = options.get(index);
			String text1 = elementSub.getAttribute(value);
			return text1;
		}
		
		public WebElement dDFirstSelectedOption(WebElement element) {
			Select select=new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}
		
		public static void dDDeselectByIndex(WebElement element, int index) {
			Select select=new Select(element);
			select.deselectByIndex(index);
		}
		
		public static void dDDeselectByValue(WebElement element, String value) {
			Select select=new Select(element);
			select.deselectByValue(value);
		}
		
		
		public static void dDDeselectByVisibleText(WebElement element, String text) {
			Select select=new Select(element);
			select.deselectByVisibleText(text);
		}
		
		public static void dDDeselectAll(WebElement element) {
			Select select=new Select(element);
			select.deselectAll();
		}
		
		public boolean dDisMultiple(WebElement element) {
			Select select=new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}
		
		//50
		
		public static void frameSwtichByIndex(String index) {
			driver.switchTo().frame(index);
		}
		
		public static void frameNameOrId(String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}
		
		public static void frameElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public static void returnToFrame() {
			driver.switchTo().defaultContent();
		}
		
		public static void frameReverse() {
			driver.switchTo().parentFrame();   //one by one process
		}
		
		public static void parentWindow() {
			String parentWindow = driver.getWindowHandle();
			driver.switchTo().window(parentWindow);
		}

		public static void allWindow() {
			String parentWindow = driver.getWindowHandle();
			driver.switchTo().window(parentWindow);
			Set<String> allWindow = driver.getWindowHandles();
			for (String string : allWindow) {
				if (!parentWindow.equals(allWindow)) {
					driver.switchTo().window(string);
				}
			}
		}
		
		
		public int frameCount(WebElement element) {
			List<WebElement> findElements = element.findElements(By.tagName("iframe"));
			int count = findElements.size();
			return count;
		}
		
		public int imgCount(WebElement element) {
			List<WebElement> findElements = element.findElements(By.tagName("img"));
			int count = findElements.size();
			return count;
		}
		
		public int dDownCount(WebElement element) {
			List<WebElement> findElements = element.findElements(By.tagName("select"));
			int count = findElements.size();
			return count;
		}
		//60
		public static void thread(int milliSecond ) throws InterruptedException {
			Thread.sleep(milliSecond);
		}
		
		public static void waitFluent(String id) {
			Wait wait=new FluentWait(driver).withTimeout(Duration.ofMinutes(1)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		}
		
		public static void waitImplicit() {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		public static void waitWebElementVisibilityOfElementLocated(String id) {
			WebDriverWait w=new WebDriverWait(driver, 5);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		}
		
		public static void waitWebElementElementToBeClickable(String id) {
			WebDriverWait w=new WebDriverWait(driver, 5);
			w.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		}
		
		public static void waitWebElementTextToBePresentInElement(WebElement element, String text) {
			WebDriverWait w=new WebDriverWait(driver, 5);
			w.until(ExpectedConditions.textToBePresentInElement(element, text));
		}
		
		public static void threadsleep() throws InterruptedException {
			Thread.sleep(5000);
		}
		
		
		public static void scrollUp(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollintoview(false)", element);
		}
		
		public static void scrollDown(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollintoview(true)", element);
		}
		
		public static void robot(int keycode) throws AWTException {
			Actions actions=new Actions(driver);
			Robot robot=new Robot();
			robot.keyPress(keycode);
			robot.keyRelease(keycode);
		}
		//70
		
		public static void robotTwoKey(int splCode,int keycode) throws AWTException {
			Actions actions=new Actions(driver);
			Robot robot=new Robot();
			robot.keyPress(splCode);
			robot.keyPress(keycode);
			robot.keyRelease(keycode);
			robot.keyRelease(splCode);

		}
		
		public String ExcelRead(String sheetName,int rowno,int cellno) throws Throwable {
		
				File file= new File("C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\POM.xlsx");
				FileInputStream stream= new FileInputStream(file);

				Workbook workbook= new XSSFWorkbook(stream);
				Sheet sheet = workbook.getSheet(sheetName);
				String str=null;
					
					Row row = sheet.getRow(rowno);
					Cell cell = row.getCell(cellno);	
					CellType type = cell.getCellType();
					
					switch (type) {
					
					case STRING:
						str = cell.getStringCellValue();
						break;
						
					case NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							Date date = cell.getDateCellValue();
							SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
							str = dateFormat.format(date);
						}
						else {
							double d = cell.getNumericCellValue();
							BigDecimal bigDecimal = BigDecimal.valueOf(d);
							str = bigDecimal.toBigInteger().toString();    // Decimal value convert in integer value
						}
						break;
						}	
				return str;
				}
		
		
		public static void excelOverWrite( String sheetName,int rowno,int cellno, String oldData, String newData) throws IOException {
			File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
			FileInputStream stream= new FileInputStream(file);

			Workbook workbook= new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowno);
			Cell cell = row.getCell(cellno);
			if (cell.equals(oldData)) {
				cell.setCellValue(newData);
			}
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		
		
		public static void excelCreateCell( String sheetName,int rowno,int cellno,String data) throws IOException {
			File file= new File("C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\POM.xlsx");
			FileInputStream stream= new FileInputStream(file);

			Workbook workbook= new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowno);
			Cell cell = row.createCell(cellno);
				cell.setCellValue(data);
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		
		public static void excelCreateRow( String sheetName,int rowno,int cellno,String data) throws IOException {
			File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
			FileInputStream stream= new FileInputStream(file);

			Workbook workbook= new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.createRow(rowno);
			Cell cell = row.getCell(cellno);
				cell.setCellValue(data);
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		
		public static void excelCreateRowAndCell( String sheetName,int rowno,int cellno,String data) throws IOException {
			File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
			FileInputStream stream= new FileInputStream(file);

			Workbook workbook= new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.createRow(rowno);
			Cell cell = row.createCell(rowno);
				cell.setCellValue(data);
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		
		public static void excelCreateWorkbook( String sheetName,int rowno,int cellno,String data) throws IOException {
			File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File");
		
			Workbook workbook= new XSSFWorkbook();
			Sheet sheet = workbook.createSheet(sheetName);
			Row row = sheet.createRow(rowno);
			Cell cell = row.createCell(cellno);
			cell.setCellValue(data);
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
		}
		
		//76
}
