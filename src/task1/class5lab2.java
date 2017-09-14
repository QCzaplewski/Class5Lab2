/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Quinten
 */
public class class5lab2 {
    public static void main(String[] args) {
        Car car1 = new ChevyMalibu(2004, "Blue");
        
        Car car2 = new Car("Ford", 2008, "Blue", "Focus");
        
        Car car3 = new Chevy(2015, "Red", "Cruze");
        
        Chevy car4 = new ChevyMalibu(2003, "Purple");
        
        System.out.println(car1.getMake() + " " + car1.getModel());
        System.out.println(car2.getMake() + " " + car2.getModel());
        System.out.println(car3.getMake() + " " + car3.getModel());
        System.out.println(car4.getMake() + " " + car4.getModel());
        
        car1.turnOnEngine();
        car2.turnOnEngine();
        car3.turnOnEngine();
        car4.turnOnEngine();
        
        car1.turnOffEngine();
        car2.turnOffEngine();
        car3.turnOffEngine();
        car4.turnOffEngine();
    }
}
