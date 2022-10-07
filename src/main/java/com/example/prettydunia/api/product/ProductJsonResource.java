package com.example.prettydunia.api.product;


import com.example.prettydunia.application.service.product.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductJsonResource {


    private ProductService productService;

    public ProductJsonResource(ProductService productService){

        this.productService = productService;
    }
}
