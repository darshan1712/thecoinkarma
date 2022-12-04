package com.thecoinkarma.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters")
	private String name;
	
	@NotBlank
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotBlank
	@Size(min = 8, max=16, message="Password must be minimum 8 character and max of 16 char")
//	@Pattern(regexp = ) 
	private String password;
	
	@NotBlank
	private String about;
}
