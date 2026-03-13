package org.example.lesson6.service;

import org.example.lesson6.dto.CreateProductRequest;
import org.example.lesson6.dto.ProductResponse;
import org.example.lesson6.dto.UpdateProductRequest;

import java.util.List;

/**
 * Created by Roman Gulevatiy on 12.03.2026.
 * github github.com/RomanGulevatiy
 */
public interface ProductService {

    ProductResponse create(CreateProductRequest createProductRequest);

    List<ProductResponse> findAll();

    ProductResponse findById(Long id);

    ProductResponse update(Long id, UpdateProductRequest updateProductRequest);

    void delete(Long id);
}
