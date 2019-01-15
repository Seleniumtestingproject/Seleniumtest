package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Testclass extends Report {

	WebDriver driver;
	@Test(priority=1)
	public void Sucessfullogin()
	{
		
		
	    test = extent.createTest("login scenario");

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

	    
	test.log(Status.PASS, "browser is launched");
	
	
	

	
	 driver.get("https://www.seleniumhq.org/download/");
		
		test.log(Status.INFO, "browser1");

	    test.log(Status.INFO, "browser2");

	    Assert.assertTrue(1 < 0);

	}


@Test(priority=3)
public void functionality1Test3()
{
    test = extent.createTest("starttest");
    
    Assert.assertTrue(1 > 0);
    
    test=extent.createTest("test2");
    
   System.out.print("test");
}


}

