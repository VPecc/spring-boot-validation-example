package com.example.validationtest;

import org.springframework.validation.FieldError;

import java.util.List;

public class ValidationError {

    private List<String> errors;

    public ValidationError() {
    }

    public ValidationError(List<FieldError> errors) {
        this.errors = errors.stream()
                .map(fe -> fe.getField() + ": " + fe.getDefaultMessage())
                .toList();
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
