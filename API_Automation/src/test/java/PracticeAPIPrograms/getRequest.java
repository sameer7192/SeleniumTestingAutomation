package PracticeAPIPrograms;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class getRequest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
//		https://reqres.in/api/users/2
		given().log().all().when().get("api/users/2").then().log().all().assertThat().statusCode(200);
	}

}
