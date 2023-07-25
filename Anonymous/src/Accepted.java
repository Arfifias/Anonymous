import javax.swing.*;
import java.awt.*;

public class Accepted extends JFrame {

    JLabel text;
    Accepted(){

        ImageIcon icon = new ImageIcon("images\\hacker.png");//Same icon used in the whole application

        /*
        *This class show us the final window that someone joined
        * It just confirms that the request was accepted
        * The old traditional way of coding is the actual fun way so please enjoy
         */

        text = new JLabel();
        text.setText("Request Accepted");
        text.setBounds(300,200,400,400);
        text.setFont(new Font("Cooper",Font.PLAIN,25));
        text.setForeground(Color.GREEN);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.setTitle("Anonymous");
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0,0,0));
        this.setSize(new Dimension(800,800));
        this.add(text);
        this.setVisible(true);
    }
}
