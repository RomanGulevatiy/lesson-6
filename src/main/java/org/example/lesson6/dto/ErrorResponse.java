package org.example.lesson6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by Roman Gulevatiy on 13.03.2026.
 * github github.com/RomanGulevatiy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {

    private int status;

    private String error;

    private String message;

    private LocalDateTime timestamp;
}
