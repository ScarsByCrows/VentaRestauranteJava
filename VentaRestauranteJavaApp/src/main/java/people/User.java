package people;

import values.UserTypes;
import java.util.Scanner;

public class User { 
Scanner ingresar = new Scanner(System.in);
    private UserTypes type;
    String name;
    String id;
    String order;

    public User(UserTypes type, String name, String id, String order) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.order = order;
    }
    
    
   
    public void buy() {
        if(this.type == UserTypes.STUDENT) {
            System.out.println("Seleccione el horario del Menú"); 
            System.out.println("A. Desayuno   B. Almuerzo   C. Cena");
            order=ingresar.nextLine();
        }
    }
    
    public void sell() {
        if(this.type != UserTypes.ADMINISTRATIVE) {
            System.out.println("Usted no está autorizado para la venta de platos.");
        }
    }
}
