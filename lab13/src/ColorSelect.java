import javax.swing.*;

public class ColorSelect extends JFrame{
    public ColorSelect() {
        setContentPane(mainPanel);
        setTitle("ColorSelect");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JCheckBox backgroundCheckBox;
    private JCheckBox foregroundCheckBox;
    private JButton okButton;
    private JButton cancelButton;
}
