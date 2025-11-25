package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseTest;


public class PimPage extends BaseTest {

	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimButton;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	WebElement AddEmpButton;
	
	public PimPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnPimLink() {
		
		this.pimButton.click();
	}
	
	public void clickOnAddEmpButton() {
		
		this.AddEmpButton.click();
	}
	
	
}
