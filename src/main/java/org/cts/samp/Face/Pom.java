package org.cts.samp.Face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pom extends Basee{
	static WebDriver driver;
	@Given("^user launches facebook url$")
    public void user_launches_facebook_url() throws Throwable {
		driver=getDriver();
		loadUrl("https://www.facebook.com");
    }
	 @When("^user enter username in user text field$")
	    public void user_enter_username_in_user_text_field(String username) throws Throwable {
		 WebElement e=driver.findElement(By.id("email"));
	    	type(e,username);
	    }

	    @Then("^user enter password in password text field$")
	    public void user_enter_password_in_password_text_field(String password) throws Throwable {
	    	WebElement f=driver.findElement(By.id("pass"));
	    	type(f,password);
    }

    @And("^user click login button in login page$")
    public void user_click_login_button_in_login_page() throws Throwable {
    	WebElement g=driver.findElement(By.xpath("//input[@value='Log In']"));
    	btnClk(g);
    	quitBrowser();
    }

}
