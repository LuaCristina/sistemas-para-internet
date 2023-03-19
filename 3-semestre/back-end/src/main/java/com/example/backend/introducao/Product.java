package com.example.backend.introducao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private Date date;
}