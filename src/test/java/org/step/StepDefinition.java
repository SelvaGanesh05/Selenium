package org.step;

import java.util.List;
import java.util.Map;

import org.checkerframework.checker.units.qual.Luminance;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pac.UtilityBaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilityBaseClass {

	@Given("User must be in the facebook login page")
	public void user_must_be_in_the_facebook_login_page() {
		launchBrowser();
		maximize();
		launchUrl("https://www.facebook.com/");
	}

	@When("User enter the valid username and invalid password")
	public void user_enter_the_valid_username_and_invalid_password(DataTable d) {

		List<Map<String, String>> map = d.asMaps();

		Map<String, String> map1 = map.get(2);
		String name = map1.get("userKey");

		Map<String, String> map2 = map.get(3);
		String pass = map2.get("emailKey");

		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));

		fillValue(username, name);
		fillValue(password, pass);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		// clickBtn(login);
	}

	@Then("User must be in invalid page")
	public void user_must_be_in_invalid_page() {
		System.out.println("close");

	}

}
