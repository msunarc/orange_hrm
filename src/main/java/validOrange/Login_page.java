package validOrange;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page {
 WebDriver driver;
 public Login_page(WebDriver driver) {
	 this.driver=driver;
 }
 @FindBy(how=How.XPATH,using="//input[@id='txtUsername']")
 WebElement Username;
 @FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
 WebElement Password;
 @FindBy(how=How.XPATH,using="//input[@name='Submit']")
 WebElement click;
 
 public void username(String name) {
	 Username.clear();
	 Username.sendKeys(name);
 }
	 public void password(String word) {
		 Password.clear();
		 Password.sendKeys(word);
	 }
		 public void Submit() {
			// Actions action =new Actions(driver);
		//	 action.click(click).build().perform();					 
			 	click.click();
			 	
		 }
	 
 }

