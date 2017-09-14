/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Quinten
 */
public class class5lab2 {
    public static void main(String[] args) {
        Chevy car1 = new ChevyMalibu(2004, "Blue");
        
        ChevyMalibu car2 = new ChevyMalibu(2015, "Red");
        
        System.out.println(car1.getMake() + " " + car1.getModel());
        System.out.println(car2.getMake() + " " + car2.getModel());
        
        car1.turnOnEngine();
        car2.turnOnEngine();
        
        car1.turnOffEngine();
        car2.turnOffEngine();
    }
}
