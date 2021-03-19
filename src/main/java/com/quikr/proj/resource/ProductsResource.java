package com.quikr.proj.resource;

import com.quikr.proj.model.Products;
import com.quikr.proj.repository.ProductsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource
{
    final
    ProductsRepository productRepository;

    public ProductsResource(ProductsRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping()
    public  List<Products> getAll(){
        List<Products> productList=productRepository.findAll();
        System.out.println("This is Products list!!!!!!");

        System.out.println(productList);

        return productList;
    }

    @GetMapping(value = "/byid/{id}")
    public Optional<Products> getbyid(@PathVariable Integer id){
        Optional<Products> productList=productRepository.findById(id);
        System.out.println("This is Products list!!!!!!");
        System.out.println(productList);
        return productList;
    }
    @GetMapping(value = "/bycity/{city}")
    public Optional<List<Products>> getAllbycity(@PathVariable String city){
        Optional<List<Products>> productList=productRepository.findAllByCityName(city);
        System.out.println("This is Products list!!!!!!");
        System.out.println(productList);
        return productList;
    }

}
