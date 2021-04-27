package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new Panel());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
    }
}

class Panel extends JPanel {

    public Panel() {

        setPreferredSize(new Dimension(337, 520));



        add(new Number(),BorderLayout.CENTER);


        JButton plus = new JButton();
        JButton minus = new JButton();
        JButton multiplication = new JButton();
        JButton divide = new JButton();
        JButton point = new JButton();
        JButton equal = new JButton();



        plus.setBounds(240, 160, 80, 80);
        minus.setBounds(240, 240, 80, 80);
        multiplication.setBounds(0, 480, 80, 80);
        divide.setBounds(0, 480, 80, 80);
        point.setBounds(160, 400, 80, 80);
        equal.setBounds(240, 320, 80, 160);

        plus.setText("+");
        minus.setText("-");
        multiplication.setText("*");
        divide.setText("/");
        point.setText(".");
        equal.setText("=");

        add(plus,BorderLayout.NORTH);
      this.add(minus);
        this.add(multiplication);
       this.add(divide);
       this.add(point);
       this.add(equal);


        JLabel t0 = new JLabel("0");
        JLabel t1 = new JLabel("1");
        JLabel t2 = new JLabel("2");
        JLabel t3 = new JLabel("3");
        JLabel t4 = new JLabel("4");
        JLabel t5 = new JLabel("5");
        JLabel t6 = new JLabel("6");
        JLabel t7 = new JLabel("7");
        JLabel t8 = new JLabel("8");
        JLabel t9 = new JLabel("9");
        JLabel plusT = new JLabel("+");
        JLabel minusT = new JLabel("-");
        JLabel multiplicationT = new JLabel("*");
        JLabel divideT = new JLabel("/");
        JLabel pointT = new JLabel(".");
        JLabel equalT = new JLabel("=");

        plus.addActionListener((event) -> System.out.print("+"));
        minus.addActionListener((event) -> System.out.print("-"));
        multiplication.addActionListener((event) -> System.out.print("*"));
        divide.addActionListener((event) -> System.out.print("/"));
        //  point.addActionListener((event)-> System.out.print("."));
        Scanner s = new Scanner(System.in);

        equal.addActionListener((event) -> System.out.println());


    }


}
