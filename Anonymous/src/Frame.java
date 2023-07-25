import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    JPanel panel;
    /*
    *Declaring components
    * They are needed to be added the GUI application
    * By pressing the button you can switch windows
     */
    Frame(){
        ImageIcon icon = new ImageIcon("images\\hacker.png");//Icon path
        ImageIcon icon2 = new ImageIcon("images\\hack.png");//Button icon path

        button = new JButton("Anonymous");//Button text
        button.setFocusable(false);//Removing line perimeter to be more interactive
        button.setBounds(280,400,250,100);//Position and size
        button.setFont(new Font("Cooper",Font.PLAIN,30));//Font editing
        button.setIcon(icon2);//Inserting button icon
        button.setForeground(Color.GREEN);//Text Color
        button.setBackground(Color.BLACK);//Background Color
        button.addActionListener(this);//Giving the button a functionality

        /*
        *Button Customization
        * Also adding the icon to the button
        * Additionally the button is made this way to reminiscent a hacker
        * This could be done in SceneBuilder by utilizing JavaFX but there is also swing
         */

        label = new JLabel("Anonymous");//Label text
        label.setFont(new Font("Cooper",Font.PLAIN,50));//Label Font
        label.setForeground(Color.BLACK);//Label text color

        panel = new JPanel();//Title container
        panel.setBounds(0,0,800,150);//Position and size of the container
        panel.setBackground(Color.GREEN);//Background color of the container
        panel.add(label);//Adding the label to the containers

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Terminating program by exiting of the GUI
        this.setIconImage(icon.getImage());//Adding icon to the GUI
        this.setTitle("Anonymous");//GUI title
        this.setLayout(null);//A layout is not necessary because I customized it
        this.setResizable(false);//Cannot resize GUI
        this.getContentPane().setBackground(new Color(0,0,0));//GUI background color
        this.setSize(new Dimension(800,800));//Dimensions and size
        this.add(panel);
        this.add(button);
        /*
        *Adding the components to the frame
        * In this way they are visible by the user
         */
        this.setVisible(true);//Making the GUI visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            this.dispose();//By pressing the button the first window closes
             new Hacked();//Switching windows
        }

    }
}
