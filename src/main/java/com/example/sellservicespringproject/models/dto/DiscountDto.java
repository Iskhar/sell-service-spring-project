package com.example.sellservicespringproject.models.dto;

import com.example.sellservicespringproject.models.entities.Product;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDto {
    Long id;
    double discount;
    Date startDate;
    Date endDate;
    ProductDto productDto;

    public ProductDto getProduct(){
        return productDto;
    }
}
