package Practice12.First;
import javax.swing.*;

public class Tester {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameTemplate frame1 = new JFrameTemplate();
            }
        });
    }
}