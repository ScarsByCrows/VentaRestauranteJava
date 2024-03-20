package com.mycompany.ventarestaurantejavaapp.food;

import com.mycompany.ventarestaurantejavaapp.values.DishTypes;
import com.mycompany.ventarestaurantejavaapp.values.DishVariation;

public class Dish {
    String name;
    DishTypes type;
    int stock;
    int price;
    DishVariation variation;

    public Dish(String name, DishTypes type, int stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    }
    
}
