package com.jenkinspipeline.business.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.jenkinspipeline.business.base.BaseClass;

public class ModuleOrganisationTest extends BaseClass{
	
	@Test(groups = "smoke")
	public void test1() {
		Reporter.log("Executing Test1", true);
	}
	@Test(groups = {"smoke","regression"})
	public void test2() {
		Reporter.log("Executing Test2", true);
	}
	@Test(groups = "regression")
	public void test3() {
		Reporter.log("Executing Test3", true);
	}
	@Test(groups = {"smoke","regression"})
	public void test4() {
		Reporter.log("Executing Test4", true);
	}
	@Test(groups = "smoke")
	public void test5() {
		Reporter.log("Executing Test5", true);
	}
	@Test(groups = {"smoke","regression"})
	public void test6() {
		Reporter.log("Executing Test6", true);
	}
	@Test(groups = "regression")
	public void test7() {
		Reporter.log("Executing Test7", true);
	}
	@Test(groups = "regression")
	public void test8() {
		Reporter.log("Executing Test8", true);
	}
	@Test(groups = {"smoke","regression"})
	public void test9() {
		Reporter.log("Executing Test9", true);
	}

}
