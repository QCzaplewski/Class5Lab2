/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Quinten
 */
public class Chevy extends Car{
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean engineOn;

    public Chevy(String model, int year, String color) {
        this.make = "Chevy";
        this.model = model;
        this.year = year;
        this.color = color;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(make.isEmpty()){
            throw new IllegalArgumentException("Value must be filled");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1913 || year > 2018){
            throw new IllegalArgumentException("Value must be a valid year");
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
    
    @Override
    public void turnOnEngine(){
        engineOn = true;
    }
    
    @Override
    public void turnOffEngine(){
        engineOn = false;
    }

}
