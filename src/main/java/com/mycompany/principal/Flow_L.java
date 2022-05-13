
package com.mycompany.principal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Flow_L extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public Flow_L(String title) {
        super(title);
        this.setSize(400, 75);
        this.setLocation(220, 280);
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
       this.setLayout(new FlowLayout());
   }
   
   public void iniciarEtiquetas(){
       
       this.jLabelList = new ArrayList<>();
       
       for(var i=0;i<5;i++)
        this.jLabelList.add(new JLabel());
       
       for(var a=0;a<5;a++)
       this.jLabelList.get(a).setBorder(BorderFactory.createTitledBorder(""));       
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("Button 1");
       this.jPanel1.add(this.jLabelList.get(0));
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("2");
       this.jPanel1.add(this.jLabelList.get(1));
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Button 3");
       this.jPanel1.add(this.jLabelList.get(2));
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Long_Named Button 4");
       this.jPanel1.add(this.jLabelList.get(3));
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Button 5");
       this.jPanel1.add(this.jLabelList.get(4));
    }    
}

