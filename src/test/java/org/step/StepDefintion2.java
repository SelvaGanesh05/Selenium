package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pac.UtilityBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion2 extends UtilityBaseClass {

@Given("User should be in facebook login page")
public void user_should_be_in_facebook_login_page() {
	launchBrowser();
	maximize();
	launchUrl("https://www.facebook.com/");
	
}

@When("User enter values to emailfeild {string} and passwordfeild {string}")
public void user_enter_values_to_emailfeild_and_passwordfeild(String emailValues, String passValues) {
	WebElement username = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	
	fillValue(username, emailValues);
	fillValue(password, passValues);	
	
}

@When("User enter the login button")
public void user_enter_the_login_button() {
	WebElement loginbtn = driver.findElement(By.name("login"));
	clickBtn(loginbtn);
}


@Then("User quit the browser")
public void user_quit_the_browser() {
	System.out.println("close");
}


}
