package Practice5.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int milan=0;
    static int madrid=0;
    public static void main(String[] args) {

        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        JLabel label1= new JLabel("Result: 0 X 0");
        JLabel label2= new JLabel("Last Scorer: N/A");
        JLabel label3= new JLabel("Winner: DRAW");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        ActionListener action1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                label1.setText("Result: "+milan+" X "+madrid);
                label2.setText("Last Scorer: AC Milan");
                if(milan>madrid)
                    label3.setText("Winner: AC Milan");
                else if(milan==madrid)
                    label3.setText("Winner: DRAW");
            }
        };
        ActionListener action2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                label1.setText("Result: "+milan+" X "+madrid);
                label2.setText("Last Scorer: Real Madrid");
                if(milan<madrid)
                    label3.setText("Winner: Real Madrid");
                else if(milan==madrid)
                    label3.setText("Winner: DRAW");
            }
        };
        button1.addActionListener(action1);
        button2.addActionListener(action2);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
