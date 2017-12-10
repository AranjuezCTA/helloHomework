package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Offer {
	
	private int year;
	private int semester;
	@Size(min=2, max=20, message="Code must be between 2 and 20 chars")
	private String code;
	@NotEmpty(message="The subject cannot be empty")
	private String subject;
	private String sort;
	private int credit;
	
}
