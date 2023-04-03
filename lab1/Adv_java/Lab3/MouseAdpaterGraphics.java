import java.awt.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class MouseAdpaterGraphics extends MouseAdapter{
    Frame f;
    MouseAdpaterGraphics(){
        f = new Frame("mouse Adapter");
        f.addMouseListener(this);
        f.setSize(330,300);
        f.setLayout(null);
        f.setVisible(true); 
    } 
    public void mouseClicked(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    } 
    public static void main(String[] args) {
        new MouseAdpaterGraphics();
    }
}