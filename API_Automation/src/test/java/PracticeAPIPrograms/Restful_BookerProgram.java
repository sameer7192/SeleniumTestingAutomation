package PracticeAPIPrograms;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import API_Utilities.JsonUtility;
import API_Utilities.Payload;

public class Restful_BookerProgram {

	public static void main(String[] args) {
		//https://restful-booker.herokuapp.com/auth
		//https://restful-booker.herokuapp.com/booking
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		String response= Payload.Restfulbooking();
		JsonPath jp=JsonUtility.rawToJson(response);
		
		Response createUser=given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}").when().post("auth").then().log().all().assertThat().statusCode(200).extract().response();
		
		Response getUser=given().log().all().when().get("booking").then().log().all().assertThat().statusCode(200).extract().response();
		
//		int numberOfBookings= jp.getInt(".booking.size()");
//		System.out.println("TOtal number of booking : "+numberOfBookings);
		
		Response getUserByID=given().log().all().when().get("booking/1").then().log().all().assertThat().statusCode(200).extract().response();
		
		
		
		
		Response createNewUser=given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").when().post("booking").then().log().all().assertThat().statusCode(200).extract().response();
		
		JsonPath JP = JsonUtility.rawToJson(createNewUser.asString());
		int userId = jp.getInt("id");
		
		Response getNewUser=given().log().all().when().get("booking/"+userId+"").then().log().all().assertThat().statusCode(200).extract().response();
		
		JsonPath jp1 = JsonUtility.rawToJson(getNewUser.asString());
		Assert.assertEquals(jp1.getInt("id"), userId);
		if (jp1.getInt("id") == userId)
			System.out.println("User details extracted successfully");
		else
			System.out.println("User details not found");
		
	}
	

}
