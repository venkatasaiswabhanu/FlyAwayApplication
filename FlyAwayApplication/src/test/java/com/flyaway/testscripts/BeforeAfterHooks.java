package com.flyaway.testscripts;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfterHooks extends Tools {
	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/FlyAway/");
		
	}
	
	@After
	
	public void tearDown() {
		driver.quit();
	}

}
