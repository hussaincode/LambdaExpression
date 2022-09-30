package work;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {

        //window:object JFrame
        JFrame jFrame=new JFrame("My Window");
        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());


        //create button
        JButton jButton=new JButton("click me!");
        jButton.addActionListener((ActionEvent e) ->{
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"button clicked");
        });
        jFrame.add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
