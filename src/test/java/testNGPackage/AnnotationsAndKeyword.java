package testNGPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsAndKeyword {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
	}
	
	

	@Test(priority = 1)
	public void verifyActitimeLogo() {
   boolean logo = driver.findElement(By.xpath("//img[@src='/img/default/" + "top_nav/default-logo.png?hash=274618146']"))
				.isDisplayed();
		if (logo == true)
		{
			System.out.println("Logo is Displayed");
		} 
		else 
		{
			System.out.println("Logo is NOT displayed");
		}
	}

	
		

	
	@Test(priority=2,groups="MNO")
	public void verifyTaskTab()
	{
	//boolean taskTab=driver.findElement(By.xpath("(//img[@src='/img/" + "default/pixel.gif?hash=274618146'])[7]")).isDisplayed();
	boolean taskTab=driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=274618146'])[7]")).isDisplayed();
Assert.assertTrue(taskTab);   //check  the value AND expected result should be true
//Assert.assertFalse(taskTab);
	}
	
	@Test(priority = 3, groups = "MNO")
	public void verifyLogoutLink() {
		boolean logout = driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();
		Assert.assertEquals(logout, true, "Result is not true");

		 //String title = driver.getTitle();
		//Assert.assertEquals(title, "actiTIME - Enter Time-Track", "Title not correct");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}  

}

// priority keyword is used to set the priority for our testcases...
//to see report --refresh the project--test-output folder will be displayed--index.html right click (COpy path)
//grouping keyword -- runs the test cases in the group
//validation point
	
	


