import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  
public class PanelExample{  

    PanelExample(){  
        JFrame frame = new JFrame("Basic calculation");

        JLabel lbl1 = new JLabel("Enter First Number: ");
        JLabel lbl2 = new JLabel("Enter Second Number: ");
        JLabel result = new JLabel();

        JTextArea num1 = new JTextArea();
        JTextArea num2 = new JTextArea();

        JButton formul = new JButton("Multiplication");

        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(num1);
        frame.add(num2);
        frame.add(formul);
        frame.add(result);

        lbl1.setBounds(10, 10, 100, 20);
        lbl2.setBounds(230, 10, 100, 20);
        num1.setBounds(120, 10, 100, 20);
        num2.setBounds(340, 10, 100, 20);
        formul.setBounds(250, 40, 100, 20);
        result.setBounds(10, 60, 100, 20);

        formul.addActionListener(new ActionListener(){      
            public void actionPerformed(ActionEvent e) {  
                String str1 = num1.getText();  
                String str2 = num2.getText();  
                int in1 = Integer.parseInt(str1);  
                int in2 = Integer.parseInt(str2);  
                int in3 = 0;  
            
                in3=in1*in2;  
            
                String mult=String.valueOf(in3);  
                result.setText("Product = "+mult);
                } 
        } ) ;
        
        frame.setSize(800,800);    
        frame.setLayout(null);    
        frame.setVisible(true);    

        
    }
    public static void main(String args[])  
    {  
        new PanelExample();  
    }  
}