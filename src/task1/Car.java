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
        if(make.isEmpty()){
            throw new IllegalArgumentException("Value must be filled");
        }
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1913 || year > 2018){
            throw new IllegalArgumentException("Value must be a valid year.");
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(make.isEmpty()){
            throw new IllegalArgumentException("Value must be filled");
        }
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(make.isEmpty()){
            throw new IllegalArgumentException("Value must be filled");
        }
        this.model = model;
    }
    
    public void turnOnEngine(){
        engineOn = true;
    }
    
    public void turnOffEngine(){
        engineOn = false;
    }
}
