package com.test.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerBadRequestException.class)
	public ResponseEntity<ErrorMessage> customerBadRequestException(
			CustomerBadRequestException e, WebRequest request){
		ErrorMessage message = new ErrorMessage();
		
		int code = HttpStatus.BAD_REQUEST.value();
		
		message.setTimeStamp(new Date());
		message.setMessage(e.getMessage());
		message.setUrl(request.getDescription(false));
		message.setStatusCode(code);
		
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ErrorMessage> customerNotFoundException(
			CustomerNotFoundException e, WebRequest request){
		ErrorMessage message = new ErrorMessage();
		
		int code = HttpStatus.NOT_FOUND.value();
		
		message.setTimeStamp(new Date());
		message.setMessage(e.getMessage());
		message.setUrl(request.getDescription(false));
		message.setStatusCode(code);
		
		return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		
	}
}
