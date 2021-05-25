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
import java.awt.event.*;

public class AWTCounter extends Frame {
	
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounter() {
		setLayout(new FlowLayout()); 
		add(new Label("Counter"));
		tfCount = new TextField ("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		
		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
		
		
		public static void main(String[] args) {
			new AWTCounter();
			
	

	}

}
