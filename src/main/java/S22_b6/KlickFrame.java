package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class KlickFrame extends JFrame {
    public KlickFrame(){
        super("KlickFrame");
        setSize(500,100);
        setDefaultCloseOperation(3);
        setVisible(true);
        add(new numberFrame());
    }

    public static void main(String[] args) {
        new KlickFrame();
    }
}

class numberFrame extends JPanel implements MouseListener {
    ArrayList<Point> numbers = new ArrayList<>();

    public numberFrame(){
        this.addMouseListener(this);
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < numbers.size(); i++){
            g.drawString("" + (i), numbers.get(i).x, numbers.get(i).y);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        numbers.add(new Point(e.getX(),e.getY()));
        repaint();
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
}
