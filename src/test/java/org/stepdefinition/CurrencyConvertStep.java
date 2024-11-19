package org.stepdefinition;

import org.baseclass.BaseClassQ2;
import org.junit.Assert;
import org.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrencyConvertStep extends BaseClassQ2 {
	
	PageObjectManager pom= new PageObjectManager();

	@Given("User is on xe website")
	public void userIsOnXeWebsite() {
	    
	}
	
	@When("User enter {string} select currency from and to country")
	public void userEnterSelectCurrencyFromAndToCountry(String string) {
		 pom.getConvertCurrencyPage().convertValues(string);
	}

	@When("User click convert button")
	public void userClickConvertButton() {
	     pom.getConvertCurrencyPage().convertBtnClick();
	}
	@Then("User should print the converted amount")
	public void userShouldPrintTheConvertedAmount() {
	     String convertedAmount = pom.getConvertCurrencyPage().convertedAmount();
	     System.out.println(convertedAmount);
	
	}








}
