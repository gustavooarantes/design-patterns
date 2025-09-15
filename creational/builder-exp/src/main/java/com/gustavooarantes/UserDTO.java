package com.gustavooarantes;

/**
 * Here we use a Data Transfer Object (DTO)
 * so we can move the User's entity data around the correct way.
 */
public interface UserDTO {

	String getName();

	String getEmail();

	int getAge();
}
