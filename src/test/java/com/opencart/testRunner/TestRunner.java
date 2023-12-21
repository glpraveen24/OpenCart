package com.opencart.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/" }, glue = "com.opencart.stepDefinitions", plugin = { "pretty",
		"html:reports/myreport.html", "rerun:target/rerun.txt" },

		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true // to avoid junk characters in output

// tags="@sanity" // this will execute scenarios tagged with @sanity
// tags="@regression"
// tags="@sanity and @regression" //Scenarios tagged with both @sanity and
// @regression
// tags="@sanity and not @regression" //Scenarios tagged with @sanity but not
// tagged with @regression
// tags="@sanity or @regression" //Scenarios tagged with either @sanity or
// @regression
)
public class TestRunner {

}