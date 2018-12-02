package com.test.headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadLessCromeTest {
	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("window-size=1400,800");
		chromeOptions.addArguments("headless");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
