package goRestAPI;


import static io.restassured.RestAssured.given;

import org.testng.Assert;

import API_Utilities.JsonUtility;
import API_Utilities.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class CreateUser {

	public static void main(String[] args) {
//	https://gorest.co.in/public/v2/users
		RestAssured.baseURI = "https://gorest.co.in";

		String userEmail = "tenalipq12.ramakrishnaxy12@15ce.com";
		Response createUserRespone = given().log().all()
				.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
				.header("Content-Type", "application/json").body(Payload.createUserGoRestAPI(userEmail)).when()
				.post("public/v2/users").then().log().all().assertThat().statusCode(201).extract().response();

		JsonPath jp = JsonUtility.rawToJson(createUserRespone.asString());
		int userId = jp.getInt("id");

		Response getUserResponse = given().log().all()
				.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
				.when().get("public/v2/users/" + userId + "").then().log().all().assertThat().statusCode(200).extract()
				.response();

		JsonPath jp1 = JsonUtility.rawToJson(getUserResponse.asString());
		Assert.assertEquals(jp1.getInt("id"), userId);

		if (jp1.getInt("id") == userId)
			System.out.println("User details extracted successfully");
		else
			System.out.println("User details not found");

		String updateUserEmail = "allasanipq12.peddanaxy12@15ce.com";
		Response updateUserRespone = given().log().all()
				.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
				.header("Content-Type", "application/json").body(Payload.updateUserGoRestAPI(updateUserEmail)).when()
				.put("public/v2/users/" + userId + "").then().log().all().assertThat().statusCode(200).extract()
				.response();

		JsonPath jp2 = JsonUtility.rawToJson(updateUserRespone.asString());
		if (jp2.getString("email").equals(updateUserEmail))
			System.out.println("User details updated successfully");
		else
			System.out.println("User details updation failed");

		given().log().all()
				.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
				.when().delete("public/v2/users/" + userId + "").then().log().all().assertThat().statusCode(204);
	}

}