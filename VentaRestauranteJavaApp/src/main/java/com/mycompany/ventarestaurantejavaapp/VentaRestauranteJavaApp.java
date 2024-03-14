package com.mycompany.ventarestaurantejavaapp;

import people.User;
import values.UserTypes;

public class VentaRestauranteJavaApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Cole", "001");
        student.sell();
    }
}
