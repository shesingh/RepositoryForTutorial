package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shefali.singh/Documents/Automation Study/driver/chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li/a[contains(text(),'JavaScript')]")).click();
						
		System.out.println("Test Completed");		
	}
}
