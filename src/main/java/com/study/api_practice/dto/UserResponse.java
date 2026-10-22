package com.study.api_practice.dto;

public record UserResponse(
    String message,
    String name,
    boolean isAdult
){}