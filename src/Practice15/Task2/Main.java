package Practice15.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    String[] items = {
            "Первый",
            "Второй",
            "Третий"
    };

    JLabel jLabel = new JLabel(items[0], JLabel.CENTER);
    JComboBox comboBox = new JComboBox(items);
    JPanel jPanel = new JPanel();
    Main(){
        super("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,150);
        add(jPanel);
        jPanel.setBackground(Color.GRAY);
        jPanel.setPreferredSize(new Dimension(200,300));
        jPanel.add(jLabel);
        jPanel.add(comboBox);
        comboBox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jLabel.setText((String) comboBox.getSelectedItem());
            }
        });
        setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}
