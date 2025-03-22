package com.doctor.app.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private int httpStatus;
    private String message;

    public ErrorResponse(int httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}

