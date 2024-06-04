package com.supinfo.footballeague.exceptions;

public record FieldError(
        String entityName,
        String fieldName,
        String message,
        String code
) {
}
