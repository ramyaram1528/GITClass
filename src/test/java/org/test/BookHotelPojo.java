package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first_name")
	private WebElement fstname;
	@FindBy(id="last_name")
	private WebElement lstname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccno;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now") 	
	private WebElement book;
	@FindBy(id="order_no")
	private WebElement orderno;
	
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getFstname() {
		return fstname;
	}
	public WebElement getLstname() {
		return lstname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
}
