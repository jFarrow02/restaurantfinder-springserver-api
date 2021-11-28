package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.models.HttpErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ValidationFailedAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationFailedException.class)
    public HttpErrorResponse handleResourceNotFound(ValidationFailedException e) {
        return new HttpErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value(), e.getClass().getTypeName());
    }
}
