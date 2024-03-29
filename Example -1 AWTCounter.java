/**
 * 
 */
package main;

/**
 * @author jeffrey
 *
 */
import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame {

	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounter() {
		setLayout (new FlowLayout());
		
		lblCount = new Label("Counter");
		add(lblCount);
	
		tfCount = new TextField(count + "",10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		BtnCountListener listener = new BtnCountListener();
		btnCount.addActionListener(listener);
		
		setTitle("AWT Counter");
		setSize(300, 100);
		
		setVisible(true);
	}
	     
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 AWTCounter app = new AWTCounter();

	}
	
	private class BtnCountListener implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {
			++count;
			
			tfCount.setText(count + "");

		}
	}
	

}
