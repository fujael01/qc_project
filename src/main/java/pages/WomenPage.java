package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	WebDriver driver;
	@FindBy(id="") WebElement homePageLogo;
	@FindBy(id="") WebElement womenmenu;
	public WomenPage(WebDriver x) {
		driver=x;
		PageFactory.initElements(driver, this);
	}
}
