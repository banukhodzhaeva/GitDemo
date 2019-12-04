package testngFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	
	public WebDriver driver=null;    //we wrote this line after deleting part of driver=new FirefoxDriver(); bcz it was different look at line 34
	
	@Test
	public void Login() throws IOException 
	{
		
		System.setProperty("webdriver.gecko.driver", "//Users//Saidahmad//Documents//work//geckodriver");
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("//Users//Saidahmad//eclipse-workspace//Section19FrameworkPar2//src//testngFiles//datadrivern.properties");
		
		prop.load(fis);
		
		
		//System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("firefox"))
		{
		//	WebDriver driver=new FirefoxDriver();
			
			driver=new FirefoxDriver();
			
		}
		else if (prop.getProperty("browser").equals("chrome"))
		{
		//	WebDriver driver=new ChromeDriver();
			driver=new ChromeDriver();
			
		}
		else
		{
		//	WebDriver driver=new InternetExplorerDriver();
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@Test
	public void software()
	{
		System.out.println("I am the Test");
	}
	
	@Test
	public void deinstallsoftware()
	{
		System.out.println("I am the Last");
	}
	
	
}
