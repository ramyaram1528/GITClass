package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookJunit {
	public WebDriver driver = new ChromeDriver();
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	}	
	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void test() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.id("pass")).sendKeys("greens@123");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	@AfterClass
	public static void afterclass() {
		
		System.out.println("quit browser");

	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println(d);

	}

}
