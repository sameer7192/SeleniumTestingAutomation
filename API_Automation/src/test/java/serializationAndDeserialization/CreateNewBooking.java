package serializationAndDeserialization;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import pojoClasses.CreateNewUserPayload;
import pojoClasses.NewUserBookingDate;

public class CreateNewBooking {
	//https://restful-booker.herokuapp.com/booking
	public static void main(String[] args) {
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		CreateNewUserPayload createNewUser= new CreateNewUserPayload();
		createNewUser.setFirstname("Sachin");
		createNewUser.setLastname("Tendulkar");
		createNewUser.setTotalprice(1212);
		createNewUser.setDepositpaid(true);
		createNewUser.setAdditionalneeds("All meals");
		
		NewUserBookingDate bookingDate= new NewUserBookingDate();
		bookingDate.setCheckin("2023-01-01");
		bookingDate.setCheckout("2023-01-01");
		
		createNewUser.setBookingdates(bookingDate);
		
		String bookingResponse=given().header("Content-Type","application/json").body(createNewUser).when().post("booking").then().assertThat().statusCode(200).extract().response().asPrettyString();
		System.out.println(bookingResponse);
	
	}

}
