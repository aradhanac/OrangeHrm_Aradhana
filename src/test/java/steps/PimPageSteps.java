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
	@When("user enter {string} as firstname and {string} as midname and {string} as lastname")
	public void user_enter_as_firstname_and_as_midname_and_as_lastname(String fname, String mname, String lname) {
		pim.addEmployee(fname, mname, lname);
	   
	}
	@When("user click on save button")
	public void user_click_on_save_button() {
		pim.clickOnSavebttn();
	   
	}

}
