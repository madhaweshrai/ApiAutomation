package TEstApi1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	
	@Test
	
	public void fun1()
	{
		
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(resp);
		int sc=resp.getStatusCode();
		System.out.println("status"+ sc);
		Assert.assertEquals(sc, 200);
		
	}

}
