package com.restaurantfinder.api.exceptions;

import com.restaurantfinder.api.models.HttpErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class RecordCreateFailedAdvice {

    @ResponseBody
    @ExceptionHandler(RecordCreateFailedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public HttpErrorResponse handleRecordCreateFailedException(RecordCreateFailedException e) {
        return new HttpErrorResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getClass().getTypeName());
    }
}
