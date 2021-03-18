package com.quikr.proj.resource;

import com.quikr.proj.model.product;
import com.quikr.proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource
{
    @Autowired
    ProductRepository productRepository;
    @GetMapping(value = "/")
    public  List<product> getAll(){
        List<product> productList=productRepository.findAll();
        System.out.println(productList);
        return productList;
    }
}
