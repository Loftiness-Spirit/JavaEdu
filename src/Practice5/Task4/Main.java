package Practice5.Task4;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {

        frames.add(new ImageIcon("images\\1.jpg").getImage());
        frames.add(new ImageIcon("images\\2.jpg").getImage());
        frames.add(new ImageIcon("images\\3.jpg").getImage());
        frames.add(new ImageIcon("images\\4.jpg").getImage());
        frames.add(new ImageIcon("images\\5.jpg").getImage());
        frames.add(new ImageIcon("images\\6.jpg").getImage());
        frames.add(new ImageIcon("images\\7.jpg").getImage());
        frames.add(new ImageIcon("images\\8.jpg").getImage());
        frames.add(new ImageIcon("images\\9.jpg").getImage());

        Animation animImg = new Animation();
        while (true)
        {
            for (int i = 0; i < 9; i++)
            {
                image = frames.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(60);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }
    }
}
