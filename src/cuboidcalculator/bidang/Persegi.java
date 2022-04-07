/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcalculator.bidang;

/**
 *
 * @author lenovo
 */
public class Persegi implements MenghitungBidang {
    private double length, width;

    public Persegi(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculateAround() {
        return 2 * (length + width);
    }
    
}
