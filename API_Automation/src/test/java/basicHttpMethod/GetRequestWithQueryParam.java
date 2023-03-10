package basicHttpMethod;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class GetRequestWithQueryParam {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().queryParam("page", "2").when().get("api/users").then().assertThat().statusCode(200).log()
				.all();

	}

}

//Access Token - 8ed3cac1e5ad2c9473ff53c9c7bdc3bd8746e74f5d1acf6fb7780659795c09c8