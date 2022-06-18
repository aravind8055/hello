package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	
	WebDriver driver;

		
	@Test
	public void testCase() throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ARAVIND\\eclipse-workspace\\TestingUsingJunit\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("india");
		
		Robot r = new Robot(); 
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	
}
