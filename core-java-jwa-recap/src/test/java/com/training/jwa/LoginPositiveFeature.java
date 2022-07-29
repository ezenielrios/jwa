package com.training.jwa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPositiveFeature {
	
	@Given("The employee is on the login page")
	public void the_employee_is_on_the_login_page() {
	   
	}

	@When("The employee types {string} into username input")
	public void the_employee_types_username_into_username_input(String username) {
		System.out.println("Username extered is :"+username);
	}

	@When("The employee types {string} into password input")
	public void the_employee_types_password_into_password_input(String password) {
		System.out.println("Password extered is :"+password);

	}

	@When("The employee clicks on the login button")
	public void the_employee_clicks_on_the_login_button() {
	   
	}

	@Then("the employee should be on the {string} page")
	public void the_employee_should_be_on_the_page(String role) {
		System.out.println("Role is :"+role);

	}

	@Then("The employee should see their name {string} {string} on the home page")
	public void the_employee_should_see_their_name_fname_lname_on_the_home_page(String fname,String lname) {
		System.out.println("FName and lname is "+fname+"  "+lname);

	}


}
