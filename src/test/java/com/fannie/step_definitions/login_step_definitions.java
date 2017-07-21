package com.fannie.step_definitions;

import com.fannie.selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step_definitions {

	SeleniumFunctions sf = new SeleniumFunctions();
	
	
	
	@Given("^user is on sdettraining homepage$")
	public void user_is_on_sdettraining_homepage() throws Throwable {
		
		sf.createDriver();
		sf.ishomepageDisplayed();
		System.out.println("user is executing code from..SDETtraining homepage..will come here ");
	}

	@When("^user clicks on Signin link$")
	public void a_user_click_on_Signin_link() throws Throwable {
		
		System.out.println("user is executing code from..signin homepage..will come here ");
	}

	@When("^user enters \"([^\"]*)\" as username or email address$")
	public void user_enters_username_or_email_address(String username) throws Throwable {
		System.out.println("user entered user id.will come here ");
	}

	public void user_enters_password(String password) throws Throwable {
		
		System.out.println("user entered pwd..will come here ");
	}

	@When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
	}
	
	
	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {

	}	

	@Then("^user should see Welcome back message$")
	public void user_should_see_welcome_back_message() throws Throwable{
		
	}


}