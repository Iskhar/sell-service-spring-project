package com.example.sellservicespringproject.models.dto;
;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperationDetailDto {

    Long id;
    int quantity;
    double amount;
    ProductDto productDto;
    OperationDto operationDto;

}
