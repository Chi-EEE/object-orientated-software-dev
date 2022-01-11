package lab10;

/**
 * @author C00261172 Huu Chi Huynh
 * @date 11/01/2022
 * @summary
 * This program creates five buttons that change the color of the background of its window
 */

import javax.swing.JFrame;

public class ChangeColourDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(200, 200);
		changeColour.setVisible(true);

	}//end main

}//end class
