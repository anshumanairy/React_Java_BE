package com.quikr.proj.repository;

import com.quikr.proj.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<product,Integer> {
    List<product> findAll();

}
