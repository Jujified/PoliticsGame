import javax.swing.*;
import java.awt.*;

class MainMenu {

    public String name = "Political Game";

    MainMenu(){
        JFrame frame = new JFrame(name);

        JLabel title = new JLabel(name);
        title.setBounds(100, 50, 365,75);
        title.setLocation(200,0);
        title.setVisible(true);
        title.setFont(new Font("Calibri", Font.BOLD, 50));
        frame.add(title);

        JLabel title2 = new JLabel("Choose Mode:");
        title2.setBounds(100, 50, 365,75);
        title2.setLocation(200,50);
        title2.setVisible(true);
        title2.setFont(new Font("Calibri", Font.BOLD, 25));
        frame.add(title2);

        //Dimension minSize = new Dimension(1100,600);
        //frame.setMinimumSize(minSize);
        frame.setLayout(null);
        frame.setSize(1100,600);
        frame.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args){
        MainMenu mm = new MainMenu();
    }
}
