package com.quikr.proj.repository;

import com.quikr.proj.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
    List<Products> findAll();
    Optional<Products> findById(Integer Id);
    Optional<List<Products>> findAllByLocation(String location);
}
