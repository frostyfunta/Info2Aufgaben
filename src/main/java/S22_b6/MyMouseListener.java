package S22_b6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("pressed x:" + mouseEvent.getX() + " y:" + mouseEvent.getY());

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        //do nothing
    }

}
