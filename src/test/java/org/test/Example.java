package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	public static WebDriver driver;
	@Parameters({"UserName","PassWord"})
	@Test
	public void login(String s1,String s2) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement txtUser = driver.findElement(By.id("username"));
        txtUser.sendKeys(s1);
        WebElement txtPass = driver.findElement(By.id("password"));
        txtPass.sendKeys(s2);
        WebElement btnLogin = driver.findElement(By.id("login"));
        btnLogin.click(); 
	}
        @Parameters({"InDate","OutDate"})
        @Test
        public void searchHotel(String d1,String d2) {
        Select location = new Select (driver.findElement(By.id("location")));
       location.selectByIndex(3);
		Select hotel = new Select(driver.findElement(By.id("hotels")));
		hotel.selectByIndex(4);
		Select roomType= new Select(driver.findElement(By.id("room_type")));
		roomType.selectByIndex(3);
		Select roomNo=new Select(driver.findElement(By.id("room_nos")));
		roomNo.selectByIndex(3);
		driver.findElement(By.id("datepick_in")).sendKeys(d1);
		driver.findElement(By.id("datepick_out")).sendKeys(d2);
		Select adult= new Select(driver.findElement(By.id("adult_room")));
		adult.selectByIndex(3);
		Select children= new Select(driver.findElement(By.id("child_room")));
		children.selectByIndex(3);
		driver.findElement(By.id("Submit")).click();
        }
		@Parameters({"FirstName","LastName","Address","CCNo","CVVNum"})
        @Test
		public void bookHotel(String b1,String b2,String b3,String b4,String b5) throws InterruptedException {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys(b1);
		driver.findElement(By.id("last_name")).sendKeys(b2);
		driver.findElement(By.id("address")).sendKeys(b3);
		driver.findElement(By.id("cc_num")).sendKeys(b4);
		Select CCType=new Select(driver.findElement(By.id("cc_type")));
		CCType.selectByIndex(2);;
        Select month=new Select(driver.findElement(By.id("cc_exp_month")));
        month.selectByIndex(2);
        Select year =new Select(driver.findElement(By.id("cc_exp_year")));
        year.selectByIndex(2);
        driver.findElement(By.id("cc_cvv")).sendKeys(b5);
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
       WebElement scrollOrder = driver.findElement(By.name("order_no"));
		String at = scrollOrder.getAttribute("value");
        System.out.println(at);
          String attribute = driver.findElement(By.id("first_name")).getAttribute("value");
       System.out.println(attribute);
        driver.quit();
        
		}
}
