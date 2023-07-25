import javax.swing.*;
import java.awt.*;


public class Hacked {

    JButton submit;

    JLabel label;
    JLabel label2;
    JLabel label3;
    JPanel field;
    JPanel field2;
    JFrame frame;

    /*
    *Declaring more components for this specific class
    * WARNING!!!
    * This application was made to practice on GUI development using swing
    * I utilized JavaFX in the past , so I decided to also learn swing
     */

    Hacked(){
        ImageIcon icon = new ImageIcon("images\\hacker.png");
        ImageIcon imageIcon = new ImageIcon("images\\hack.png");//Same icons as before

        submit = new JButton("Join");
        submit.setFocusable(false);
        submit.setBounds(275,600,250,100);
        submit.setFont(new Font("Cooper",Font.PLAIN,30));
        submit.setIcon(imageIcon);
        submit.setForeground(Color.GREEN);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(e -> new Accepted());
        submit.addActionListener(e -> frame.dispose());//Different way instead of implementing ActionListener

        /*
        *Same button customization except here the lambdas were put to use
        * It's the same as am action performed method
        * Just for functionality
        * In this class many panels were used
        * So I utilized panels in order to store the labels
         */

        label = new JLabel();//Label Title
        label.setText("Welcome to our organization");
        label.setBounds(250,20,400,400);
        label.setFont(new Font("Cooper",Font.PLAIN,25));
        label.setForeground(Color.GREEN);

        /*
        *Label title is customized to look like dark net
        * Almost the whole application looks like dark net
        * Except for the mother class
         */

        label2 = new JLabel();
        label2.setText("We prompt you to join us");
        label2.setBounds(250,20,400,400);
        label2.setFont(new Font("Cooper",Font.PLAIN,25));
        label2.setForeground(Color.GREEN);

        label3 = new JLabel();
        label3.setText("Click the button to join");
        label3.setBounds(250,20,400,400);
        label3.setFont(new Font("Cooper",Font.PLAIN,25));
        label3.setForeground(Color.GREEN);

        field = new JPanel();
        field.setFocusable(false);
        field.setBounds(230,350,350,100);
        field.setFont(new Font("Cooper",Font.PLAIN,25));
        field.setForeground(Color.GREEN);
        field.setBackground(Color.BLACK);
        field.add(label2);

        field2 = new JPanel();
        field2.setFocusable(false);
        field2.setBounds(230,500,350,100);
        field2.setFont(new Font("Cooper",Font.PLAIN,25));
        field2.setForeground(Color.GREEN);
        field2.setBackground(Color.BLACK);
        field2.add(label3);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
        frame.setTitle("Anonymous");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setSize(new Dimension(800,800));
        frame.add(submit);
        frame.add(label);
        frame.add(field);
        frame.add(field2);
        frame.setVisible(true);
    }

}
