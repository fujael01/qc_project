package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import db.Helper;

public class TopsOptionPage extends LoadableComponent {
	WebDriver driver;

	@FindBy(id="") WebElement camisLink;
	public TopsOptionPage(WebDriver x) {
		driver=x;
		PageFactory.initElements(driver, this);
	}
	public CamisPage clickcamisPage() {
		Helper.clickOnCamis(camisLink);
		return new CamisPage();
	}
	@Override
	protected void load() {
		driver.navigate().to("");
		Header h = new Header(driver); 
	}
	@Override
	protected void isLoaded() throws Error {
	Assert.assertTrue(driver.getCurrentUrl().equals(""));
		Header h = new Header(driver); 
		
	}
	
}

