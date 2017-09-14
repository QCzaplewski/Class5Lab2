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
public interface Chevy extends Car{
    public abstract void setMake(String make);
    public abstract String getMake();
    
    public abstract void setModel(String model);
    public abstract String getModel();
    
    public abstract void setYear(int year);
    public abstract int getYear();
    
    public abstract void setColor(String color);
    public abstract String getColor();
}
