package testing;

import org.testng.annotations.Test;

public class TC_001 extends BaseClass
{

	@Test(groups= {"P1"})
	public void tCase1()
	{
		System.out.println("Inside testcase 1");
	}

	@Test(groups= {"P1"})
	public void tCase2()
	{
		System.out.println("Inside testcase 2");
	}

	@Test
	public void tCase3()
	{
		System.out.println("Inside testcase 3");
	}

}

