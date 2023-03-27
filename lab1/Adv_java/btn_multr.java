import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class btn_multr implements ActionListener
{
	JTextField txt1 = new JTextField(); //create 1st text field for "1st"
	JTextField txt2 = new JTextField(); //create 2nd text field for "2nd"
	JTextField txt5 = new JTextField(); 
	JTextField txt6 = new JTextField();
	JLabel lb1 = new JLabel("Output: "); //create label for output
	JLabel lb6 = new JLabel("Output: ");
	public btn_multr()
	{
		JFrame jfrm = new JFrame("This is simple JFrame for Calculation");
		jfrm.setSize(600,500); //600 width and 500 height
		jfrm.setLocationRelativeTo(null);
		jfrm.getContentPane().setLayout(null);
		jfrm.setVisible(true); //making the frame visible
	
		/* Create labels and text fields for each name, age, 1st number and second number accordingly */

		JLabel lb2 = new JLabel("Enter Number: "); //creating 1st label for "Enter Name"
		lb2.setBounds(30,12,150,10);
		jfrm.add(lb2);

		JTextField txt3 = new JTextField(); //creating 3rd text field for "Name"
		txt3.setBounds(100,10,150,20);
		jfrm.add(txt3);

		JLabel lb3 = new JLabel("Enter Roll no.: "); //creating 2nd label for "Roll Number"
		lb3.setBounds(300,12,150,10);
		jfrm.add(lb3);	

		JTextField txt4 = new JTextField(); //creating 4th text field for "Age"
		txt4.setBounds(370,10,150,20);
		jfrm.add(txt4);	
		
		JLabel lb4 = new JLabel("Enter 1st no.: "); //creating 3rd label for "Roll Number"
		lb4.setBounds(30,60,150,10);
		jfrm.add(lb4);

		txt5.setBounds(100,55,150,20); //creating dimensions specifications for text 5 and add to jframe
		jfrm.add(txt5);

		JLabel lbl5 = new JLabel("Enter 2nd No.: "); //create 5th label for "2nd number"
		lbl5.setBounds(300,60,80,10);

		txt6.setBounds(380,55,150,20); //creating dimensions specifications for text 6
		jfrm.add(txt6);


		JButton btn = new JButton("Multiply"); //create button with name "Multiply"
		btn.setBounds(200,300,100,30);
		jfrm.add(btn);

		btn.addActionListener(this); //register the button click as event trigger
					     //i.e. as we click the button it needs to 
					     //for required operation (in this case its)

		lb6.setBounds(30,350,200,20); //set the output label as Jlabel6 and set
		jfrm.add(lb6);

		}

	public void actionPerformed(ActionEvent e)  //perform multiplication as the event 
		{
			String num1 = txt1.getText().toString();  //take a number input from text 1
			String num2 = txt2.getText().toString();  //take a number input from text 2
			int first,second,product;  //we need the multiplication operation
						   //"text1 field and text2 fiield" should be
						   //before we apply the multiplication operation

			first = Integer.parseInt(num1);  //hence we the conversion from sting 
							 // is dont through "parseInt" function
			second = Integer.parseInt(num2);
			product = first * second;
			lb6.setText("Output: "+product);
		}

public static void main(String args[])
{
	new btn_multr();
}
}


