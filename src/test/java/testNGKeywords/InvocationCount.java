package testNGKeywords;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void addition()
	{
		int a=12;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}

}
