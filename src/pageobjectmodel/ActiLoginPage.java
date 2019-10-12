package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActiLoginPage {

	@FindBy(name="username")
	private WebElement usernameTB;

	public void setUsername(String un) {
		usernameTB.sendKeys(un);
	}

	@FindBy(name="pwd")
	private WebElement passwordTB;

	public void setPassword(String pwd) {
		passwordTB.sendKeys(pwd);
	}

	@FindBy(id="loginButton")
	private WebElement loginBtn;

	public void clickLoginBtn() {
		loginBtn.click();
	}

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	public void countLinks() {
		System.out.println(allLinks.size());
	}

	public ActiLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
