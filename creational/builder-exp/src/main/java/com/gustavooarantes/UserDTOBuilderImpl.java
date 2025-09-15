package com.gustavooarantes;

public class UserDTOBuilderImpl implements UserDTOBuilder {

	String name;
	String email;
	int age;

	@Override
	public UserDTOBuilder withName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public UserDTOBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public UserDTOBuilder withAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public UserDTO build() {
		return new UserDTOImpl(this);
	}
}
