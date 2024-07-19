package com.example.productcatalogueserviceproxy.Controller;

import com.example.productcatalogueserviceproxy.DTO.ProductDto;
import com.example.productcatalogueserviceproxy.Model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String GetProduct() {
        return "Return list of products";
    }

    @GetMapping("/products/{id}")
    public String GetProduct(@PathVariable("id") Long id) {
        return "Return single products " + id;
    }

    @PostMapping("/products")
    public String AddProduct(@RequestBody ProductDto product) {
        return "Product added" + product;
    }
}
