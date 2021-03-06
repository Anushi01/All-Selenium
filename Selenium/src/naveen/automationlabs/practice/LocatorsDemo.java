package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1.xpath.......2 Priority
		/*--->recommended for relative x-path----//*[@id='firstname']
		 ---->not recommended for absolute x-path------*/
		
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Vijji");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Nakka");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vijji.tester1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'PASSWORD\']")).sendKeys("Sairam@456");
		
		
		//2.id.......1st Priority
		
//		driver.findElement(By.id("firstname")).sendKeys("Vijji");
//		driver.findElement(By.id("lastname")).sendKeys("Lakshmi");
//		driver.findElement(By.id("email")).sendKeys("vijji.tester1@gmail.com");
		
		//3.name.........3rd priority
		
//		driver.findElement(By.name("firstname")).sendKeys("Vijji");
//		driver.findElement(By.name("lastname")).sendKeys("Lakshmi");
		
		//4.className------not recommended becz many webelements having the same class name
		
		//driver.findElement(By.className("float-label fv-w width100 textbox fv-tw")).sendKeys("Vijji");
		
		//5.linkText----only for links -1st priority
		//driver.findElement(By.linkText("Sign in")).click();
		
		//6.PartialLinktext------not recommended
		//driver.findElement(By.partialLinkText("business accoun")).click();
		
		//7.CSSselector----2nd Priority
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("Vijji");

}
}
