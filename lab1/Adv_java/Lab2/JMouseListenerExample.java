// WAP to illustrate the folllowing Mouse Event Handling.

//1. When the user presses the  mouse, "User has pressesd the mouse".


import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

	public class JMouseListenerExample
		{
			Label lbel1, lbel2;
			Frame frme;
			String str;
			public JMouseListenerExample()
				{
					frme = new Frame("Java mouse Listner Example");
					lbel1 = new Label("Demo for the mouse event", Label.CENTER);
					lbel2 = new Label();
					frme.setLayout(new FlowLayout());
					frme.add(lbel1);
					frme.add(lbel2);
					
					
					frme.setSize(350,220);
					frme.setVisible(true);
					
				}
	public void mouseClicked(MouseEvent ev)
		{
			str+="then, the mouse button is clicked";	
			lbel2.setText(str);
			frme.setVisible(true);
		}
	
	public void mouseExited(MouseEvent ev)
		{
			lbel2.setText("Mouse has left the area of window");
			frme.setVisible(true);
		}

	public void mouseReleased(MouseEvent ev)
		{
			str="Firstly, the mouse button is released and";
			lbel2.setText(str);
			frme.setVisible(true);
		}
	
	public static void main(String args[])
	{
		new JMouseListenerExample();
	}
}

