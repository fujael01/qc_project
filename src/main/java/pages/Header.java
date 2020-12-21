package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	WebDriver driver;
	@FindBy(id="") WebElement homePageLogo;
	@FindBy(id="") WebElement jeansMenu;
	
	public Header(WebDriver x) {
		driver=x;
		PageFactory.initElements(driver,this);
		
	}

}
