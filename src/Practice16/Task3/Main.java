package Practice16.Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main extends JFrame
{
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile = {{"Файл",  "Ф"}, {"Сохранить", "S"}, {"Выйти", ""}};
    private  final  String[][]  menuEdit = {{"Правка", "П"}, {"Копировать", "C"}, {"Вырезать", "X"}, {"Вставить", "V"}};
    private  final  String[][]  menuHelp = {{"Cправка", "С"}, {"Просмотреть справку", ""}, {"О программе", ""}};
    private  final  String[][]  menuColor = {{"Цвет", "Ц"}, {"Синий", ""}, {"Красный", ""}, {"Черный", ""}};
    private  final  String[][]  menuFont = {{"Шрифт", "Ш"}, {"Times New Roman", ""}, {"MS Sans Serif", ""}, {"Courier New", ""}};
    JButton button = new JButton("Load");
    JButton button1 = new JButton("Clear");
    JTextField jta = new JTextField(25);


    private JMenu createMenuItems(final String[][] items)
    {
        JMenu menu = new JMenu(items[0][0]);

        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++)
        {

            JMenuItem item = new JMenuItem(items[i][0]);
            if(items[i][0]=="Выйти")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
            else if(items[i][0]=="Просмотреть справку")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            Desktop.getDesktop().browse(new URL("https://youtu.be/M3e56jPPTyQ").toURI());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            else if(items[i][0]=="О программе")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            Desktop.getDesktop().browse(new URL("https://stackoverflow.com/questions/10967451/open-a-link-in-browser-with-java-button").toURI());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            else if (items[i][0]=="Копировать")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jta.copy();
                    }
                });
            else if (items[i][0]=="Вырезать")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jta.cut();
                    }
                });
            else if (items[i][0]=="Вставить")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jta.paste();
                    }
                });
            else if (items[i][0]=="Сохранить")
                item.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String textFieldVal = jta.getText();
                        PrintWriter writer = null;
                        try {
                            writer = new PrintWriter("textFieldOutput.txt", "UTF-8");
                        } catch (FileNotFoundException ex) {
                            throw new RuntimeException(ex);
                        } catch (UnsupportedEncodingException ex) {
                            throw new RuntimeException(ex);
                        }
                        writer.println(textFieldVal);
                        writer.close();
                    }
                });

            else if (items[i][0]=="Синий")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setForeground(Color.BLUE);
                    }
                });
            else if (items[i][0]=="Красный")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setForeground(Color.RED);
                    }
                });
            else if (items[i][0]=="Черный")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setForeground(Color.BLACK);
                    }
                });

            else if (items[i][0]=="Times New Roman")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                    }
                });
            else if (items[i][0]=="MS Sans Serif")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                    }
                });
            else if (items[i][0]=="Courier New")
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jta.setFont(new Font("Courier New", Font.PLAIN, 20));
                    }
                });

            if (items[i][1]!="")
                item.setAccelerator(KeyStroke.getKeyStroke(items[i][1].charAt(0), KeyEvent.CTRL_MASK));

            menu.add(item);
        }
        return menu;
    }

    public Main() {
        super("Hello Swing");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new FlowLayout());
        setSize(250,250);
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createMenuItems(menuFile));
        menuBar.add(createMenuItems(menuEdit));
        menuBar.add(createMenuItems(menuHelp));
        menuBar.add(createMenuItems(menuColor));
        menuBar.add(createMenuItems(menuFont));
        jta.setFont(new Font("Courier New", Font.PLAIN, 25));
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String content = Files.readString(Paths.get("textFieldOutput.txt"));
                    jta.setText(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
            }
        });
        add(jta);
        menuBar.add(Box.createHorizontalGlue());



        setJMenuBar(menuBar);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args)
    {
       new Main();
    }
}