
package com.mycompany.principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Border_L extends JFrame {
 
    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    
   public Border_L(String title) {
        super(title);
        this.setSize(280, 150);
        this.setLocation(90, 90);
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
       this.jPanel1.setBackground(Color.WHITE);
       this.jPanel1.setLayout(new BorderLayout());
   }
   
   public void iniciarEtiquetas(){
    this.jLabelList = new ArrayList<>();
      for(var i=0;i<6;i++)
        {
         this.jLabelList.add(new JLabel());
         this.jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
         this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder(""));
         this.jLabelList.get(i).setOpaque(true);
        }
       
        this.jLabelList.get(0).setBackground(Color.GRAY);
        this.jLabelList.get(0).setText("Button 1");
        this.jLabelList.get(1).setBackground(Color.GRAY);
        this.jLabelList.get(1).setText("Long-Named Button 4");    
        this.jLabelList.get(2).setBackground(Color.GRAY);
        this.jLabelList.get(2).setText("Button 5");      
        this.jLabelList.get(3).setBackground(Color.GRAY);
        this.jLabelList.get(3).setText("2");
        this.jLabelList.get(4).setBackground(Color.GRAY);
        this.jLabelList.get(4).setText("Button 3");      

        this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
        this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
        this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
        this.jPanel1.add(this.jLabelList.get(3),BorderLayout.CENTER);
        this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
    }      
}