package com.cucumberProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\prave\\OneDrive\\Documents\\naveenworkspace\\MobileTestingAug\\src\\test\\resources\\homepage.feature",
glue ="com.stepDefinition" )
public class TestRunner {

}
