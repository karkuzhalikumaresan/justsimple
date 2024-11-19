package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.baseclass.BaseClassQ2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.baseclass.BaseClassQ2;

public class HooksClass extends  BaseClassQ2 {
	
	
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException{
			browserLaunch();
		    enterAppliUrl("https://www.xe.com/");
		    maximizeWindow();
		    implicitWait();
		    
		  
	}
	
	@After
	public void AfterScenario(Scenario scenario) {
		
		boolean b = scenario.isFailed();
		
		if(!b) {
			scenario.attach(screenshot(), "images/png", "Every Scenario");
		}
		//closeAllWindow();
		
	}
}
