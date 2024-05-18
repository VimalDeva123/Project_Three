package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome_Browser {
	
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swarnalakshmi G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver My_Chrome = new ChromeDriver();
		My_Chrome.get("https://www.google.com/");
		My_Chrome.manage().window().maximize();
	}
}
