package com.example.sellservicespringproject.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperationDto {

    Long id;
    Date addDate;
    double totalAmount;
    double change;
    UserDto userDto;
    double cash;
}
