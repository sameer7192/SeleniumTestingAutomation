package TestData;

	import pojoClasses.CreateUser;

	public class TestDataBuild {

		public CreateUser createUserPayload(String name, String email, String gender, String status) {
			CreateUser createUser = new CreateUser(); // CreateUser is a pojo class
			createUser.setName(name);
			createUser.setEmail(email);
			createUser.setGender(gender);
			createUser.setStatus(status);

			return createUser;
		}
	}