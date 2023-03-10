package basicHttpMethod;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class DeleteRequest {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";

		given().log().all().when().delete("api/users/2").then().log().all().assertThat().statusCode(204);

	}

}

//8ed3cac1e5ad2c9473ff53c9c7bdc3bd8746e74f5d1acf6fb7780659795c09c8 - go rest token