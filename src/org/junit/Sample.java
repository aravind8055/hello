package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	
	@Before
	
	public void beforeClass() {
		Date d = new Date();
		System.out.println("start time"+d);

	}
	
	
	
	
//	@Test
//	public void testCase1() throws InterruptedException {
//System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\ARAVIND\\eclipse-workspace\\TestingUsingJunit\\driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aravindkanna529@gmail.com");
//		
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aravind 1998");
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		
//		Thread.sleep(4000);
//		
//		driver.close();
//		
//		//driver.navigate().back();
//
//	}
//	
//	@Test
//	
//	public void testCase2() throws InterruptedException {
//		
//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\ARAVIND\\eclipse-workspace\\TestingUsingJunit\\driver\\chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://www.facebook.com/");
//			
//			Thread.sleep(4000);
//			
//			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aravindkanna9");
//			
//			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("aravind 1998");
//			
//			Thread.sleep(4000);
//			
//			driver.findElement(By.xpath("//button[@name='login']")).click();
//			
//			Thread.sleep(4000);
//			
//		//	Assert.assertArrayEquals("aravindkanna529@gmail.com", actuals);
//	
//			driver.close();
//	
//	}
	
	@Test
	public void testCase3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARAVIND\\eclipse-workspace\\TestingUsingJunit\\driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aravindkanna529@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ara1998");
				
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
				Thread.sleep(4000);
				boolean a=10>1,b=10<1;
				Assert.assertFalse(b);
				
				String title = driver.getTitle();
				System.out.println(title);
				Assert.assertEquals(title, "Log in to Facebook");
		
				driver.close();
		
	}
	
	
	
	@After
	public void afterClass() {
		Date d = new Date();
		System.out.println("Start time"+d);

	}
	
}
