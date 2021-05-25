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


public class MouseMotionDemo extends Frame {
	
    private TextField tfMouseClickX;
    private TextField tfMouseClickY;
   
    private TextField tfMousePositionX; 
    private TextField tfMousePositionY;
    
    
    public MouseMotionDemo() {
    	setLayout(new FlowLayout());
    	
    	add(new Label("X- Click:"));
    	tfMouseClickX = new TextField(10);
		tfMouseClickX.setEditable(false);
    	add(tfMouseClickX);
    	add(new Label("Y-Click:"));
    	tfMouseClickY = new TextField(10);
    	tfMouseClickY.setEditable(false);
    	add(tfMouseClickY);
    	
    	add(new Label("X-Position:"));
    	tfMousePositionX = new TextField(10);
    	tfMousePositionX.setEditable(false);
    	add(tfMousePositionX);
    	tfMousePositionY = new TextField(10);
    	tfMousePositionY.setEditable(false);
    	add(tfMousePositionY);
    	
    	
    	setTitle("MouseMotion Demo");
    	setSize(400,120);
    	setVisible(true);
    	
    }
    
	public static void main(String[] args) {
        new MouseMotionDemo();
        

	}

}
