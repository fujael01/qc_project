package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Helper {
	
	public static Properties readPropertyFile(String path) throws IOException {
		
		FileInputStream f = new FileInputStream(new File(path));
		Properties pp= new Properties();
		pp.load(f);
		return pp;
		
	}
	public static void verifyElement(WebElement element) {
		element.isDisplayed();
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void clickOnTopsMenu(WebElement element) {
		element.click();
	}
	
	public static void clickOnCamis(WebElement element) {
		element.click();
	}
	
	//reverse a string
	StringBuffer sb = new StringBuffer();
	for(int i=s.length()-1;i>=0;i--) {
		sb.append(s.charAt(i));
	}
	
	public void getDuplicateArray() {
		
		int[] a= {
	}


}



