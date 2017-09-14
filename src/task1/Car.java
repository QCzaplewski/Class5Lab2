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
public class Car {
    private String make;
    private int year;
    private String color;
    private boolean engineOn;

    public Car(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void turnOnEngine(){
        engineOn = true;
    }
    
    public void turnOffEngine(){
        engineOn = false;
    }
}
