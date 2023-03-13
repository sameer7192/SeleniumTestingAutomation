package complexJsonValidation;

import API_Utilities.JsonUtility;
import API_Utilities.Payload;
import io.restassured.path.json.JsonPath;


	public class JsonValidation_Complex {

		public static void main(String[] args) {
			String response = Payload.complexJsonResponse();
			JsonPath jp = JsonUtility.rawToJson(response);

//			how to get the purchaseAmount value
			int purchaseAmt = jp.getInt("dashboard.purchaseAmount");
			System.out.println("Purchase Amount : " + purchaseAmt);

//			how to get the website value
			String website = jp.getString("dashboard.website");
			System.out.println("Website : " + website);

//			how to get the number of courses
			int numberOfCourses = jp.getInt("courses.size()");
			System.out.println("Number of courses : " + numberOfCourses);

//			how to get the first course title
			System.out.println("First course title : " + jp.getString("courses[0].title"));

//			how to print the title of all the courses
			for (int i = 0; i < jp.getInt("courses.size()"); i++) {
				System.out.println(jp.getString("courses[" + i + "].title"));
			}

//			how to print RestAssured course price
			for (int i = 0; i < jp.getInt("courses.size()"); i++) {
				if (jp.getString("courses[" + i + "].title").equals("RestAssured")) {
					System.out.println(jp.getString("courses[" + i + "].title")+" "+jp.getInt("courses[" + i + "].price"));
				}
					
			}
		}

	}