package org.example.lesson6.controller;

import lombok.RequiredArgsConstructor;
import org.example.lesson6.dto.CreateProductRequest;
import org.example.lesson6.dto.ProductResponse;
import org.example.lesson6.dto.UpdateProductRequest;
import org.example.lesson6.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Roman Gulevatiy on 13.03.2026.
 * github github.com/RomanGulevatiy
 */
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping()
    public ProductResponse createProduct(@RequestBody CreateProductRequest createProductRequest) {
        return productService.create(createProductRequest);
    }

    @GetMapping()
    public List<ProductResponse> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductResponse getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(@PathVariable Long id,
                                         @RequestBody UpdateProductRequest updateProductRequest) {
        return productService.update(id, updateProductRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
}
