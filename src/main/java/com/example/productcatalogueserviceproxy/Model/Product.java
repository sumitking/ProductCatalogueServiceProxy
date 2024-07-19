package com.example.productcatalogueserviceproxy.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String  title;
    private String  description;
    private Double price;
    private String  imageUrl;
    private Category category;
}
