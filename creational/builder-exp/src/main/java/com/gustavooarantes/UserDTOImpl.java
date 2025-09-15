package com.gustavooarantes;

public class UserDTOImpl implements UserDTO {

	private final String name;
	private final String email;
	private final int age;

	public UserDTOImpl(UserDTOBuilderImpl builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.age = builder.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public int getAge() {
		return this.age;
	}
}
