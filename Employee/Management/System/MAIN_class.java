package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MAIN_class extends JFrame  {

    MAIN_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1160,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(400,155,400,40);
        heading.setFont(new Font("Times New Roman",Font.BOLD,25));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLUE);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new AddEmployee();
            setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.GREEN);
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new View_Employee();
            setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.RED);
        rem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        img.add(rem);


        setSize(1160,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }



    public static void main(String[] args) {
       new MAIN_class();
    }

}
