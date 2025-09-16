package com.gustavooarantes;

public class UserDTO {

	private String name;

	private String address;

	private int age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address;
	}

	/**
	 * If builder should be Private, use:
	 * public static UserDTOBuidler getBuilder() {
	 * return new UserDTOBuilder;
	 * }
	 */
	public static class UserDTOBuilder {
		private String name;

		private String address;

		private int age;

		private UserDTO userDTO;

		public UserDTOBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public UserDTOBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public UserDTOBuilder withAge(int age) {
			this.age = age;
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(name);
			userDTO.setAddress(address);
			userDTO.setAge(age);

			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
