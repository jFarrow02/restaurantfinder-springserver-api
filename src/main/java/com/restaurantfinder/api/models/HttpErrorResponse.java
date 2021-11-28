package com.restaurantfinder.api.models;

import java.time.LocalDateTime;

public class HttpErrorResponse {

    private String error;

    private int status;

    private LocalDateTime timestamp;

    private String errorType;

    public HttpErrorResponse(String message, int status, String errorType) {
        this.error = message;
        this.status = status;
        this.timestamp = LocalDateTime.now();
        this.errorType = errorType;
    }

    public String getError() {
        return error;
    }

    public void setError(String message) {
        this.error = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime dateTime) {
        this.timestamp = dateTime;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
}
