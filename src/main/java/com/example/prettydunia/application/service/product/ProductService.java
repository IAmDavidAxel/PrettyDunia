package com.example.prettydunia.application.service.product;


import com.example.prettydunia.domain.product.ProductFactory;
import com.example.prettydunia.domain.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductFactory productFactory;


    public ProductService(ProductRepository productRepository, ProductFactory productFactory){
        this.productFactory = productFactory;
        this.productRepository = productRepository;

    }


}
