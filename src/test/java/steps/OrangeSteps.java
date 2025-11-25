package steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import PageLayer.LoginPage;
import baseLayer.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilityLayer.Reader;

public class OrangeSteps extends BaseTest {

	 private static LoginPage login;
	

@Given("User is on login page")
public void user_is_on_login_page() throws FileNotFoundException, IOException {
    
	BaseTest.setUp();
  
}

@When("User enter Username and Password")
public void user_enter_username_and_password() throws Exception, IOException {
    
   login = new LoginPage();
   login.loginFunctionality(Reader.getProperty("Username"),Reader.getProperty("password"));
  
}

@When("User click on login button")
public void user_click_on_login_button() {
    
  login.clickOnLoginButton();
	
}

	
}
