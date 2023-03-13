package StepDefinations;

	import static io.restassured.RestAssured.given;
	import static org.junit.Assert.*;

import TestData.TestDataBuild;
import Utilities.RestAssuredUtility;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	

	public class CreateGetUpdateDeleteUser extends RestAssuredUtility {
		RequestSpecification reqSpecification;
		Response response;
		TestDataBuild data = new TestDataBuild();

		@Given("Create User payload {string} {string} {string} {string}")
		public void create_user_payload(String name, String email, String gender, String status) {
			RestAssured.baseURI = "https://gorest.co.in";
			reqSpecification = given().log().all()
					.header("Authorization", "Bearer 4bd56fdc8137b99b957938010a2b0a0cfcbdd5099e32f9aa8adf5b3c6ea4d8f8")
					.header("Content-Type", "application/json").body(data.createUserPayload(name, email, gender, status));
		}

		@When("User calls CreateUser API using POST method")
		public void user_calls_create_user_api_using_post_method() {
			response = reqSpecification.when().post("public/v2/users");
			System.out.println(response.asPrettyString());
		}

		@Then("The API call got success with status code {int}")
		public void the_api_call_got_success_with_status_code(int statusCode) {
			assertEquals(response.getStatusCode(), statusCode);
		}

		@Then("{string} in response body is {string}")
		public void in_response_body_is(String key, String expectedValue) {
			assertEquals(getJsonValue(response, key), expectedValue);
		}

	}