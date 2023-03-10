package basicHttpMethod;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class PutRequest {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json")
				.body("{ \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"}").when().put("api/users/2")
				.then().assertThat().log().all().statusCode(200);
	}

}