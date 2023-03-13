package serializationAndDeserialization;

import io.restassured.RestAssured;
import pojoClasses.ListOfUserPayload;

import static io.restassured.RestAssured.*;

public class GetListOfUsers {

	public static void main(String[] args) {
//		https://reqres.in/api/users?page=2
		RestAssured.baseURI = "https://reqres.in";

		ListOfUserPayload listOfUser = given().queryParam("page", 2).when().get("api/users").then().extract().response()
				.as(ListOfUserPayload.class);

		System.out.println(listOfUser.getPage());
		System.out.println(listOfUser.getPer_page());
		System.out.println(listOfUser.getTotal());
		System.out.println(listOfUser.getTotal_pages());

		System.out.println(listOfUser.getSupport().getUrl());
		System.out.println(listOfUser.getSupport().getText());

		System.out.println(listOfUser.getData().get(0).getId());
		System.out.println(listOfUser.getData().get(0).getEmail());
		System.out.println(listOfUser.getData().get(0).getFirst_name());
		System.out.println(listOfUser.getData().get(0).getLast_name());
		System.out.println(listOfUser.getData().get(0).getAvatar());
	}

}