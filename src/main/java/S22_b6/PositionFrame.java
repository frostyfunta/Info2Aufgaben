package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PositionFrame extends JFrame implements MouseMotionListener {
    private Point mousePosition = new Point(0,0);

    public PositionFrame(){
        super("positionFrame");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mousePosition.move(e.getX(),e.getY());
        this.setTitle("" + mousePosition.getX() + ", " + mousePosition.getY());
    }

    public static void main(String[] args) {
        new PositionFrame();
    }
}
