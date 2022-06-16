package TEstApi1;

import org.testng.annotations.Test;

public class PriorityCheck {

	@Test(priority=0)
	public void f1()
	{
		System.out.println("f1");
	}
	@Test(priority=0)
	public void f2()
	{
		System.out.println("f2");
	}
	@Test(priority=-3)
	public void f3()
	{
		System.out.println("f3");
	}
	
	@Test()
	public void z4()
	{
		System.out.println("z4");
	}
	@Test()
	public void f4()
	{
		System.out.println("f4");
	}
}
