package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {     					
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		return driver;   
	}	
	public void launchUrl(String Url) {								// get()
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public void type(WebElement element,String data) {             // sendKeys()
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {                    // click()
		element.click();
	}
	public void quitBrowser() {                  // quit()
		driver.quit();
	}
	public void close() {						// close()
		driver.close();
	}
		public void dropdown(WebElement element,int num) {    	// dropdown
		Select s = new Select(element);
		s.selectByIndex(num);
	}
	
	public String gettext(WebElement element) {   		//
		String text=element.getText();
		return text;		
	}
	
	public String getat(WebElement element) {   		//
		String text=element.getAttribute("value");
		return text;
				
	}
	
}
