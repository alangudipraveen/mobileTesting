package com.stepDefinition;

import java.net.MalformedURLException;

import com.cucumberProject.BaseClass;
import com.pages.Homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	 Homepage homepage;
	
	@Given("User navigates to the Trivango App with {string} and {string} and {string} and {string} and {string}")
	public void user_navigates_to_the_myntra_app_with_and_and_and_and(String string, String string2, String string3, String string4, String string5) throws MalformedURLException, InterruptedException {
	    
		appLaunch(string, string2, string3, string4, string5);
		
		System.out.println("Trail");
		
	}
	@When("User click on the search icon")
	public void user_click_on_the_search_icon() throws InterruptedException {
		
	     homepage= new Homepage();
		 homepage.usersearchOption();
		
	   
	}
	@When("User enters the {string} in Search box")
	public void user_enters_the_in_search_box(String string) throws InterruptedException {
		
          homepage= new Homepage();
		
		   homepage.getSearchBoxAction(string);
	  
	}
	@Then("User performs the vertical scroll")
	public void user_performs_the_vertical_scroll() {
		
		performscroll(homepage.getWiki());
	   
	}


}
