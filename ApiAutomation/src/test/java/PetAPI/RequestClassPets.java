package PetAPI;


import java.io.File;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.GetPets;
import pojo.PetCategory;
import pojo.Tag;

public class RequestClassPets {
	
	@Test
	public void AddPets()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		RequestSpecification spec=RestAssured.given();
		File jsonDataInFile = new File("src/test/java/payloads/addPet.json");
		
		spec.body(jsonDataInFile);
		
		Response response = spec.post("/pet");
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	@Test
	public void getPet()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification spec=RestAssured.given();
		
		Response response = spec.get("/pet/9223372000000222497");
		
		GetPets getPets = response.as(GetPets.class);
		
		System.out.println(response.asPrettyString());
		
		// pet status
		System.out.println(getPets.getStatus());
		
		PetCategory cat = getPets.getCategory();
		//PetCategory details
		System.out.println(cat.getId()+ "-"+ cat.getName());
		
		List<Tag> tags = getPets.getTags();
		
		for(Tag tag: tags)
		{
			if(tag.getId() == 1)
			System.out.println(tag.getId()+"-"+tag.getName());
		}
	}
	
	@Test
	public void updatePet()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RequestSpecification spec=RestAssured.given();
		spec.body("{\r\n" + 
				"  \"id\": 9223372000000222497,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 2,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie1\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 1,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		
		Response response = spec.put("/pet");
		System.out.println(response.asPrettyString());
	}
	
}
