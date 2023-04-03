import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventHandling  implements MouseListener{
    Label lbl1, lbl2;
    Frame fr;
    String s;
    MouseEventHandling()
    {
        fr = new Frame("Java mouse listener Example");
        lbl1 = new Label();
        lbl2 = new Label();
        fr.setLayout(new FlowLayout());
        fr.add(lbl1);
        fr.add(lbl2);

        fr.addMouseListener(this);
        fr.setSize(350,220);
        fr.setVisible(true);


    }
    public void mouseClicked(MouseEvent e){
        s+="then, the mouse button is clicked";
        lbl2.setText(s);
        fr.setVisible(true);
    }

    public void mouseEntered(MouseEvent ev){
        lbl2.setText("Now, the mouse has entered the area of window");
        fr.setVisible(true);
    }

    public void mouseExited(MouseEvent ev){
        lbl2.setText("Mouse has left the area");
        fr.setVisible(true);
    }

    public void mousePressed(MouseEvent ev){
        lbl2.setText("Mouse button is pressed");
        fr.setVisible(true);
    }

    public void mouseReleased(MouseEvent ev){
        s="Mouse button has released and";
        lbl2.setText(s);
        fr.setVisible(true);
    }

    public static void main (String args[]){
        new MouseEventHandling();
    }
}