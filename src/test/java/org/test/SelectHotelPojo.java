package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends BaseClass {	
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}
}
