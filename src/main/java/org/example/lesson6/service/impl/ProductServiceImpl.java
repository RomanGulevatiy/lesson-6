package org.example.lesson6.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.lesson6.dto.CreateProductRequest;
import org.example.lesson6.dto.ProductResponse;
import org.example.lesson6.dto.UpdateProductRequest;
import org.example.lesson6.entity.Product;
import org.example.lesson6.exception.ProductNotFoundException;
import org.example.lesson6.mapper.ProductMapper;
import org.example.lesson6.repository.ProductRepository;
import org.example.lesson6.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Roman Gulevatiy on 13.03.2026.
 * github github.com/RomanGulevatiy
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Transactional
    @Override
    public ProductResponse create(CreateProductRequest createProductRequest) {
        Product product = mapper.createDtoToEntity(createProductRequest);

        Product savedProduct = productRepository.save(product);
        log.info("Product with id {} was created", savedProduct.getId());
        return mapper.toResponse(savedProduct);
    }

    @Override
    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public ProductResponse findById(Long id) {
        return productRepository.findById(id)
                .map(mapper::toResponse).orElseThrow(
                        () -> new ProductNotFoundException(id)
                );
    }

    @Transactional
    @Override
    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product existing = productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException(id)
        );

        existing.setName(updateProductRequest.getName());
        existing.setDescription(updateProductRequest.getDescription());
        existing.setPrice(updateProductRequest.getPrice());
        existing.setQuantity(updateProductRequest.getQuantity());

        Product updated = productRepository.save(existing);
        log.info("Product with id {} was updated", id);
        return mapper.toResponse(updated);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
        log.info("Product with id {} was deleted", id);
    }
}
