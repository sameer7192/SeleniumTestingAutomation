package API_Utilities;

public class Payload {

		public static String loginPayload() {
			return "{\"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"}";
		}

		public static String createUserPayLoad(String userName, String userJob) {
			return "{\"name\": \"" + userName + "\",\r\n" + "    \"job\": \"" + userJob + "\"}";
		}

		public static String createUserGoRestAPI(String userEmail) {
			return "{\r\n" + "    \"name\": \"Tenali Ramakrishna\",\r\n" + "    \"gender\": \"male\",\r\n"
					+ "    \"email\": \"" + userEmail + "\",\r\n" + "    \"status\": \"active\"\r\n" + "}";
		}

		public static String updateUserGoRestAPI(String updateUserEmail) {
			return "{\r\n" + "    \"name\": \"Allasani Peddana\",\r\n" + "    \"email\": \"" + updateUserEmail + "\",\r\n"
					+ "    \"status\": \"active\"\r\n" + "}";
		}

		public static String complexJsonResponse() {
			return "{\r\n" + "\r\n" + "	\"dashboard\": {\r\n" + "	\"purchaseAmount\": 115,\r\n"
					+ "	\"website\": \"demotesting.com\"\r\n" + "	},\r\n" + "\r\n" + "	\"courses\": [\r\n"
					+ "		{\r\n" + "			\"title\": \"Selenium Java\",\r\n" + "			\"price\": 45,\r\n"
					+ "			\"copies\": 7\r\n" + "		},\r\n" + "\r\n" + "		{\r\n"
					+ "			\"title\": \"Playwrit\",\r\n" + "			\"price\": 30,\r\n"
					+ "			\"copies\": 5\r\n" + "		},\r\n" + "\r\n" + "		{\r\n"
					+ "			\"title\": \"RestAssured\",\r\n" + "			\"price\": 65,\r\n"
					+ "			\"copies\": 10\r\n" + "		},\r\n" + "		{\r\n" + "			\"title\": \"Cypress\",\r\n"
					+ "			\"price\": 35,\r\n" + "			\"copies\": 8\r\n" + "		}\r\n" + "	]\r\n" + "}";
		}
		public static String Restfulbooking() {
			return "{\\r\\n\"\r\n"
					+ "				+ \"    \\\"username\\\" : \\\"admin\\\",\\r\\n\"\r\n"
					+ "				+ \"    \\\"password\\\" : \\\"password123\\\"\\r\\n\"\r\n"
					+ "				+ \"}";
		}
	}