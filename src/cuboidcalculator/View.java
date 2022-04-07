/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcalculator;

import javax.swing.*;

/**
 *
 * @author lenovo
 */
class View extends JFrame{
    JLabel ltitle = new JLabel("Cuboid Calculator");
    JLabel llength = new JLabel("Length");
    JLabel lwidth = new JLabel("Width");
    JLabel lheight = new JLabel("Height");
    JLabel lresult = new JLabel("Result  :");
    
    JLabel lcalcarea = new JLabel("");
    JLabel lcalcaround = new JLabel("");
    JLabel lcalcvolume = new JLabel("");
    JLabel larea       = new JLabel("");
    
    JTextField tflength = new JTextField();
    JTextField tfwidth = new JTextField();
    JTextField tfheight = new JTextField();
    
    JButton btncalculate = new JButton("Calculate");
    JButton btnreset = new JButton("Reset");
    
    public View(){
        setSize(450,500);
        setVisible(true); //dapat menampilkan GUI
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //ketika GUI kita tutup maka akan exit
        setLocationRelativeTo(null);
        
        add(ltitle);
        add(llength);
        add(lwidth);
        add(lheight);
        add(lresult);
        
        add(tflength);
        add(tfwidth);
        add(tfheight);
        
        add(lcalcarea);
        add(lcalcaround);
        add(lcalcvolume);
        add(larea);
        
        add(btncalculate);
        add(btnreset);
        
        ltitle.setBounds(200,20,200,25);
        
        llength.setBounds(20,70,150,25);
        tflength.setBounds(180,70,150,25);
        
        lwidth.setBounds(20,120,150,25);
        tfwidth.setBounds(180,120,150,25);
        
        lheight.setBounds(20,170,150,25);
        tfheight.setBounds(180,170,150,25);
        
        lresult.setBounds(200,200,200,25);
        
        lcalcarea.setBounds(20,240,300,25);
        lcalcaround.setBounds(20,280,300,25);
        lcalcvolume.setBounds(20,320,300,25);
        larea.setBounds(20,360,300,25);
        
        btncalculate.setBounds(50,400,150,25);
        btnreset.setBounds(250,400,150,25);
        
        
    }
    
    public String getTflength(){
        return tflength.getText();
    }
    public String getTfwidth(){
        return tfwidth.getText();
    }
    public String getTfheight(){
        return tfheight.getText();
    }
    
}
