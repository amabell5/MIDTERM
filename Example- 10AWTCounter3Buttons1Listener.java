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

public class AWTCounter3Buttons1Listener extends Frame {
	private TextField tfCount;
	private Button btnCountUp, btnCountDown, btnReset;
	private int count = 0;
	
	
	public AWTCounter3Buttons1Listener() {
		setLayout(new FlowLayout());
		add(new Label("Counter"));
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCountUp = new Button("Coun Upt");
		add(btnCountUp);
		btnCountDown = new Button("Count Down");
		add(btnCountDown);
		btnReset = new Button("Reset");
		add(btnReset);
		
		
		setTitle("AWT Counter");
		setSize(400, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		 new AWTCounter3Buttons1Listener();
	}


	}


