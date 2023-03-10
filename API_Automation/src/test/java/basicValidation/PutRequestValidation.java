package basicValidation;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PutRequestValidation {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		Response response = given().log().all().header("Content-Type", "application/json")
				.body("{ \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"}").when().put("api/users/2")
				.then().assertThat().log().all().statusCode(200).extract().response();

//		how to validate the status code
		System.out.println("Status code : " + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);

//		how to validate the response headers
		System.out.println("Response header Content-Encoding : " + response.getHeader("Content-Encoding"));
		Assert.assertEquals(response.getHeader("Content-Encoding"), "gzip");

//		to validate the Json response first parse the response using JsonPath class
		JsonPath jp = new JsonPath(response.asString());
		System.out.println("Name : " + jp.getString("name"));
		System.out.println("Job : " + jp.getString("job"));
	}

}