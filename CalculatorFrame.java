import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculatorFrame implements ActionListener
{
   JFrame f1;
   JLabel L1,L2,L3;
   JButton add1,sub,mul,div,reset;
   JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
   JTextField T1,T2,T3;
   CalculatorFrame()
   {
      
      f1 = new JFrame("Calculator");
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setLayout(null);
      L1 = new JLabel("Enter No 1 : ");
      L2 = new JLabel("Enter No 2 : ");
      L3 = new JLabel("Result : ");
      add1 = new JButton("ADD");
      sub = new JButton("SUB");
      mul = new JButton("MUL");
      div = new JButton("DIV");
      b0 = new JButton("0");
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
     
      reset = new JButton("Reset");
      T1 = new JTextField();
      T2 = new JTextField();
      T3 = new JTextField(); 

      L1.setBounds(70,50,100,30);
      T1.setBounds(190,50,150,30);
      L2.setBounds(70,120,100,30);
      T2.setBounds(190,120,150,30);
      L3.setBounds(70,190,100,30);
      T3.setBounds(190,190,100,30);
      add1.setBounds(65,260,80,50);
      sub.setBounds(160,260,80,50);
      mul.setBounds(255,260,80,50);
      div.setBounds(350,260,80,50);
      b0.setBounds(65,330,80,50);
      b1.setBounds(160,330,80,50);
      b2.setBounds(255,330,80,50);
      b3.setBounds(350,330,80,50);
      b4.setBounds(65,400,80,50);
      b5.setBounds(160,400,80,50);
      b6.setBounds(255,400,80,50);
      b7.setBounds(350,400,80,50);
      b8.setBounds(65,470,80,50);
      b9.setBounds(160,470,80,50);     
      reset.setBounds(255,470,175,50);

      f1.add(L1);
      f1.add(T1);
      f1.add(L2);
      f1.add(T2);
      f1.add(L3);
      f1.add(T3);
      f1.add(add1);
      f1.add(sub);
      f1.add(mul);
      f1.add(div);
      f1.add(b0);
      f1.add(b1);
      f1.add(b2);
      f1.add(b3);
      f1.add(b4);
      f1.add(b5);
      f1.add(b6);
      f1.add(b7);
      f1.add(b8);
      f1.add(b9);
      f1.add(reset);

      add1.addActionListener(this);
      sub.addActionListener(this);
      mul.addActionListener(this);
      div.addActionListener(this);
      reset.addActionListener(this);
      b0.addActionListener(this);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
  
      f1.setSize(500,700);
      f1.setVisible(true);
    
   }
   public static void main(String args[])
   {
      CalculatorFrame obj1 = new CalculatorFrame();
      
   
   }

   public void actionPerformed(ActionEvent ae)
   {
      int a,b,c;
      String s = " ";
      if(ae.getSource()==add1)
      {
         s=T1.getText();
         a=Integer.parseInt(s);
         s=T2.getText();
         b=Integer.parseInt(s);
         c=a+b;
         L3.setText("Addition : ");
         T3.setText(""+c);
      }
      else if(ae.getSource()==sub)
      {
         s=T1.getText();
         a=Integer.parseInt(s);
         s=T2.getText();
         b=Integer.parseInt(s);
         c=a-b;
         L3.setText("Substraction : ");
         T3.setText(""+c);
      }
      else if(ae.getSource()==mul)
      {
         s=T1.getText();
         a=Integer.parseInt(s);
         s=T2.getText();
         b=Integer.parseInt(s);
         c=a*b;
         L3.setText("Multiplication : ");
         T3.setText(""+c);
      }
      else if(ae.getSource()==div)
      {
         s=T1.getText();
         a=Integer.parseInt(s);
         s=T2.getText();
         b=Integer.parseInt(s);
         c=a/b;
         L3.setText("Division : ");
         T3.setText(""+c);
      }
      else if(ae.getSource()==reset)
      {
         L3.setText("Result : ");
         T1.setText("");
         T2.setText("");
         T3.setText("");
      }
      else if(ae.getSource()==b0)
      {
         c = 0;
         
      }
   }
}