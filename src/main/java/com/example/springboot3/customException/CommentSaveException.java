package com.example.springboot3.customException;

public class CommentSaveException extends RuntimeException {

	public CommentSaveException(String message) {
		super(message);
	}

}
