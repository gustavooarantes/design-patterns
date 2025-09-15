package com.gustavooarantes;

public interface UserDTOBuilder {

	UserDTOBuilder withName(String name);

	UserDTOBuilder withEmail(String email);

	UserDTOBuilder withAge(int age);

	UserDTO build();
}
