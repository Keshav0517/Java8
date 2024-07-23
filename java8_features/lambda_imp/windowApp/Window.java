package java8_features.lambda_imp.windowApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window {
    public static void main(String[] args) {
        //Create JFrame object
        JFrame frame=new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        //Create Button
        JButton button=new JButton("Click Me");



//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Done");
//                JOptionPane.showMessageDialog(null,"Clicked Success..");
//            }
//        });

        //Lambda
        button.addActionListener((ActionEvent e)->{
            System.out.println("Button Clicked..");
            JOptionPane.showMessageDialog(null,"Click success..");
        });

        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
