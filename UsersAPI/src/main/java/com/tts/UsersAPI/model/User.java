package com.tts.UsersAPI.model;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Length(max = 20, message = "first name must be less than 20 characters")
	private String firstName;
	
//	@Length(min = 2, message = "last name must be a minimum of 2 characters")
	private String lastName;
	
//	@Length(min = 4, max = 20, message = "a minimum of 4 and a max of 20 letters")
	private String state;	
}
