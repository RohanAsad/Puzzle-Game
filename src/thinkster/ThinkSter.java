/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thinkster;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class ThinkSter extends JFrame implements ActionListener {

JTextField score;    
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b,reset,quit;  
ImageIcon icon,img,img1,img2,img3,img4,img5,img6,img7,img8,img9;
Icon empty;
JLabel label,image,move;
String moves;
int m=0;
JTextField text;

@SuppressWarnings("LeakingThisInConstructor")
ThinkSter(){
    super("ThinkSter");
    
    move=new JLabel("Moves:");
    move.setBounds(100,50,70,30);
    move.setForeground(Color.BLACK);
    
    text=new JTextField();
    text.setBounds(150,50,70,30);
    text.setBackground(Color.LIGHT_GRAY);
    text.setEditable(false);
    
    reset=new JButton("Reset");
    reset.setBounds(450,50,70,30);
    reset.setBackground(Color.GRAY);
    reset.setForeground(Color.BLACK);
    
    quit=new JButton("Quit");
    quit.setBounds(530,50,70,30);
    quit.setBackground(Color.GRAY);
    quit.setForeground(Color.BLACK);
    
    
    label=new JLabel("LEVEL 1");
    label.setBounds(320,10,80,20);
    label.setFont(new Font("Serif",Font.BOLD,16));
    label.setForeground(Color.red);
    //label.setSize(50, 100);
    
    img1=new ImageIcon(getClass().getResource("1.gif"));
    img2=new ImageIcon(getClass().getResource("2.gif"));
    img3=new ImageIcon(getClass().getResource("3.gif"));
    img4=new ImageIcon(getClass().getResource("4.gif"));
    img5=new ImageIcon(getClass().getResource("5.gif"));
    img6=new ImageIcon(getClass().getResource("6.gif"));
    img7=new ImageIcon(getClass().getResource("7.gif"));
    img8=new ImageIcon(getClass().getResource("8.gif"));
    img9=new ImageIcon(getClass().getResource("9.gif"));
    
    b1=new JButton(img1);  
    b1.setBounds(50,150,80,80);
    
    b2=new JButton(img5);  
    b2.setBounds(130,150,80,80); 
    
    b3=new JButton(img8);  
    b3.setBounds(210,150,80,80); 
    
    b4=new JButton(img3);  
    b4.setBounds(50,230,80,80);  
   
    b5=new JButton(img7);  
    b5.setBounds(130,230,80,80);  
    
    b6=new JButton(img2);  
    b6.setBounds(210,230,80,80);  
    
    b7=new JButton(img4);  
    b7.setBounds(50,310,80,80); 
    
    b8=new JButton(img6);  
    b8.setBounds(130,310,80,80); 
    
    b9=new JButton("");  
    b9.setBounds(210,310,80,80);
    
    img=new ImageIcon(getClass().getResource("luffy2.jpg"));
    image=new JLabel(img);
    image.setBounds(400, 150, 240, 240);
      
    b1.addActionListener(this);  
    b2.addActionListener(this); 
    b3.addActionListener(this); 
    b4.addActionListener(this); 
    b5.addActionListener(this); 
    b6.addActionListener(this); 
    b7.addActionListener(this);  
    b8.addActionListener(this); 
    b9.addActionListener(this); 
    reset.addActionListener(this);
    quit.addActionListener(this);
      
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(image);add(label);  
    add(reset);add(quit);add(text);add(move);
    
//setSize(750,600);  
    icon=new ImageIcon(getClass().getResource("puzzle.jpg"));
    setIconImage(icon.getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(null);  
    setVisible(true);  
    setBounds(300,300,710,600);
    getContentPane().setBackground(Color.DARK_GRAY);
    
}  


@Override
public void actionPerformed(ActionEvent e){  
   
    if(e.getSource()==b1){  
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b1.getIcon();  
      if(b2.getIcon()==empty){  
        b2.setIcon(i1);  
        b1.setIcon(empty);  
      }
      else if(b4.getIcon()==empty){  
        b4.setIcon(i1);  
        b1.setIcon(empty);  
        }
      
    }
      
     
    if(e.getSource()==b2){ 
        //counting moves 
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b2.getIcon();  
      if(b1.getIcon()==empty){  
        b1.setIcon(i1);  
        b2.setIcon(empty);  
      }
      else if(b3.getIcon()==empty){  
            b3.setIcon(i1);  
            b2.setIcon(empty);  
        }
      else if(b5.getIcon()==empty){
            b5.setIcon(i1);
            b2.setIcon(empty);
          
        }
    }
   
    if(e.getSource()==b3){  
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b3.getIcon();  
      if(b2.getIcon()==empty){  
        b2.setIcon(i1);  
        b3.setIcon(empty);  
      }
      else if(b6.getIcon()==empty){  
            b6.setIcon(i1);  
            b3.setIcon(empty);  
        }
      
    }
    
    if(e.getSource()==b4){ 
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b4.getIcon();  
      if(b5.getIcon()==empty){  
        b5.setIcon(i1);  
        b4.setIcon(empty);  
      }
      else if(b1.getIcon()==empty){  
            b1.setIcon(i1);  
            b4.setIcon(empty);  
        }
      else if(b7.getIcon()==empty){
        b7.setIcon(i1);
        b4.setIcon(empty);
          
        }
    }
   
    if(e.getSource()==b5){  
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b5.getIcon();  
      if(b2.getIcon()==empty){  
        b2.setIcon(i1);  
        b5.setIcon(empty);  
      }
      else if(b4.getIcon()==empty){  
            b4.setIcon(i1);  
            b5.setIcon(empty);  
        }
      else if(b6.getIcon()==empty){
            b6.setIcon(i1);
            b5.setIcon(empty);
        }
      else if(b8.getIcon()==empty){
            b8.setIcon(i1);
            b5.setIcon(empty);
        }
    }
    
    if(e.getSource()==b6){  
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b6.getIcon();  
      if(b9.getIcon()==empty){  
        b9.setIcon(i1);  
        b6.setIcon(empty);  
      }
      else if(b5.getIcon()==empty){  
            b5.setIcon(i1);  
            b6.setIcon(empty);  
        }
      else if(b3.getIcon()==empty){
        b3.setIcon(i1);
        b6.setIcon(empty);
        }
    }
     
    if(e.getSource()==b7){ 
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b7.getIcon();  
      if(b4.getIcon()==empty){  
        b4.setIcon(i1);  
        b7.setIcon(empty);  
      }
      else if(b8.getIcon()==empty){  
            b8.setIcon(i1);  
            b7.setIcon(empty);  
        }
    }
    
    if(e.getSource()==b8){  
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b8.getIcon();  
      if(b5.getIcon()==empty){  
        b5.setIcon(i1);  
        b8.setIcon(empty);  
      }
      else if(b7.getIcon()==empty){  
            b7.setIcon(i1);  
            b8.setIcon(empty);  
        }
      else if(b9.getIcon()==empty){
        b9.setIcon(i1);
        b8.setIcon(empty);
        }
    }
   
    if(e.getSource()==b9){ 
        //counting moves
         m=m+1;  
         moves=new Integer(m).toString();
         text.setText(moves);
         
        Icon i1=b9.getIcon();  
      if(b6.getIcon()==empty){  
        b6.setIcon(i1);  
        b9.setIcon(empty);  
      }
      else if(b8.getIcon()==empty){  
            b8.setIcon(i1);  
            b9.setIcon(empty);  
        }
    }
    
   
    
    //completion condition
    try{
        if(b1.getIcon().equals(img1)&&b2.getIcon().equals(img2)&&b3.getIcon().equals(img3)&&
           b4.getIcon().equals(img4)&&b5.getIcon().equals(img5)&&b6.getIcon().equals(img6)&&
           b7.getIcon().equals(img7)&&b8.getIcon().equals(img8)&&b9.getText().equals(""))
        {
             b9.setIcon(img9);
             JOptionPane.showMessageDialog(null,"Level Complete!");
        
        }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    
    // reset button
    if(e.getSource()==reset){
         
        b1.setIcon(img1);  
        b1.setBounds(50,150,80,80);
    
        b2.setIcon(img5);  
        b2.setBounds(130,150,80,80); 
    
        b3.setIcon(img8);  
        b3.setBounds(210,150,80,80); 
    
        b4.setIcon(img3);  
        b4.setBounds(50,230,80,80);  
   
        b5.setIcon(img7);  
        b5.setBounds(130,230,80,80);  
    
        b6.setIcon(img2);  
        b6.setBounds(210,230,80,80);  
    
        b7.setIcon(img4);  
        b7.setBounds(50,310,80,80); 
    
        b8.setIcon(img6);  
        b8.setBounds(130,310,80,80); 
    
        b9.setIcon(empty);  
        b9.setBounds(210,310,80,80);
        
        m=0;
        moves=new Integer(m).toString();
        text.setText(moves);
        }
    
    //quit button
    if(e.getSource()==quit){
        this.dispose();
    }
    
}





    public static void main(String[] args) {
        // TODO code application logic here
        frame obj=new frame();
}   
    
    
}
