package LibraryAPI;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import API.automation.ApiAutomation.Books;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestClasses {
	
	Books book=new Books();
	String bookID;
	
	@Test(priority = 1)
	public void getBooks()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		RequestSpecification spec=RestAssured.given();
		
		spec.queryParam("ID", "3389");
		Response response = spec.get("/Library/GetBook.php");
		
		System.out.println(response.asPrettyString());
		
	}
	
	@Test(priority = 2)
	public void addBooks()
	{
		
		book.setAisle("226");
		book.setAuthor("John foe");
		book.setName("Learn Appium Automation with Java");
		book.setIsbn("bcdd");
		
		RequestSpecification spec=RestAssured.given();
		spec.body(book);
		
		Response response = spec.post("/Library/Addbook.php");
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		JsonPath json = response.jsonPath();
		Assert.assertEquals(json.getString("Msg"), "successfully added");
		bookID=json.getString("ID");
		
	}
	
	@Test(priority = 3)
	public void delBook()
	{
		RequestSpecification spec=RestAssured.given();
		spec.body("{\r\n"
				+ "    \"ID\": \""+bookID+"\"\r\n"
				+ "}");
		
		Response response = spec.post("/Library/DeleteBook.php");
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		JsonPath json = response.jsonPath();
		Assert.assertEquals(json.getString("msg"), "book is successfully deleted");
	}
	
	

}
