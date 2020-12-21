package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenJeansPage {
	WebDriver driver;
	@FindBy(id="") WebElement homePageLogo;
	@FindBy(id="") WebElement womenmenu;
	public MenJeansPage(WebDriver x) {
		driver=x;
		PageFactory.initElements(driver, this);
	}
public void clickOnJeansUsingNew() {
	//////div[@class='_2CjJz']/div"
	List <WebElement> elements = driver.findElements(By.xpath("//div[@class='_2CjJz']/div"));
	//elements.get(i).click();
	int njsize = elements.size();
	Actions a = new Actions(driver);
	
	for(int i=1; i<njsize; i++) {
		WebElement element = driver.findElement(By.xpath("//div[@class='_2CjJz']/div["+i+"]/a[1]/img"));
		String text = element.get().getText();
		a.moveToElement(element.get(i).build().perform());
		if(text.equals() {
			element.get(i).click();
			break;
		}
		driver.navigate().back();
			
		}
		
		public void nestedLoop() {
			
			int ssize = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[6]/a")).size();
			for(int i=1;i<=ssize;i++) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li["+i+"]/a")).click();
			driver.navigate().back();
				
			int stsize = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[7]/a")).size();
			for(int j=1;j<=stsize;j++) {
			driver.findElement(By.xpath("*[@id=\\\\\\\"root\\\\\\\"]/div/div/div/div[2]/nav/ol/li["+i+"]/a")).click();
			driver.navigate().back();
			
			int lwsize = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[8]/a")).size();
			for(int k=1;i<=lwsize;k++) {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li["+i+"]/a")).click();
			driver.navigate().back();
			}
			}
			
		}
	}
 }




