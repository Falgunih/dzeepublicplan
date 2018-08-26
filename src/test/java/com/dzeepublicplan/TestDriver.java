package com.dzeepublicplan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dzeepublicplan.base.TestBase;
import com.dzeepublicplan.pages.DppLoginPage;
import com.dzeepublicplan.utils.Dpputils;

public class TestDriver  extends TestBase{
	DppLoginPage Dlp;
	Dpputils Dp;
	
	@BeforeMethod
	public void setup(){
		init();
		 Dlp = new DppLoginPage();
		 Dp= new Dpputils();
	}
   
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}
