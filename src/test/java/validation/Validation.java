package validation;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Util.BasePage;

public class Validation extends BasePage {
	WebDriver driver;

	public Validation(WebDriver driver) {
		this.driver = driver;
	}

	public void validatebrowser() {
		String Expected_Browser_Tile = "OrangeHRM";
		Assert.assertTrue((driver.getTitle()).contains(Expected_Browser_Tile), "correct page");
		
		WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		String forgotActualPassword = forgotPassword.getText();
		String expected = "Forgot your password?";
		Assertion("Forgot Password is Missing", expected, forgotActualPassword);

	}
	public void TakescreenShot(String path,WebDriver driver) {
	DateFormat dateformat= new SimpleDateFormat("dd-mm-yyyy HH:MM:SS");
	Date date=new Date();
	String TimeStamp = dateformat.format(date);
	
	TakesScreenshot takeshot=((TakesScreenshot)driver);
	File src=takeshot.getScreenshotAs(OutputType.FILE);
	File file=new File(".\\snapshot");
	if(!file.exists())
		file.mkdir();
	try {
		FileUtils.copyFile  (src, ".\\snapshot\screenshot"+TimeStamp+path+".jpg");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	
	
	}
	
	
}
}