package org.test;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Adactin extends BaseClass  {
	@BeforeClass
	public static void beforeClass() {
     chromeLaunch();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
	
	}
	@AfterClass
		public static void afterClass()
		{
			quit();
		}
	@BeforeMethod
	public void before() {
         Date d=new Date();
         System.out.println("Before test time...."+ d);
    }
	@AfterMethod
 	public void after() {
   Date d =new Date();
   System.out.println("After the test time......"+ d);
	}
	@Test
	
	public void create() throws Throwable {
    driver.get("http://adactinhotelapp.com/");
    Assert.assertTrue("Verify Url",getCurrentUrl().contains("adactin"));
    WebElement newr = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
    newr.click();
   WebElement user= driver.findElement(By.id("username"));
   user.sendKeys("21qfmpp1030");
   Assert.assertEquals("Verify Url is", "21qfmpp10",getAttribute(user));
   WebElement pass = driver.findElement(By.id("password"));
   pass.sendKeys("U4R@@46XAGPWTdW");
   WebElement pass1 = driver.findElement(By.id("re_password"));
   sendKeys(pass1,"U4R@@46XAGPWTdW");
   WebElement fn = driver.findElement(By.id("full_name"));
   sendKeys(fn,"Sathya A");
   WebElement email = driver.findElement(By.id("email_add"));
   sendKeys(email,"sathyasri1102@gmail.com");
   Thread.sleep(5000);

   WebElement check = driver.findElement(By.id("tnc_box"));
   click(check);
   Thread.sleep(5000);

   WebElement Register = driver.findElement(By.id("Submit"));
   click(Register);
	}
   @Test
   public void click() {
   WebElement ch = driver.findElement(By.xpath("//a[text()='Click here to login']"));
   ch.click();
   }
   
@Test 
public void login()
{
	WebElement username = driver.findElement(By.id("username"));
sendKeys(username,"21qfmpp1002");
WebElement password = driver.findElement(By.id("password"));
sendKeys(password,"U4R@@46XAGPWTdW");
WebElement log = driver.findElement(By.id("login"));
click(log);





}
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
		

	



