package com.wenkuan.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	
	@ExceptionHandler(Exception.class)
	public Object allExceptionHanlder(Exception e){
		
		
		return null;
		
	}
	
}
