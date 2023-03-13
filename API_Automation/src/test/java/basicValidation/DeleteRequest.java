package basicValidation;


	import static io.restassured.RestAssured.*;

	import io.restassured.RestAssured;

	public class DeleteRequest {

		public static void main(String[] args) {
			RestAssured.baseURI = "https://reqres.in";

			given().log().all().when().delete("api/users/2").then().log().all().assertThat().statusCode(204);

		}

	}