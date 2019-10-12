package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	//Declaration
		@FindBy(id="loginButton")
		private WebElement loginBtn;
		
		//Initialization
		public PomClass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utillization
		public void clickLoginBtn()
		{
			loginBtn.click();
		}


}
