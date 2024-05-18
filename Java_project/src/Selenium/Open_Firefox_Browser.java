package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox_Browser {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver My_Fire_Fox = new FirefoxDriver();
		My_Fire_Fox.get("https://www.google.com/");
		My_Fire_Fox.manage().window().maximize();
	}
}
