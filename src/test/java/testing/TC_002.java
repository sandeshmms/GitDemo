package testing;

import org.testng.annotations.Test;

public class TC_002 extends BaseClass
{

	@Test(groups= {"P1"})
	public void tCase4()
	{
		System.out.println("Inside testcase 4");
	}

	@Test(groups= {"P1","P2"})
	public void tCase5()
	{
		System.out.println("Inside testcase 5");
	}

	@Test(groups= {"P1"}, dataProvider="testdata", dataProviderClass=TestDataProvider.class)
	public void verifyData(String username, String password, int key)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(key);
	}
	
}

