package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton extends BaseClass {
public RadioButton() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="radiobutton_0")
private WebElement radioBtn;
@FindBy(id="continue")
private WebElement ContinueBtn;

public WebElement getRadioBtn() {
	return radioBtn;
}

public WebElement getContinueBtn() {
	return ContinueBtn;
}

}

