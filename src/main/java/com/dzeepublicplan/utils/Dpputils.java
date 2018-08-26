package com.dzeepublicplan.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.dzeepublicplan.base.TestBase;

public class Dpputils extends TestBase
{
	public   void Dppscreenshot(){
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File tgt = new File("C:/Dzeepublicplan/com.dzeepublicplan/screenshot.png");
		try {
			FileUtils.copyFile(src, tgt);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
		
		
	}

}
