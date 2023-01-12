package com.example.foodmenuservice.controller.command.model;

import lombok.Data;

import java.util.List;

@Data
public class FoodMenuUpdateModel {
    private String _id;
    private String name;
    private String type;
    private List<String> foods;
    private int price;
    private int quantity;
    private String img;
}
