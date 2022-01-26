package testNGKeywords;

import org.testng.annotations.Test;

public class DependsOn {
	@Test
	public void loginPageTest()
	{
		System.out.println("Logi Page Test");
	}
	
	@Test(dependsOnMethods="loginPageTest")
	public void HomePageTest()
	{
		System.out.println("Home PageTest");
		String str="Pooja";
		System.out.println(str.charAt(10));
	}
	

}
