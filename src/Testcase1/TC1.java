package Testcase1;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TC1 {
	
	public static  WebDriver driver;
	@BeforeClass
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver","//home//himani//Documents//chromedriver");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("before class");
		
	}
	
	@BeforeMethod
	public void before()
	{
		System.out.println("before");
		System.out.println("hello");
	}
	
	@Test
	public void def()
	{
		System.out.println("Def tested");
	}
	
	@Ignore
	@Test
	public void abc()
	{
		System.out.println("abc tested");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("after");
	}
	
	@AfterClass
	public static void close()
	{
		driver.close();
		System.out.println("after class");
	}

}
