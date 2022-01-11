package lab10;
//Displays a frame containing two buttons. Pressing the
//"Lighter" button lightens the background of the frame.
//Pressing the "Darker" button darkens the background.

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColour extends JFrame{

		public ChangeColour(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // Add "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // Add "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);

			// Add "Green" button to frame and attach listener
			b = new JButton("Green");
			add(b);
			b.addActionListener(listener);;

			// Add "Blue" button to frame and attach listener
			b = new JButton("Blue");
			add(b);
			b.addActionListener(listener);

			// Add "Red" button to frame and attach listener
			b = new JButton("Red");
			add(b);
			b.addActionListener(listener);

		    // Attach window listener
		    addWindowListener(new WindowCloser());
		}//end constructor
		
		// Listener for both buttons
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				Color currentBackground =  getContentPane().getBackground();
		 		String buttonLabel = evt.getActionCommand();
	
		 		// Test label on button and change background colour
				switch (buttonLabel) {
					case "Lighter":
						getContentPane().setBackground(currentBackground.brighter());
						break;
					case "Darker":
						getContentPane().setBackground(currentBackground.darker());
						break;
					case "Green":
						getContentPane().setBackground(new Color(0, 255, 0));
						break;
					case "Blue":
						getContentPane().setBackground(new Color(0, 0, 255));
						break;
					case "Red":
						getContentPane().setBackground(new Color(255, 0, 0));
						break;
				}
				}
		}

		// Listener for window
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}

}//end class

