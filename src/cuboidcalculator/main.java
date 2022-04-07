/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcalculator;

import cuboidcalculator.bidang.Persegi;
import cuboidcalculator.ruang.Balok;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View gui = new View();
        
         gui.btncalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String length = gui.getTflength();
                    String width = gui.getTfwidth();
                    String height = gui.getTfheight();
                    
                    double lengths = Integer.parseInt(length);
                    double widths = Integer.parseInt(width);
                    double heights = Integer.parseInt(height);
                    
                    Persegi square = new Persegi(lengths,widths);
                    Balok cube = new Balok(lengths,widths,heights);
                    
                    gui.lcalcarea.setText("Square Area : " + square.calculateArea());
                    gui.lcalcaround.setText("Square Circumference : " + square.calculateAround());
                    gui.lcalcvolume.setText("Cuboid Volume : " + cube.calculateVolume());
                    gui.larea.setText("Cuboid Surface Area : " + cube.area());
                    
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, exc.getMessage() + " Input Number!");
                }
             }
        });
         
         gui.btnreset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                gui.lcalcarea.setText("");
                gui.lcalcaround.setText("");
                gui.lcalcvolume.setText("");
                gui.larea.setText("");
                
                gui.tflength.setText("");
                gui.tfwidth.setText("");
                gui.tfheight.setText("");
            }
        });
    }
    
}
