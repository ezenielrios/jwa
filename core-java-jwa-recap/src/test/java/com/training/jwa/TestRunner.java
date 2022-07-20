package com.training.jwa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src\\test\\resources\\Features" , 
			glue = "com.training.jwa",
			monochrome = true,
			plugin = {
						"pretty", "html:target/HTMLReports/index.html",
						"json:target/JSONReports/report.json",
						"junit:target/XMLReports/report.xml"
			}
			//tags = "@logintest"
		)
public class TestRunner {

}
