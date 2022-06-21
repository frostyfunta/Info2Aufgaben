package S22_b6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Aufgabe26a extends JFrame implements MouseListener {
    boolean isChecked = false;
    public Aufgabe26a(){
        super("KreisFrame");
        JCheckBox cb = new JCheckBox();
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("checked");
                    isChecked = true;
                }else{
                    System.out.println("unchecked");
                    isChecked = false;
                }
            }
        });

        add(cb, BorderLayout.NORTH);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Aufgabe26a();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }
}
