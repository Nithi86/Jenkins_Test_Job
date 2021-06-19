package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order extends BaseClass{
	public Order() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_no")
	private WebElement order;

	
	public WebElement getOrder() {
		return order;
	}

}
