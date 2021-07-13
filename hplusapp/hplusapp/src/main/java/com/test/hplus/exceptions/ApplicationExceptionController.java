package com.test.hplus.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionController {

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in global exception handler of login controller");
        return "error";
    }
}
