package people;

import values.UserTypes;

public class User {
    private UserTypes type;
    String name;
    String id;

    public User(UserTypes type, String name, String id) {
        this.type = type;
        this.name = name;
        this.id = id;
    }
    
    
   
    public void buy() {
                
    }
    
    public void sell() {
        if(this.type != UserTypes.ADMINISTRATIVE) {
            System.out.println("Usted no está autorizado para la venta de platos.");
        }
    }
}
