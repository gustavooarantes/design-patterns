package com.gustavooarantes.repository.impl;

import java.time.LocalDate;
import java.time.Period;

import com.gustavooarantes.entity.Address;
import com.gustavooarantes.repository.UserDTOBuilder;
import com.gustavooarantes.repository.dto.UserDTO;
import com.gustavooarantes.repository.dto.impl.UserWebDTO;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;

	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthdate(LocalDate bdate) {
		Period ageInYears = Period.between(bdate, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + ", " + address.getStreet() +
				"\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipcode();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName + " " + lastName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
}
