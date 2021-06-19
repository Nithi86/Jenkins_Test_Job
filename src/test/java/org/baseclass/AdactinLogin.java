package org.baseclass;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class AdactinLogin extends BaseClass {

LoginPage login;
SearchHotel hotel;
RadioButton radio;
BookNow book;
Order order1;

@Given("User is on Adactin Web Page")
public void user_is_on_Adactin_Web_Page() {

	getDriver();
	launchUrl("http://adactinhotelapp.com/");
   
}

@When("User enters {string}and {string}")
public void user_enters_and(String user, String pass) {
	LoginPage login=new LoginPage();
	WebElement txtUserName = login.getTxtUserName();
	enterText(txtUserName, user);
	WebElement txtPassword = login.getTxtPassword();
	enterText(txtPassword, pass);
  
}

@When("should click login button")
public void should_click_login_button() {
	LoginPage login=new LoginPage();
	WebElement btnLogin = login.getBtnLogin();
	btnClick(btnLogin);
	
}
@When("User Should enters{string},{string},{string},{string},{string},{string},{string},{string}")
public void user_Should_enters(String location, String Hotel, String RoomType, String NoRoom, String checkIn, String CheckOut, String Adult, String chidren) {
	 hotel=new SearchHotel();
	
	WebElement location2 = hotel.getLocation();
	selectByVisibleText(location2, location);
	
	WebElement hotel1=hotel.getHotels();
	selectByVisibleText(hotel1,Hotel);
	
	WebElement roomType=hotel.getRoomType();
	selectByVisibleText(roomType,RoomType);
	
	WebElement noOfRoom=hotel.getNoOfRooms();
	selectByVisibleText(noOfRoom,NoRoom);
	
	WebElement checkInDate=hotel.getCheckIn();
	enterText(checkInDate,checkIn);
	
	WebElement checkOutDate=hotel.getCheckOut();
	enterText(checkOutDate,CheckOut);
	
	WebElement Adults=hotel.getAdults();
	selectByVisibleText(Adults,Adult);
	
	WebElement chidren1=hotel.getChidren();
	selectByVisibleText(chidren1,chidren);
		


}

@When("User should click search button")
public void user_should_click_search_button() {
    WebElement btnSearch= hotel.getSearchBtn();
    btnClick(btnSearch);
}

@When("User should click select button and continue button")
public void user_should_click_select_button_and_continue_button() {
	radio=new RadioButton();
	WebElement radioBtn = radio.getRadioBtn();
	btnClick(radioBtn);
  WebElement continueBtn = radio.getContinueBtn();  
	btnClick(continueBtn);
}

@When("User should book a hotel {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_book_a_hotel(String firstName, String lastName, String BillingAddress, String creditCardNo, String creditCardType, String ExpiryDate, String ExpiryYear, String ccv) {
	book= new BookNow();
	WebElement firstName1 = book.getFirstName();
	enterText(firstName1, firstName);
	WebElement lastName1 = book.getLastName();
	enterText(lastName1, lastName);  
	WebElement bilingAddress1 = book.getBillingAddress();
	enterText(bilingAddress1, BillingAddress);  
	WebElement creditNo1 = book.getCreditcardNo();
	enterText(creditNo1, creditCardNo); 
	WebElement creditType1 = book.getCreditcardType();
	enterText(creditType1, creditCardType); 
	WebElement ExpireDate1 = book.getExpireMonth();
	enterText(ExpireDate1, ExpiryDate); 
	WebElement ExpireYear1 = book.getExpireYear();
	enterText(ExpireYear1, ExpiryYear); 
	WebElement cCvv1 = book.getCvv();
	enterText(cCvv1, ccv); 
}

@When("User should click Book Now")
public void user_should_click_Book_Now() {
	
	WebElement btnBook= book.getBtnBook();
    btnClick(btnBook);
}

@When("User shouldget the OrderNo")
public void user_shouldget_the_OrderNo() throws InterruptedException {
	Thread.sleep(8000);
	order1=new Order();
	WebElement orderNo = order1.getOrder();
	String attribute = orderNo.getAttribute("Value");
	System.out.println(attribute);
	
}


@Then("User sould get verify message")
public void user_sould_get_verify_message() {
    System.out.println("WelDone!......");
}




}
