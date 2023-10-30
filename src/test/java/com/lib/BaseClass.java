package com.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static WebDriver driver;
	protected void takeScreenshort() {}
	protected void closeBrowser() {}
	
	protected void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
	}
	
	protected void quitBrowser() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
