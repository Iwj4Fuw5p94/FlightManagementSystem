package com.cts.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends Exception{
	
//	@ExceptionHandler
//	public ResponseEntity<String> handler(Exception e){
//		return new ResponseEntity();
//		
//	}
	

}
