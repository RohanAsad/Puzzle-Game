/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinkster;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;

public class frame  implements ActionListener{
    JFrame frame;
    JButton start,exit;
    JLabel label;
    JPanel panel,panel2;
    
    @SuppressWarnings("LeakingThisInConstructor")
    frame(){
       
        
        label=new JLabel("Do You Want To Start The Game?");
        label.setFont(new Font("Serif", Font.BOLD, 18));
        //label.setSize(100,100);
        label.setBounds(10,50,300,50);
        label.setForeground(Color.BLACK);
        
        
        start=new JButton("START");
        start.setBackground(Color.BLACK);
        start.setForeground(Color.CYAN);
       // start.setSize(50,80);
        start.addActionListener(this);
        start.setBounds(50,150,80,30);
        
        exit=new JButton("EXIT");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.CYAN);
        //exit.setSize(50,80);
        exit.addActionListener(this);
        exit.setBounds(150,150,80,30);
        
    
        frame=new JFrame("ThinkSter");
        ImageIcon icon=new ImageIcon(getClass().getResource("puzzle.jpg"));
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setBackground(Color.GRAY);
        frame.setResizable(false);
        frame.setBounds(500, 400, 300, 300);
        frame.getContentPane().setBackground(Color.GRAY);
        
        frame.add(label);
        frame.add(start);
        frame.add(exit);
        
    }
    @Override
    public void actionPerformed(ActionEvent event){
       
        //start button
        if(event.getSource()==start){
            
            ThinkSter O=new ThinkSter();
            frame.dispose();
        }
        
        //exit button
        else if(event.getSource()==exit){
           
           frame.dispose();
           
        }
            
    }
    
}
