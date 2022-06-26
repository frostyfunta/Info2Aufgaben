package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Aufgabe26a extends JFrame {
    boolean isChecked = false;
    Aufgabe26a() {
        super("Aufgabe26a");
        //checkbox
        JCheckBox cb = new JCheckBox();
        cb.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("checked");
                isChecked = true;
            } else {
                System.out.println("unchecked");
                isChecked = false;
            }
        });

        //add components and create window
        setSize(300,300);
        add(new drawPanel());
        add(cb, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(3);


    }

    public static void main(String[] args) {
        new Aufgabe26a();
    }

}

class drawPanel extends JPanel implements MouseListener, MouseMotionListener {
    Point mousePosition;

    drawPanel() {
        Graphics g = this.getGraphics();
        addMouseListener(this);
    }

    public void mouseCircle(Graphics g, Point mouseCursor){
        
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse has been clicked");
        mouseCircle(this.getGraphics(), e.getPoint());
        repaint();
    }



    @Override
    public void mousePressed(MouseEvent e) {

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

    }
}

