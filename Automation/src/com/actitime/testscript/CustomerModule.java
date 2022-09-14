package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test(groups = { "smokeTest","regressionTest"})
	public void  createCustomer() {
		Reporter.log("createCustomer",true);
}
@Test(groups = "regressionTest")
public void deleteCustomer() {
	Reporter.log("deleteCustoer",true);
}
	}


