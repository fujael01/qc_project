package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import db.Helper;

public class BaseTest {
	static Properties pp;
	WebDriver driver;
	@BeforeClass
	public static void configPropFile() throws IOException {
		pp=Helper.readPropertyFile("C:\\Users\\fujae\\eclipse-workspace\\mavenProject_19620");
	}
	@Before
	public void openBrowser() {
		
		String brows=pp.getProperty("browser");
		if(brows.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(brows.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(brows.equals("ie")) {
			driver=new InternetExplorerDriver();
		}
		driver.get(pp.getProperty("url"));
		
		
	}

}



