package Practice12.Third;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class Animation extends JFrame {
    private JLabel picture = null;
    Animation(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(null);
        picture = new JLabel();
        picture.setBounds(40, 20, 500, 300);
        new Timer(1000, new ActionListener() {
            int counter = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = (counter + 1) % 2;
                String [] pictures = new String[]{"C:\\Users\\Антон\\Desktop\\JavaPracticesR\\src\\Practice12\\Second\\Image\\photo.jpg", "C:\\Users\\Антон\\Desktop\\JavaPracticesR\\src\\Practice12\\Second\\Image\\photo2.jpg"};
                String path = pictures[counter];
                File check = new File(path);
                ImageIcon icon = new ImageIcon(check.getPath());
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finish = new ImageIcon(imgScale);
                picture.setIcon(finish);
                repaint();
            }
        }).start();
        add(picture);
        setVisible(true);
    }
}