package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shefali.singh/Documents/Automation Study/driver/chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.xpath("//select[@id='tools1']"));
		
		Select toolDropDown= new Select(dd);

		List<WebElement> ddOptionList=toolDropDown.getOptions();
		
		List  actualList= new ArrayList();
		List  expectedList= new ArrayList();
		
		for (int i=0; i<ddOptionList.size(); i++) {
			String data = ddOptionList.get(i).getText();
			actualList.add(data);
		}
		
		expectedList.addAll(actualList);
				
		Collections.sort(expectedList);
		//To short list in reverse order
		Collections.sort(expectedList, Collections.reverseOrder());
		
		System.out.println("Test Result for Assending order: "+ expectedList.equals(actualList));
	}
}
