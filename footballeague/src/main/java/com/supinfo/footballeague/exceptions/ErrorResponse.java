package com.supinfo.footballeague.exceptions;

import java.time.Instant;

public record ErrorResponse(
        String message,
        String statusMessage,
        int status,
        Instant timestamp
) {
}
