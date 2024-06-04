package com.supinfo.footballeague.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;
import java.util.List;

@Slf4j
@ControllerAdvice
public class ExceptionsHandlers extends ResponseEntityExceptionHandler {

    /**
     * Handle the MethodArgumentNotValidException to automatically send an error response to the client.
     *
     * @param ex      the exception MethodArgumentNotValidException
     * @param headers the headers
     * @param status  the status
     * @param request the request
     * @return the error response entity
     * @author Peter Mollet
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            @NonNull HttpHeaders headers,
            @NonNull HttpStatusCode status,
            @NonNull WebRequest request
    ) {
        log.error("Method argument not valid: {}", ex.getMessage());
        List<FieldError> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> new FieldError(
                        fieldError.getObjectName(),
                        fieldError.getField(),
                        fieldError.getDefaultMessage(),
                        fieldError.getCode()))
                .toList();
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequestException(BadRequestException ex) {
        log.info("Bad request exception: {}", ex.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(
                ex.getMessage(),
                "BAD_REQUEST",
                400,
                Instant.now()
        );
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
