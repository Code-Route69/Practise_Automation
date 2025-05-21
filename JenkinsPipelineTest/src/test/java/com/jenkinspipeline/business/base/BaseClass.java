package com.jenkinspipeline.business.base;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteStart() {
		Reporter.log("Suite is Starting", true);
	}

	@BeforeTest
	public void testStart() {
		switch (System.getProperty("browser")) {
		case "chrome" -> Reporter.log("Test is Starting in chrome browser", true);
		case "firefox" -> Reporter.log("Test is Starting in firefox browser", true);
		case "msedge" -> Reporter.log("Test is Starting in msedge browser", true);
		default ->
		throw new IllegalArgumentException("Unexpected value: " + System.getProperty("browser"));
		}
	}

	@BeforeMethod
	public void methodStart() {
		Reporter.log("Method is Starting", true);
	}

	@AfterMethod
	public void methodEnd() {
		Reporter.log("Method is ending", true);
	}

	@AfterTest
	public void testEnd() {
		switch (System.getProperty("browser")) {
		case "chrome" -> Reporter.log("Test is ending in chrome browser", true);
		case "firefox" -> Reporter.log("Test is ending in firefox browser", true);
		case "msedge" -> Reporter.log("Test is ending in msedge browser", true);
		default ->
		throw new IllegalArgumentException("Unexpected value: " + System.getProperty("browser"));
		}
	}
	
	@AfterSuite
	public void suiteEnd() {
		Reporter.log("Suite is ending", true);
	}

}
