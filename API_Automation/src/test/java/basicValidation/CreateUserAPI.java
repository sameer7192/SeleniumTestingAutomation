package basicValidation;


	import static io.restassured.RestAssured.given;

import API_Utilities.JsonUtility;
import API_Utilities.Payload;
import io.restassured.RestAssured;
	import io.restassured.path.json.JsonPath;
	import io.restassured.response.Response;
	

	public class CreateUserAPI {

		public static void main(String[] args) {
//			https://reqres.in/api/users
			RestAssured.baseURI = "https://reqres.in";

			String userName = "Amit";
			String userJob = "Deveops Engg";

			Response response = given().log().all().header("Content-Type", "application/json")
					.body(Payload.createUserPayLoad(userName, userJob)).when()
					.post("api/users").then().log().all().assertThat().statusCode(201).extract().response();

			JsonPath jp = JsonUtility.rawToJson(response.asString());
			if (jp.getString("name").equals(userName) && jp.getString("job").equals(userJob))
				System.out.println("User created successfully");
			else
				System.out.println("User creation failed");
		}

	}