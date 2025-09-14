package com.gustavooarantes;

import java.time.LocalDate;

import com.gustavooarantes.entity.Address;
import com.gustavooarantes.entity.User;
import com.gustavooarantes.repository.UserDTOBuilder;
import com.gustavooarantes.repository.dto.UserDTO;
import com.gustavooarantes.repository.impl.UserWebDTOBuilder;

public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();

		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}

	// Director
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthdate(user.getBirthdate())
				.build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthdate(LocalDate.of(1990, 5, 6));
		user.setFirstName("John");
		user.setLastName("Doe");

		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("1st Street");
		address.setCity("New York City");
		address.setState("New York");
		user.setAddress(address);
		return user;
	}
}
