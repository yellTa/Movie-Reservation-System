package com.example.springboot3.customException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CommentSaveException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<?> saveException(CommentSaveException ex) {
		Map<String, Object> response = new HashMap<>();
		response.put("result", "fail");
		return ResponseEntity.internalServerError()
							 .body(response);
	}

}
