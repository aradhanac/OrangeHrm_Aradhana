package steps;

import PageLayer.PimPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PimPageSteps {
	
	static PimPage pim;
	
	@Given("User click on Pim Page Link")
	public void user_click_on_pim_page_link() {
	  
		pim = new PimPage();
		
		pim.clickOnPimLink();
		
		
	}
	@When("User click on Add Employee Button")
	public void user_click_on_add_employee_button() {
	   
		pim.clickOnAddEmpButton();
	}
}
