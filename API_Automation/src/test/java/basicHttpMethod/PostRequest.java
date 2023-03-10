package basicHttpMethod;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PostRequest {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().header("Content-Type", "application/json")
				.body("{\"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"}").when()
				.post("api/login").then().log().all().assertThat().statusCode(200);
	}

}

//{"email": "eve.holt@reqres.in",
//"password": "cityslicka"}