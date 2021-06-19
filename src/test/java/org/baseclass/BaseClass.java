package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
 
public static void getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NITHYA\\eclipse-workspace\\POM\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
public static void launchUrl(String data) {
	driver.get(data);

}
public static void enterText(WebElement element, String data) {
	element.sendKeys(data);
}
public static void btnClick(WebElement element) {
	element.click();

}
public static void selectByVisibleText(WebElement element, String data) {
	new Select(element).selectByVisibleText(data);

}
public static void selectByValue(WebElement element, String data) {
	new Select(element).selectByValue(data);
}

public static void quitBrowser() {
driver.quit();
}

}
