package org.example.lesson6.service;

import lombok.RequiredArgsConstructor;
import org.example.lesson6.repository.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Roman Gulevatiy on 12.03.2026.
 * github github.com/RomanGulevatiy
 */
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    
}
