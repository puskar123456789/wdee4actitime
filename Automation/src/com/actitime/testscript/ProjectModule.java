package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {

	@Test(groups = { "smokeTest","regressionTest"})
	public void  createProject() {
		Reporter.log("createProject",true);
}
@Test(groups = "regressionTest")
public void deleteProject() {
	Reporter.log("deleteProject",true);
}
	}

	


