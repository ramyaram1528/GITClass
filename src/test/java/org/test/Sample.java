package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample{
	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.launchUrl("https://adactinhotelapp.com/");
		LoginPojo lp=new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.type(txtUser, "ramyaramk");
		b.type(lp.getTxtPass(), "aathu@1528");
		b.btnClick(lp.getBtnLogin());
		SearchHotelPojo sr=new SearchHotelPojo();
		b.dropdown(sr.getLocation(), 2);
		b.dropdown(sr.getHotel(), 2);
		b.dropdown(sr.getRoomtype(), 2);
		b.dropdown(sr.getNuofroom(), 2);
		b.type(sr.getCheckindt(), "22/06/2022");
		b.type(sr.getCheckoutdt(), "25/06/2022");
		b.dropdown(sr.getAdults(), 2);
		b.dropdown(sr.getChildren(), 2);
		b.btnClick(sr.getSearch());
		SelectHotelPojo sh=new SelectHotelPojo();
		b.btnClick(sh.getRadiobtn());
		b.btnClick(sh.getNext());
		BookHotelPojo bk=new BookHotelPojo();
		b.type(bk.getFstname(), "Ramya");
		b.type(bk.getLstname(), "ram");
		b.type(bk.getAddress(),"a-19,east chess st");
		b.type(bk.getCcno(), "1234567891236549");
		b.dropdown(bk.getCctype(), 3);
		b.dropdown(bk.getExpmonth(), 3);
		b.dropdown(bk.getExpyear(), 3);
		b.type(bk.getCvv(), "354");
		b.btnClick(bk.getBook());
		Thread.sleep(5000);
		System.out.println(b.getat(bk.getOrderno()));	
		System.out.println(b.getat(bk.getFstname()));
		b.quitBrowser();
		
		/*BaseClass b = new BaseClass();
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
		LoginPojo lp=new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.type(txtUser, "greens");
		b.type(lp.getTxtPass(), "greens");
		b.btnClick(lp.getBtnLogin());
		b.quitBrowser();*/
		
				
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("java");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		driver.quit();*/
		
		/*BaseClass b = new BaseClass();
		WebDriver driver=b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		b.type(txtUser, "greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		b.type(txtPass, "greens");
		WebElement btnLogin = driver.findElement(By.id("login"));
		b.btnClick(btnLogin);
		b.quitBrowser(driver);*/		
	}

}
