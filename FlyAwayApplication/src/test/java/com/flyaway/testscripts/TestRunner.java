package com.flyaway.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features", glue="com.flyaway.testscripts")

public class TestRunner extends AbstractTestNGCucumberTests{

}
