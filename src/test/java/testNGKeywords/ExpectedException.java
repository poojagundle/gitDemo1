package testNGKeywords;

import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions=ArithmeticException.class)
	public void myMethod()
	{
		int a=2/0;
		System.out.println(a);
	}
	//exception aa sakta hai ignore karo or add karo means ignore it and passed test case

}
