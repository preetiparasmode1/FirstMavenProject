package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="src\\main\\java\\com\\features",
		glue="com.stepdept",
		plugin= {"html:target"},
		//dryRun=true,  // it is used to complie feature file
		monochrome=true,//it is used for readable format
		tags= {"@Jbk, @Abc, @Addition Calculator"}
		
		)

public class Runner {
     
}
