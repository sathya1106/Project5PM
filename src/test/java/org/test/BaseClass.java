package org.test;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	// BrowserLaunch
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	// edgeLaunch
	public static void edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	// Url
	public static void urlLaunch(String url) {
		driver.get(url);
	}

	// sendkeys
	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);
	
	}

	// click
	public static void click(WebElement e) {
		e.click();

	}

	// getTitle
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	// geturl
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// action Drag and Drop
	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();

	}

	// clickact
	public static void clickAct() {
		Actions a = new Actions(driver);
		a.click().perform();
	}

	// select
	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	// simplealert
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// Frames
	public static void framesbyIndex(int index) {
		driver.switchTo().frame(index);

	}

	
	public static String getAttribute(WebElement e)
	{
		return e.getAttribute("value");
	}
   //TakeScreenshot
	private void screenShot(String file) {
		

		File f = new File("C:\\Users\\sathy\\eclipse-workspace\\MavenTest\\src\\test\\resources\\" + file + ".png");

	}
    //JavaScriptExecutor
    private void js(WebElement e,String data) {
	
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
}

}


