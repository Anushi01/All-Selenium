package naveen.automationlabs.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		 if(text.equals("Please enter a valid user name"))
		 {
			 System.out.println("Correct message is displayed");
		 }
		 else
		 {
			 System.out.println("Incorrect message is displayed");
		 }
		 
		 alert.accept();// to click on ok button
		 //alert.dismiss();// to click on cancle button
	}

}