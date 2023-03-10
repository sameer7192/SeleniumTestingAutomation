package goRestAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GoRestPostRequest {

	public static void main(String[] args) {

		RestAssured.baseURI ="https://gorest.co.in"; //public/v2/users
		
		given().log().all().header("Authorization","Bearer 8ed3cac1e5ad2c9473ff53c9c7bdc3bd8746e74f5d1acf6fb7780659795c09c8").header("Content-Type","application/json").body("{\r\n" + 
				"        \"name\": \"Rajendra Gujar\",\r\n" + 
				"        \"email\": \"Rajest_Gujar@beasffaum.io\",\r\n" + 
				"        \"gender\": \"male\",\r\n" + 
				"        \"status\": \"active\"\r\n" + 
				"    }").when().post("public/v2/users").then().log().all().assertThat().statusCode(201);
				
	}

}


