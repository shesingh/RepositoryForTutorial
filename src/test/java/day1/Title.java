package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shefali.singh/Documents/Automation Study/driver/chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String fname ="MyFirstSCreenShot";
		Utility.takeScreenShot(driver, fname);
		
	}
}
