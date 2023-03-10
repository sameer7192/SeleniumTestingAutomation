package basicHttpMethod;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetRequest {

	public static void main(String[] args) {
//		Specify base uri to rest assured
//		https://reqres.in/api/users/2
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().when().get("api/users/2").then().log().all().assertThat().statusCode(200);
	}

}

// given() --> specify all the input details
// when()  --> specify http method type
// then()  --> validation