package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^user is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// code to landing on netbankng
		System.out.println("navigated to Landing url");
	}

	@When("^user login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("Logged in succesfully");
	}
	
	 @When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	     
		 System.out.println(strArg1);
		 System.out.println(strArg2);
		 
	    }


	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("home page validated");
	}

	@And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
      System.out.println(strArg1);
    }
}