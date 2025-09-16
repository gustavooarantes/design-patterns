package com.gustavooarantes;

import com.gustavooarantes.UserDTO.UserDTOBuilder;

public class Client {

	public static void main(String[] args) {
		User user = createUser();

		UserDTO dto = directBuild(user);
		System.out.println(dto);
	}

	private static UserDTO directBuild(User user) {
		return new UserDTOBuilder()
				.withName(user.getName())
				.withAddress(user.getAddress())
				.withAge(user.getAge())
				.build();
	}

	public static User createUser() {
		User user = new User();

		user.setName("Gustavo");
		user.setAddress("Goiânia");
		user.setAge(22);

		return user;
	}
}
