package com.example.productcatalogueserviceproxy.DTO;

import com.example.productcatalogueserviceproxy.Model.Category;
import lombok.*;

@Getter
@Setter
@ToString
public class ProductDto {
    private String  title;
    private String  description;
    private Double price;
    private String  imageUrl;
    private Category category;
}
