package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule 
{
	@Test(groups = { "smokeTest","regressionTest"})
	public void  createTask() {
		Reporter.log("createTask",true);
}
@Test(groups = "regressionTest")
public void deleteTask() {
	Reporter.log("deleteTask",true);
}
	}
