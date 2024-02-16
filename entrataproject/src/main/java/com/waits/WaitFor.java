package com.waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.testbase.BaseClass;
import com.testbase.TestBase;

public class WaitFor extends BaseClass {
	private static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(TestBase.driver);
	}

	public static void withTimeOut(int a) {
		wait.withTimeout(Duration.ofSeconds(a));
	}
}