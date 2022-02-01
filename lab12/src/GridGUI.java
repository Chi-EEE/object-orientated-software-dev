import javax.swing.*;
import java.awt.*;

public class GridGUI extends JFrame {
    public GridGUI() {
        super("Align");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JCheckBox SnapToGridCheckbox = new JCheckBox("Snap To Grid");
        JCheckBox ShowGridCheckbox = new JCheckBox("Show Grid");

        JLabel XLabel = new JLabel("X:");
        JLabel YLabel = new JLabel("Y:");

        XLabel.setForeground(new Color(99, 101, 156));
        YLabel.setForeground(new Color(99, 101, 156));

        JTextField XTextField = new JTextField(1);
        JTextField YTextField = new JTextField(1);

        JButton OkButton = new JButton("Ok");
        JButton CancelButton = new JButton("Cancel");
        JButton HelpButton = new JButton("Help");

        OkButton.setSize(145,50);
        CancelButton.setSize(145,50);
        HelpButton.setSize(145,50);

        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(SnapToGridCheckbox)
                        .addComponent(ShowGridCheckbox));
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(XLabel)
                .addComponent(YLabel));
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(XTextField)
                .addComponent(YTextField));
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(OkButton)
                .addComponent(CancelButton)
                .addComponent(HelpButton));

        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(SnapToGridCheckbox)
                .addComponent(XLabel)
                .addComponent(XTextField)
                .addComponent(OkButton));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ShowGridCheckbox)
                        .addComponent(YLabel)
                        .addComponent(YTextField)
                        .addComponent(CancelButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(OkButton)
                        .addComponent(CancelButton)
                        .addComponent(HelpButton))
        );


        layout.setHorizontalGroup(hGroup);
        layout.setVerticalGroup(vGroup);
    }
}
