package com.example.challenge.repository;

import com.example.challenge.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> {
}
