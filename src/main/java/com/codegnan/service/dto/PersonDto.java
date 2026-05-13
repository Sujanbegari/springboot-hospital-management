package com.codegnan.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {

	@NotBlank(message = "Name is required")
	@Size(min = 3, max = 50)
	private String name;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String emailAddress;

	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian mobile number")
	private String phone;

	@NotBlank(message = "Gender is required")
	private String gender;
}
