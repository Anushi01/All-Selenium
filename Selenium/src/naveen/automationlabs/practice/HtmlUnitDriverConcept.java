package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com/index.html?e=1");
		
		System.out.println("Title before login: "+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Vijjii");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test@123");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("Title after login: "+driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
