package TEstApi1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class GetTEst {
	
	//@Test
	
	public void gettest()
	
	{
		 //baseURI = "";
		RestAssured.baseURI="";
		
		given().
		header("ContentType","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		      
		    get("http://localhost:3000/users").
		then().
		     statusCode(200).
		     body("users.firstName", equalTo("Maddy")).
		     
		     log().all();
		
		
	}
//@Test
	
	public void posttest()
	
	{
		JSONObject  obj = new JSONObject();
		obj.put("firstName", "dun");
		obj.put("LastName", "su");
		obj.put("SubjectId", "33");
		obj.put("id", "5");
		
		
		given().
		      contentType(ContentType.JSON).accept(ContentType.JSON).body(obj.toJSONString()).
		      when().
		    post("http://localhost:3000/users").
		then(). 
		     statusCode(201).
		    // body("users[1].firstName", equalTo("Maddy")).
		     log().all();
		
		
	}
	
//@Test
	
	public void puttest()
	
	{
		JSONObject  obj1 = new JSONObject();
		obj1.put("firstName", "dun");
		obj1.put("LastName", "su");
		obj1.put("SubjectId", "6");
		obj1.put("id", "6");
		
		
		given().
		      contentType(ContentType.JSON).accept(ContentType.JSON).
		      body(obj1.toJSONString()).
		      when().
		    put("http://localhost:3000/users").
		then().
		     statusCode(200).
		    // body("users[1].firstName", equalTo("Maddy")).
		     log().all();
		
		
	}
	
//@Test
	
	public void patchtest()
	
	{
		JSONObject  obj = new JSONObject();
		
		obj.put("SubjectId", 600);
		
		
		
		given().
		      contentType(ContentType.JSON).accept(ContentType.JSON).
		      body(obj.toJSONString()).
		      when().
		    patch("http://localhost:3000/users").
		then().
		     statusCode(200).
		    // body("users[1].firstName", equalTo("Maddy")).
		     log().all();
		
		
	}
	
@Test
	
	public void deletetest()
	
	{
		
		
		
		
		given().
		      contentType(ContentType.JSON).accept(ContentType.JSON).
		     
		    delete("http://localhost:3000/users/4").
		then().
		     statusCode(200).
		    // body("users[1].firstName", equalTo("Maddy")).
		     log().all();
		
		
	}
}
