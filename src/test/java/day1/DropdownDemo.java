package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shefali.singh/Documents/Automation Study/driver/chromedriver.exe");		
		WebDriver driver= new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Inputs']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("Selenium test");
						
		Thread.sleep(1000);
						
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
						
		Select dropdownObj=new Select(driver.findElement(By.xpath("//*[@id='dropdown']")));
		dropdownObj.selectByValue("2");
		
		System.out.println(dropdownObj.getFirstSelectedOption().getText());
		

		driver.quit();

		
		
	}

}
