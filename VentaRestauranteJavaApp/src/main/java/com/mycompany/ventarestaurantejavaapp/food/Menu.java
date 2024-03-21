package com.mycompany.ventarestaurantejavaapp.food;
import com.mycompany.ventarestaurantejavaapp.values.DishTypes;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList = new ArrayList<>();
    }
    
    public void addDish(Dish dish) {
        this.dishList.add(dish);        
    }
    
   /*forma 1/*
    
    */
    public void showMenu1() {
        for(Dish dish : dishList){
            System.out.println(dish.getName());
    }
   }
    
    /*forma 2/*
    
    */
    
    public void showMenu2() {
        System.out.println("------------- MENÚ -------------");
        
        for(DishTypes dishType : DishTypes.value()) {
            System.out.println("-------------" + dishType + "-------------");            
            
            for(Dish dish : dishList) {
                if(dish.getType() == dishType){
                    System.out.println(dish.getName());
                }
            }
        }
    }
    
    
}
