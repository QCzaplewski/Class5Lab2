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
    private String model;
    private boolean engineOn;

    public Car(String make, int year, String color, String model) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.model = model;
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
        if(year < 1913 || year > 2018){
            throw new IllegalArgumentException("Value must be greater than 0 and less than 150");
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void turnOnEngine(){
        engineOn = true;
    }
    
    public void turnOffEngine(){
        engineOn = false;
    }
}
