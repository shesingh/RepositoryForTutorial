package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelaniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:/Users/shefali.singh/Documents/Automation Study/driver/chromedriver.exe");
				
	 WebDriver driver= new ChromeDriver();
	 driver.get("http://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
												
	 List<WebElement> checkboxes=driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
				
	 for (int i=0;i<checkboxes.size(); i++) {
		 WebElement checkbox=checkboxes.get(i);
		 System.out.println(checkbox.getText());
		 System.out.println(checkbox.getAttribute("id"));
		 checkbox.click();
			}			
	}

}
