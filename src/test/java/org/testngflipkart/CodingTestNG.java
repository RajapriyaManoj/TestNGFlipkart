package org.testngflipkart;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CodingTestNG {
	
	public static WebDriver driver;
	static String Url = "https://flipkart.com";
	
	@BeforeSuite
	public void suiter()
	{
		System.out.println("Before Suiter");
	}
	@AfterSuite		
	public void suiter2() {
		System.out.println("After Suiter");
	}
	
	@SuppressWarnings("deprecation")
	@org.testng.annotations.BeforeClass
		
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("@BeforClass: Launch Browser");
	}
	
	 @BeforeMethod
	   
	 public void logIn()
	    {
			System.out.println("@Before: LogIn");
			
		}
	 
	 @org.testng.annotations.Test
	    public void method1()
	    {
	    	WebElement w1 = driver.findElement(By.xpath("//button[text()='✕']"));
	    	w1.click();
	    	System.out.println("@Test1: Login Popup got closed");
	    }

	 @org.testng.annotations.Test
	    public void method2()
	    {
	    	WebElement w2 = driver.findElement(By.name("q"));
	    	w2.sendKeys("kids story books");
	    	System.out.println("@Test2: Product search is done");
	    }
	    
	 @org.testng.annotations.Test
	    public void method3()
	    {
	    	WebElement w2 = driver.findElement(By.xpath("//button[@type='submit']"));
	    	w2.click();
	    	System.out.println("@Test3: search and click done");
	    }
	    
	@org.testng.annotations.Test
	    public void method4()
	    {
	    	WebElement w3 = driver.findElement(By.xpath("//a[contains(text(),'101 Panchatantra Stories')]"));
	    	w3.click();
	    	System.out.println("@Test4: Product got selected");
	    }
	    

	 @org.testng.annotations.AfterMethod
	    public void logOut()
	    {
	    	System.out.println("@After: Logout is done");
	    }
	    
	 @org.testng.annotations.AfterClass
	    public static void closeBrowser()
	    {
	    	 {
	    		 
	 	    	driver.quit();
	 	    	System.out.println("@AfterClass: Browser Closed");
	    }
	}
		
}

