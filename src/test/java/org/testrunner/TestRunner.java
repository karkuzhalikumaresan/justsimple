package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,snippets=SnippetType.CAMELCASE,plugin={"pretty","json:target//report.json"},features="src\\test\\resources", glue="org.stepdefinition")
public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\karku\\eclipse-workspace\\fz\\MyProjectQ2\\target\\report.json");
	}

}
