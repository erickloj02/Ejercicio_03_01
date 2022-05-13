
package com.mycompany.principal;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Grind_L extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;    
    
    public Grind_L(String title) {
        super(title);
        this.setSize(300,150);
        this.setLocation(400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
    }
   
    public void iniciarPanel(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.GRAY);
        this.jPanel1.setLayout(new GridLayout(3,2));
    }  
    
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("Button 1");
       this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
       this.jLabelList.get(0).setBorder(BorderFactory.createTitledBorder(""));       
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("2");
       this.jLabelList.get(1).setHorizontalAlignment(SwingConstants.CENTER);
       this.jLabelList.get(1).setBorder(BorderFactory.createTitledBorder(""));       
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Button 3");
       this.jLabelList.get(2).setHorizontalAlignment(SwingConstants.CENTER);
       this.jLabelList.get(2).setBorder(BorderFactory.createTitledBorder(""));       
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Long-Named Button 4");
       this.jLabelList.get(3).setHorizontalAlignment(SwingConstants.CENTER);
       this.jLabelList.get(3).setBorder(BorderFactory.createTitledBorder(""));       
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Button 5");
       this.jLabelList.get(4).setHorizontalAlignment(SwingConstants.CENTER);
       this.jLabelList.get(4).setBorder(BorderFactory.createTitledBorder(""));       
       this.jPanel1.add(this.jLabelList.get(0));
       this.jPanel1.add(this.jLabelList.get(1));
       this.jPanel1.add(this.jLabelList.get(2));
       this.jPanel1.add(this.jLabelList.get(3));
       this.jPanel1.add(this.jLabelList.get(4));
    }     
}
