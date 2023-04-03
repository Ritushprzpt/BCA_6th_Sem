// WAP to illustrate the folllowing Mouse Event Handling.

//1. When the user presses the  mouse, "User has pressesd the mouse".


import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

	public class JMouseListenerExample
		{
             JFrame frame = new JFrame("KEY EVENT HANDLER");

        JLabel lbl1 = new JLabel("Enter First Number: ");
        JLabel lbl2 = new JLabel("Enter Second Number: ");
        JLabel result = new JLabel();

        JTextArea num1 = new JTextArea();
        JTextArea num2 = new JTextArea();

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
}

