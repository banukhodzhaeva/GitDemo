package testngFiles;

import java.io.IOException;

import org.testng.annotations.Test;


public class DependenyTestBase extends TestBase {      //we can inherit the property of TestBase class by adding "extends" keyword
	
	@Test
	public void DependenyTestBaseMethod1 () throws IOException
	{
		Login();
	}
	

	

}
