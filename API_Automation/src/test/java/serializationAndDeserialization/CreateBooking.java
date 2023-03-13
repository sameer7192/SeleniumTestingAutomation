package serializationAndDeserialization;

import io.restassured.RestAssured;
import pojoClasses.BookingDates;
import pojoClasses.CreateBookingPayload;

import static io.restassured.RestAssured.*;

public class CreateBooking {

	public static void main(String[] args) {
//		1	
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

//		Create the object of pojo class, and use setter method to set the request payload
		CreateBookingPayload createBooking = new CreateBookingPayload();
		createBooking.setFirstname("Jim");
		createBooking.setLastname("Brown");
		createBooking.setTotalprice(111);
		createBooking.setDepositpaid(true);
		createBooking.setAdditionalneeds("Breakfast");

		BookingDates bookingDate = new BookingDates();
		bookingDate.setCheckin("2018-01-01");
		bookingDate.setCheckout("2019-01-01");

		createBooking.setBookingdates(bookingDate);

		String bookingResponse = given().header("Content-Type", "application/json").body(createBooking).when()
				.post("booking").then().assertThat().statusCode(200).extract().response().asPrettyString();

		System.out.println(bookingResponse);
	}

}