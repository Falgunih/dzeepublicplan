package com.dzeepublicplan;

import org.testng.annotations.Test;

public class DppLoginPageTest extends TestDriver {

	public DppLoginPageTest() {
		super();
	}

	@Test
	public   void verifyDppLoginPageTest() {

		Dlp.dzeepublicplanLogin();
		Dp.Dppscreenshot();
		}

}
