package org.example.lesson6.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Roman Gulevatiy on 12.03.2026.
 * github github.com/RomanGulevatiy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "SKU is required")
    private String sku;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Price is required")
    private double price;

    @NotNull(message = "Quantity is required")
    private int quantity;
}
