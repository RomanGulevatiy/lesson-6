package org.example.lesson6.repository;

import org.example.lesson6.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Roman Gulevatiy on 12.03.2026.
 * github github.com/RomanGulevatiy
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
