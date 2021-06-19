package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement TxtUserName;
	@FindBy(id = "password")
	private WebElement TxtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return TxtUserName;
	}

	public WebElement getTxtPassword() {
		return TxtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}