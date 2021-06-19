package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="location")
private WebElement Location;
@FindBy(id = "hotels")
private WebElement hotels;
@FindBy(id = "room_type")
private WebElement roomType;
@FindBy(id = "room_nos")
private WebElement noOfRooms ;
@FindBy(id = "datepick_in")
private WebElement checkIn;
@FindBy(id = "datepick_out")
private WebElement checkOut ;
@FindBy(id = "adult_room")
private WebElement adults ;
@FindBy(id = "child_room")
private WebElement chidren ;
@FindBy(id = "Submit")
private WebElement searchBtn  ;

public WebElement getLocation() {
	return Location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoOfRooms() {
	return noOfRooms;
}

public WebElement getCheckIn() {
	return checkIn;
}

public WebElement getCheckOut() {
	return checkOut;
}

public WebElement getAdults() {
	return adults;
}

public WebElement getChidren() {
	return chidren;
}

public WebElement getSearchBtn() {
	return searchBtn;
}

}
