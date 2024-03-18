/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractconcept;

/**
 *
 * @author wilso
 */
public class AbstractConcept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Execution e = new Execution();
        e.execution();
    }
    
}

abstract class Car {

    abstract void ford();

    abstract void renault();
    
    public String toyota (){
        //System.out.print("Price $30000");
        return "$30000";
    }
}

class CarPrice extends Car {

    public void ford() {
        System.out.print("Price $10000");
    }

    public void renault() {
        System.out.print("Price $20000" );
        
    }  
}

 class Execution {

    public void execution() {
        CarPrice c = new CarPrice();
        c.ford();
        c.renault();
        System.out.print(c.toyota() );
        
    }

}
