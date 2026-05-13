package com.codegnan.exceptions;

public class InvalidDateFormatException extends RuntimeException{
	public InvalidDateFormatException(Throwable cause) {
		super("Invalid date format. Excepted format: dd-MM-yyyy", cause);
	}

}
