package com.testbase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BaseClass{
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.entrata.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}