package com.infosys.spring_boot_ecommerce_project.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String msg) {
		
		super(msg);
	}
}
