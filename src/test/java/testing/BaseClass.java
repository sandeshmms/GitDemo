package testing;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass
{

	@BeforeSuite(groups= {"P1","P2"})
	public void bSuite() throws IOException
	{
		System.out.println("Before Suite called");
	}

	@AfterSuite(groups= {"P1","P2"})
	public void aSuite()
	{
		System.out.println("After Suite called");
	}

	@BeforeTest(groups= {"P1","P2"})
	public void bTest() throws IOException
	{
		System.out.println("Before Test called");
	}

	@AfterTest(groups= {"P1","P2"})
	public void aTest() throws IOException
	{
		System.out.println("After Test called");
	}

	@BeforeClass(groups= {"P1","P2"})
	public void bClass()
	{
		System.out.println("Before Class called");
	}

	@AfterClass(groups= {"P1","P2"})
	public void aClass()
	{
		System.out.println("After Class called");
	}

	@BeforeGroups(groups= {"P1","P2"})
	public void b1Class()
	{
		System.out.println("Before Group called");
	}

	@AfterGroups(groups= {"P1","P2"})
	public void a1Class()
	{
		System.out.println("After Group called");
		System.out.println("After Group called-1");
		System.out.println("After Group called-2");
		System.out.println("After Group called-3");
		System.out.println("After Group called-4");
		System.out.println("After Group called-5");
		System.out.println("After Group called-6");
		System.out.println("After Group called-7");
		System.out.println("After Group called-8");
	}

	@BeforeMethod(onlyForGroups={"P1"}, alwaysRun=true)
	public void bmeth()
	{
		System.out.println("Before Method called");
	}

	@AfterMethod(onlyForGroups={"P1"}, alwaysRun=true)
	public void ameth()
	{
		System.out.println("After Method called");
		System.out.println("After Method called-1");
		System.out.println("After Method called-2");
		System.out.println("After Method called-3");
		System.out.println("After Method called-4");
		System.out.println("After Method called-5");
		System.out.println("After Method called-6");
	}

}
