package S22_b5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.sql.Timestamp;

public class Aufgabe23 extends JFrame{

    JTextArea txt;

    public static void main(String[] args) {
        new Aufgabe23();


    }

    Aufgabe23(){
        super("Aufgabe23");
        txt = new JTextArea(50, 5);
        setSize(500,500);
        JScrollPane scroll = new JScrollPane(txt);
        scroll.setEnabled(false);
        addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent windowEvent) {
                Timestamp ts = new Timestamp(System.currentTimeMillis());
                txt.append(windowEvent.getNewState() + ts.toString());

            }
        });
        add(scroll);
        setVisible(true);
    }
}
