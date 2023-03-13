package basicValidation;

	import io.restassured.RestAssured;
	import static io.restassured.RestAssured.*;

	public class GetRequest {

		public static void main(String[] args) {
//			Specify base uri to rest assured
//			https: // reqres.in/api/users/2
//			RestAssured.baseURI = "https://gorest.co.in";
			RestAssured.baseURI = "https://reqres.in";

			given().log().all().when().get("api/users/2").then().log().all().assertThat().statusCode(200);

//			given().log().all().header("Content-Type", "application/json")
//					.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
//					.body("{\r\n" + "    \"name\": \"Tenali Ramakrishna\",\r\n" + "    \"gender\": \"male\",\r\n"
//							+ "    \"email\": \"tenaliee.ramakrishnaxyz12@15ce.com\",\r\n"
//							+ "    \"status\": \"active\"\r\n" + "}")
//					.when().post("public/v2/users").then().log().all();
		}

	}

	// given() --> specify all the input details
	// when()  --> specify http method type
	// then()  --> validation