package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement Login;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void loginFunctionality(String uname, String pass) {
		Username.sendKeys(uname);
		Password.sendKeys(pass);
		
	
	}
	
	public void clickOnLoginButton() {
		Login.click();
		
	}
}
