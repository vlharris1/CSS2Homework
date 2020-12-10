package com.tts.validatingforminput.domain;

import org.springframework.lang.NonNull;


public class PersonForm {
	
	@NonNull
//	@Size (min=2, max=30)
	private String name;
	
	@NonNull
//	@Min(18)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}
	
	
}
