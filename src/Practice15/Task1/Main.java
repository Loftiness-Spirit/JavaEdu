package Practice15.Task1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main extends JFrame{

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add themup");
    JButton button1 = new JButton(" Multiply themup");
    JButton button2 = new JButton(" Subtract themup");
    JButton button3 = new JButton(" Divide themup");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Main(){
        super("Task1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250,250);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " +(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " +(x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " +(x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " +(x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args){
        new Main();
    }
}