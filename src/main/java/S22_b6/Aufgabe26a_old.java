package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aufgabe26a_old extends JPanel implements MouseListener,MouseMotionListener{
    boolean isChecked = false;
    Point point = null;

    public Aufgabe26a_old(){
        //super("KreisFrame");
        JCheckBox cb = new JCheckBox();

        //checkbox
        cb.addItemListener(itemEvent -> {
            if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                System.out.println("checked");
                isChecked = true;
            }else{
                System.out.println("unchecked");
                isChecked = false;
            }
        });

        //Draw when mouse is clicked && isChecked = true


        //add components and create window
        addMouseListener(this);
        add(cb, BorderLayout.NORTH);
        setSize(300, 300);
        setVisible(true);
        //setDefaultCloseOperation(3);
    }


    public static void main(String[] args) {
        new Aufgabe26a_old();
    }

    public void drawCircle(int x, int y){
        Graphics g = this.getGraphics();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed x:" + e.getX() + " y:" + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getPoint().toString());
    }
}
