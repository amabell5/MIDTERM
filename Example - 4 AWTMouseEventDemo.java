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

public class AWTMouseEventDemo {
	private TextField tfMouseX;
	private TextField tfMouseY;
	
	
	
	public static void main(String[] args) {
		new MouseEventDemo();
		
	
	
	public AWTMouseEventDemo() {
		 setLayout(new FlowLayout());
		 
		 add(new Label("X-Click: "));
		 
		 
		 tfMouseX = new TextField(10);
		 tfMouseX.setEditable(false);
		 add(tfMouseX);
		 
		 
		 add(new Label("Y- Click: "));
		 
		 
		 tfMouseY = new TextField(10);
		 tfMouseY.setEditable(false);
		 add(tfMouseY);
		 
		 
		 
		setTitle("MouseEvent Demo");
		setSize(350,100);
		setVisible(true);
		
		 		

	}

}
