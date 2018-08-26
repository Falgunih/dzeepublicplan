package com.dzeepublicplan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dzeepublicplan.base.TestBase;

public class DppLoginPage extends TestBase {
	
	
	@FindBy(id="loginEmail")
	private WebElement dzeeloginid;
	@FindBy(id="loginPassword")
	private WebElement dzeepassword;
	@FindBy(id="loginButton")
	private WebElement dzeeloginbutton; 
	
	
	public DppLoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void dzeepublicplanLogin(){
		dzeeloginid.sendKeys("mytesting@dzee.com");
		dzeepassword.sendKeys("Test@123");
		dzeeloginbutton.click();
	}

}
