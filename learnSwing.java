import javax.swing.*;
import java.awt.event.*;

public class learnSwing {
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        JButton b=new JButton("Click here");
        final JTextField tf=new JTextField();
        tf.setBounds(100,100,200,20);
        b.setBounds(150, 150, 150, 30);
        f.add(b);f.add(tf);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hello World");
            }
        });
        JLabel l1=new JLabel();
        l1.setText("Enter your name:");
        l1.setBounds(100,50,150,30);
        f.add(l1);
        JLabel l2=new JLabel("hey");
        l2.setBounds(10,180,150,30);
        f.add(l2);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}
