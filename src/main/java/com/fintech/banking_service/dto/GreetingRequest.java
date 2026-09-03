package com.fintech.banking_service.dto;
import jakarta.validation.constraints.NotBlank;

public class GreetingRequest {

    @NotBlank(message = "Message cannot be empty")
    private String message;

    // Default constructor (required for Jackson JSON deserialization)
    public GreetingRequest() {}

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}