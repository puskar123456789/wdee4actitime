package com.actitime.testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
 static 
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
	}
@Test
public void testverifyTitle(String ActualTitle) {
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
String ExpectedTitle= "soogle";
ExpectedTitle = driver.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals(ActualTitle, ExpectedTitle);
driver.getClass();
s.assertAll();
}
}
