package com.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class BaseClass {
	private static WebDriver driver;
		
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
	
	
	/**
	 * This method helps to take a screenshort of entire webpage
	 */
	protected void takeScreenshortEntirePage(String path) {}
	
	
	/**
	 * This method helps to take a screenshort of specified webelement
	 */
	protected void takeScreenshortWebElement(WebElement element, String path) {}
}
