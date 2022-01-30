package org.test;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinSample extends BaseClass {
	@BeforeClass
	public static void beforeClass() {

	chromeLaunch();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	}
	@AfterClass
	public static void afterClass() { }
	@Before
	public void before() {
        Date d=new Date();
        System.out.println("Before test time...."+ d);
         
	}
	@After
 	public void after() {
   Date d =new Date();
   System.out.println("After the test time......"+ d);
	}
	@Test
	public void test1() {
  System.out.println("test1");
  
}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
}
