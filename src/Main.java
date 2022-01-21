import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

        JButton ElectPOTUS = new JButton("Run For POTUS");
        ElectPOTUS.setBounds(100, 50, 365,75);
        ElectPOTUS.setLocation(200,100);
        ElectPOTUS.setBorder(BorderFactory.createLineBorder(Color.red,2));
        ElectPOTUS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //continue to game
            }
        });
        ElectPOTUS.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ElectPOTUS.setBorder(BorderFactory.createLineBorder(Color.cyan,3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ElectPOTUS.setBorder(BorderFactory.createLineBorder(Color.red,2));
            }
        });
        frame.add(ElectPOTUS);


        //Dimension minSize = new Dimension(1100,600);
        //frame.setMinimumSize(minSize);
        frame.setLayout(null);
        frame.setSize(1100,600);
        frame.setVisible(true);
    }
}


public class Main {
    public static void main(String[] args){
        new MainMenu();
    }
}
