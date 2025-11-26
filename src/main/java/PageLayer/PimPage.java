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
	
	@FindBy(name ="firstName")
	WebElement firstnamebox;
	
	@FindBy(name ="middleName")
	WebElement midnamebox;
	
	@FindBy(name ="lastName")
	WebElement lastnamebox;
	
	@FindBy(xpath="//button[text() =' Save ']")
	WebElement savebttn;
	
	
	public PimPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnPimLink() {
		
		this.pimButton.click();
	}
	
	public void clickOnAddEmpButton() {
		
		this.AddEmpButton.click();
	}
	
	public void addEmployee(String fname,String mname , String lname)
	{
		firstnamebox.sendKeys(fname);
		midnamebox.sendKeys(mname);
		lastnamebox.sendKeys(lname);
		
		
	}
	public void clickOnSavebttn()
	{
		savebttn.click();
	}
	
	
}
