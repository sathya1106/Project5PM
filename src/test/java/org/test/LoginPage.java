package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	private  WebElement click;
	
	@FindBy(xpath="//span[text()='Sign in']")
    private WebElement signIn;
	
	@FindBy(id="ap_email")
	private WebElement emailId;
	
	@FindBy(id="continue")
	private WebElement Login;
	@FindBy(name="password")
	private WebElement password;

	@FindBy(id="signInSubmit")
	private WebElement Submit;
	public WebElement getClick() {
		return click;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSubmit() {
		return Submit;
	}
		


}
