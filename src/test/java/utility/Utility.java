package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void takeScreenShot(WebDriver driver, String fname) {
		
		try {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMhhmmss");
		String fpath ="./ScreenShot/"+fname+formatter.format(date)+".png";
		System.out.println(fpath);
		
		File destFile = new File(fpath);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourcefile, destFile);
		} 
		
		catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
