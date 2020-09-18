package validation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import validOrange.Browser;
import validOrange.Login_page;

public class Test_Orange{
WebDriver driver;
Validation valid;
Login_page page;

@Test
public void Orange_test() {
	driver=Browser.launch();
	valid= PageFactory.initElements(driver, Validation.class);
	valid.validatebrowser();
}
@Test(dependsOnMethods = {"Orange_test"})
	public void LoginPage(){
	page=PageFactory.initElements(driver,Login_page.class);
	page.username("Admin");
	page.password("admin123");
	page.Submit();
}

}
