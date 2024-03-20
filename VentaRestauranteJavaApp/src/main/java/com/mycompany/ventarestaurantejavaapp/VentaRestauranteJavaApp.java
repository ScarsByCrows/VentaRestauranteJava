package com.mycompany.ventarestaurantejavaapp;

import com.mycompany.ventarestaurantejavaapp.food.Dish;
import com.mycompany.ventarestaurantejavaapp.food.Menu;
import com.mycompany.ventarestaurantejavaapp.people.User;
import com.mycompany.ventarestaurantejavaapp.values.DishTypes;
import com.mycompany.ventarestaurantejavaapp.values.DishVariation;
import com.mycompany.ventarestaurantejavaapp.values.UserTypes;

public class VentaRestauranteJavaApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Cole", "001", "A");
        student.sell();
        
        Menu menu = new Menu();
        
        Dish dish1 = new Dish("Huevos Rancheros", DishTypes.BREAKFAST, 20, 5400, DishVariation.OPTION1);
        Dish dish2 = new Dish("Fideos con Pollo y Brócoli", DishTypes.LUNCH, 20, 10000, DishVariation.OPTION2);
        Dish dish3 = new Dish("Estofado de Carne con Verduras", DishTypes.DINNER, 20, 8500, DishVariation.OPTION3);
        
        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        
        menu.showMenu();
                
    }
    
}
