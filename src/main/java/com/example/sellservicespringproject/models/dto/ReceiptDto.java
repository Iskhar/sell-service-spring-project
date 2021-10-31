package com.example.sellservicespringproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReceiptDto {

    List<ReceiptDetailsDto> receiptDetailsDto;
    double totalAmount;
    String cashier;
}
