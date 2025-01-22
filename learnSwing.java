import javax.swing.JButton;
import javax.swing.JFrame;

public class learnSwing {
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        JButton b=new JButton("hey");
        b.setBounds(100, 100, 95, 30);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
