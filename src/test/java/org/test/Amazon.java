package org.test;

import org.openqa.selenium.interactions.Actions;

public class Amazon extends BaseClass {
public static void main(String[] args) {
	chromeLaunch();
	urlLaunch("https://www.amazon.com/");
	LoginPage l =new LoginPage();
	//Actions a= new Actions(driver);
	//a.moveToElement(l.getClick()).perform();
	click(l.getClick());
    sendKeys(l.getEmailId(),"sathyasri1102@gmail.com");
	click(l.getLogin());
	sendKeys(l.getPassword(),"Sathya@1106");
	click(l.getSubmit());
}
}
