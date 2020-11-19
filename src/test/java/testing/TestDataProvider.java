package testing;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="testdata")
	public Object[][] createData()
	{

		Object[][] userpassdetails = new Object[2][3];
		userpassdetails[0][0] = "username1";
		userpassdetails[0][1] = "password1";
		userpassdetails[0][2] = 12;
		userpassdetails[1][0] = "username2";
		userpassdetails[1][1] = "password2";
		userpassdetails[1][2] = 23;

		return userpassdetails;

	}

}

