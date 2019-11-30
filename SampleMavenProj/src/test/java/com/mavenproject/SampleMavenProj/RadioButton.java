package com.mavenproject.SampleMavenProj;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class RadioButton extends BaseTest3{
	
 @BeforeMethod(groups= {"regression"})
 @Parameters("browser")
  public void beforeMethod(String browserType) throws Exception
 {		
		init();		
		launch(browserType);		
		navigate("radiobuttonurl");		
 }
	 
  @Test(groups= {"regression"})
  public void radioButtonTest() 
  {
	  List<WebElement> list = driver.findElements(By.tagName("a"));
	  for(int i=0;i<list.size();i++)
	 {
		  String linkName=list.get(i).getText();
		  System.out.println(linkName);
		  list=driver.findElements(By.tagName("a"));
		  
	  }
  }
 

  @AfterMethod(groups= {"regression"})
  public void afterMethod() {
	  closeBrowser();
  }

}
