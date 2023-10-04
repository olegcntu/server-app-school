package com.example.demo.dto;

import java.util.List;

public class ApiResponse {
    private boolean successful;
    private String message;
    private List<String> errors;

    public ApiResponse(boolean successful, String message) {
        this.successful = successful;
        this.message = message;
    }

    // Геттеры и сеттеры для полей
    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
