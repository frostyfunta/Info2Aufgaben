package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class LinienFrame extends JFrame {
    public LinienFrame(){
        super("LinienFrame");
        setSize(300,100);
        setDefaultCloseOperation(3);
        add(new LinePanel());
        setVisible(true);
    }

}
class LinePanel extends JPanel implements MouseMotionListener, MouseListener {
    private Point mouseClickedPos = new Point(-10, -10);
    private Point mouseDraggedPos = new Point(-10, -10);

    public LinePanel(){
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawLine(mouseClickedPos.x,mouseClickedPos.y,mouseDraggedPos.x,mouseDraggedPos.y);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseDraggedPos.move(e.getX(),e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClickedPos.move(e.getX(),e.getY());
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

    public static void main(String[] args) {
        new LinienFrame();
    }
}
