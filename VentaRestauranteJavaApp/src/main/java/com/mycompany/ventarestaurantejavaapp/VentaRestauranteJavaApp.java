package com.mycompany.ventarestaurantejavaapp;

import people.User;
import values.UserTypes;

public class VentaRestauranteJavaApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Cole", "001", "A");
        student.sell();
        
        User student1 = new User (UserTypes.STUDENT, "Cassidy", "002", order);
        student.buy();
    }
    
}
