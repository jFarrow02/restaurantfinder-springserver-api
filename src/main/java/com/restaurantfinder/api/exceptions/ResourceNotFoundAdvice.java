package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.models.HttpErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ResourceNotFoundAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public HttpErrorResponse handleResourceNotFound(ResourceNotFoundException e) {
        return new HttpErrorResponse(e.getMessage(), HttpStatus.NOT_FOUND.value());
    }
}
