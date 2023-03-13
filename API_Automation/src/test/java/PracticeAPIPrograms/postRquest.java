package PracticeAPIPrograms;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class postRquest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		//https://reqres.in/api/users
		given().log().all().header("Content-Type", "application/json")
		.body("{\"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"}").when()
		.post("api/login").then().log().all().assertThat().statusCode(200);
}

}
