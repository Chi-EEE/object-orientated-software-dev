/**
 * @author C00261172 Huu Chi Huynh
 * @date 25/01/2022
 * @summary
 * This program
 */
package c00261172.converttemp;//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {

	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();

	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field

        fahrenField.addActionListener(new FahrenheitListener(fahrenField, celsiusField));
        celsiusField.addActionListener(new CelsiusListener(celsiusField, fahrenField));

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor


	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

    /**
     * Super class for the temperature listeners
     */
        class TemperatureListener implements ActionListener {
            JTextField thisField;
            JTextField otherField;

            TemperatureListener(JTextField thisField, JTextField otherField) {
                this.thisField = thisField;
                this.otherField = otherField;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        }
        public class FahrenheitListener extends TemperatureListener {

            public FahrenheitListener(JTextField thisField, JTextField otherField) {
                super(thisField, otherField);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temp = Double.parseDouble(thisField.getText());
                    otherField.setText(String.valueOf((temp - 32) / 1.8)); // Convert temperature into celsius
                } catch (Exception ex) {
                    otherField.setText("Unable to parse string. Please input numbers only.");
                }
            }
        }
    public class CelsiusListener extends TemperatureListener {

        public CelsiusListener(JTextField thisField, JTextField otherField) {
            super(thisField, otherField);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double temp = Double.parseDouble(thisField.getText());
                otherField.setText(String.valueOf((temp * 1.8) + 32)); // Convert temperature into fahrenheit
            } catch (Exception ex) {
                otherField.setText("Unable to parse string. Please input numbers only.");
            }
        }
    }


}//end class
