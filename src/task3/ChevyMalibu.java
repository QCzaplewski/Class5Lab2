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
public class ChevyMalibu implements Chevy{
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean engineOn;

    public ChevyMalibu(int year, String color) {
        this.make = "Chevy";
        this.model = "Malibu";
        this.year = year;
        this.color = color;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    } 
    
    @Override
    public void turnOnEngine(){
        engineOn = true;
    }
    
    @Override
    public void turnOffEngine(){
        engineOn = false;
    }
}
