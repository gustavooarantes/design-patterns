package com.gustavooarantes;

/**
 * This class is called the "Director"
 * The Director class is responsible for calling the builder
 * for constructing the needed representation of the object User
 */
public class Main {

	public static void main(String[] args) {

		User user = new User("Gustavo", "gustavo@email.com", 22);
		UserDTO dto = createUser(user);
		System.out.println(dto.getName() + " is " + dto.getAge() + " years old. Contact: " + dto.getEmail());
	}

	public static UserDTO createUser(User user) {
		UserDTOBuilder builder = new UserDTOBuilderImpl();
		return builder
				.withName(user.getName())
				.withEmail(user.getEmail())
				.withAge(user.getAge())
				.build();
	}
}
