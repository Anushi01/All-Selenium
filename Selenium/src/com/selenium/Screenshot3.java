package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {
	public static String projectpath=System.getProperty("user.dir");
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, projectpath+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		for(int i=0;i<linksList.size();i++) {
			if(!linksList.get(i).getText().isEmpty()) {
				String linkname=linksList.get(i).getText();
				linksList.get(i).click();
				
				File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(screenshot, new File("C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Screenshots\\"+linkname+".jpeg"));
				linksList=driver.findElements(By.tagName("a"));
			}
		}
	}

}
