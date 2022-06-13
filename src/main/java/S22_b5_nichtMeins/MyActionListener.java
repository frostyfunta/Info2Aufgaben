package S22_b5_nichtMeins;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;


public class MyActionListener implements ActionListener {
		
		JTextArea s;
		
		public MyActionListener(JTextArea s) {
			this.s = s;
		}
		
		public void actionPerformed(ActionEvent e) {
			s.append(e.getActionCommand() + "\n");	
		}
}

