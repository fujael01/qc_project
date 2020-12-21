package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import db.Helper;

public class HomePage {
	WebDriver driver;
	@FindBy(id="") WebElement WomenPageLink;
	public HomePage(WebDriver x) {
		driver=x;
		PageFactory.initElements(driver, this);
	}
	public void verifyHomePageLogo() {
		Helper.verifyElement(driver.findElement(By.xpath("")));
	}

public void clickOnExpressOutlet() {
	Helper.clickOnElement(driver.findElement(By.xpath("")));
   }
public WomenPage clickOnWomenMenu() {
	Helper.clickOnElement(WomenPageLink);
	return new WomenPage();
 }
}
	
	
  




