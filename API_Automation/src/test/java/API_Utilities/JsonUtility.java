package API_Utilities;

import io.restassured.path.json.JsonPath;

	public class JsonUtility {
		public static JsonPath rawToJson(String response) {
			JsonPath jp = new JsonPath(response);
			return jp;
		}
	}