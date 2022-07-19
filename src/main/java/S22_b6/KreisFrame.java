package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class KreisFrame extends JFrame {
    boolean isChecked = false;
    public KreisFrame() {
        super("Aufgabe26a");
        //checkbox
        JCheckBox cb = new JCheckBox();
        PaintPanel panel = new PaintPanel();
        cb.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("checked");
                isChecked = true;
                add(panel);
                revalidate();
                repaint();
            } else {
                System.out.println("unchecked");
                isChecked = false;
                remove(panel);
                revalidate();
                repaint();
            }
        });

        //add components and create window
        setSize(300,300);
        add(cb, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(3);


    }



    public static void main(String[] args) {
        new KreisFrame();
    }

}

class PaintPanel extends JPanel implements MouseListener, MouseMotionListener{
    private Point mousePressedPosition = new Point(-10, -10);
    private Point mouseActualPosition = new Point(-1,-1);

    public PaintPanel(){
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawString(new String ("("+ mouseActualPosition.x + "," +
                mouseActualPosition.y + ")") , mouseActualPosition.x,
                mouseActualPosition.y) ;
        g.drawOval(mousePressedPosition.x, mousePressedPosition.y, 10, 10);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mousePressedPosition.move(-10, -10);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mousePressedPosition.move(e.getX(),e.getY());
        mouseActualPosition.move(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseActualPosition.move(e.getX(), e.getY());
        repaint();
    }
}



