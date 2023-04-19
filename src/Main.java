import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//1 Create a frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(300,300);

//2 Create a panel
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(3,3));






        myPanel.setBackground(Color.WHITE);

//3 Add components to the panel
        JButton button = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        myPanel.add(button);
        myPanel.add(button2);
        myPanel.add(button3);
        myPanel.add(button4);
        myPanel.add(button5);
        myPanel.add(button6);
        myPanel.add(button7);
        myPanel.add(button8);
        myPanel.add(button9);



//4 Add the panel to the frame
        myFrame.add(myPanel);

//5 Display the frame
        myFrame.setVisible(true);

    }
}