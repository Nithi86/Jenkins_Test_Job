package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow extends BaseClass {
public BookNow() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement firstName;
@FindBy(id="last_name")
private WebElement lastName;
@FindBy(id="address")
private WebElement billingAddress;
@FindBy(id="cc_num")
private WebElement creditcardNo; 
@FindBy(id="cc_type")
private WebElement creditcardType;
@FindBy(id="cc_exp_month")
private WebElement ExpireMonth;
@FindBy(id="cc_exp_year")
private WebElement ExpireYear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement btnBook;

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getBillingAddress() {
	return billingAddress;
}

public WebElement getCreditcardNo() {
	return creditcardNo;
}

public WebElement getCreditcardType() {
	return creditcardType;
}

public WebElement getExpireMonth() {
	return ExpireMonth;
}

public WebElement getExpireYear() {
	return ExpireYear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBtnBook() {
	return btnBook;
}
}
