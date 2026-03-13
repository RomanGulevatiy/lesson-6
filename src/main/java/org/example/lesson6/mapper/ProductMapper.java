package org.example.lesson6.mapper;

import org.example.lesson6.dto.CreateProductRequest;
import org.example.lesson6.dto.ProductResponse;
import org.example.lesson6.entity.Product;
import org.springframework.stereotype.Component;

/**
 * Created by Roman Gulevatiy on 13.03.2026.
 * github github.com/RomanGulevatiy
 */
@Component
public class ProductMapper {

    public ProductResponse toResponse(Product product) {
        if(product == null) return null;

        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .sku(product.getSku())
                .description(product.getDescription())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .isAvailable(product.isAvailable())
                .createdAt(product.getCreatedAt())
                .build();
    }

    public Product createDtoToEntity (CreateProductRequest createProductRequest) {
        if(createProductRequest == null) return null;

        return Product.builder()
                .name(createProductRequest.getName())
                .sku(createProductRequest.getSku())
                .description(createProductRequest.getDescription())
                .price(createProductRequest.getPrice())
                .quantity(createProductRequest.getQuantity())
                .build();
    }
}
