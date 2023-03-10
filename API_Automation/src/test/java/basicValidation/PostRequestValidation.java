package basicValidation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class PostRequestValidation {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		Response response = given().log().all().header("Content-Type", "application/json").body("{\"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"}")
				.when().post("api/login").then().log().all().extract().response();

//		how to validate the status code
		int statusCode = response.statusCode(); // returns The status code of the response
		System.out.println("Status Code : " + statusCode);
		Assert.assertEquals(statusCode, 200); 

//		how to validate the response headers
		String server = response.getHeader("Server");
		System.out.println("Response header server : " + server);
		Assert.assertEquals(server, "cloudflare");

//		how to validate the json response
//		to validate json response we need to parse that response using JsonPath class
		JsonPath jp = new JsonPath(response.asString());
		String tokenValue = jp.getString("token");
		System.out.println(tokenValue);
		Assert.assertEquals(tokenValue, "QpwL5tke4Pnpja7X4");
	}

}