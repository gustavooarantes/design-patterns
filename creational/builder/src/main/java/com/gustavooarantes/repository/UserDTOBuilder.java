package com.gustavooarantes.repository;

import java.time.LocalDate;

import com.gustavooarantes.entity.Address;
import com.gustavooarantes.repository.dto.UserDTO;

public interface UserDTOBuilder {

	UserDTOBuilder withFirstName(String fname);

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withBirthdate(LocalDate bdate);

	UserDTOBuilder withAddress(Address address);

	// Method for "assembling" the final product
	UserDTO build();

	// Method to fetch already built object
	UserDTO getUserDTO();
}
