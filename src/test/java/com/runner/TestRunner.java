package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.lib.BaseClass;

public class TestRunner extends BaseClass {

	@BeforeClass
	public void setup() {
		lauchBrowser();
	}

	@AfterClass
	public void teardown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		quitBrowser();
	}
	
	@Test
	public void  testHomege() {
		
	}
}