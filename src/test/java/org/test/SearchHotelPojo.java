package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends BaseClass {
	public SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement nuofroom;
	@FindBy(id="datepick_in")
	private WebElement checkindt;
	@FindBy(id="datepick_out")
	private	WebElement checkoutdt;
	@FindBy(id="adult_room")
	private WebElement adults;
	@FindBy(id="child_room")
	private WebElement children;
	@FindBy(id="Submit")
	private WebElement search;	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNuofroom() {
		return nuofroom;
	}
	public WebElement getCheckindt() {
		return checkindt;
	}
	public WebElement getCheckoutdt() {
		return checkoutdt;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}

}
