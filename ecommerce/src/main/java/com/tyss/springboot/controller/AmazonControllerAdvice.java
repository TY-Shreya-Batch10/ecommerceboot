package com.tyss.springboot.controller;


@RestControllerAdvice
public class AmazonControllerAdvice {
	
	@ExceptionHandler(AmazonException.class)
	public AmazonResponse exceptionHandler(AmazonException exception) {
		AmazonResponse response = new AmazonResponse();
		response.setStatusCode(500);
		response.setMessage(exception.getMessage());
		return response;
	}
}