package com.company;

import javax.swing.*;
import java.awt.*;

public class Number extends JPanel {

    public Number() {


        JButton[] btn = new JButton[10];
        GridLayout box = new GridLayout(4,3);

        for (int i = 0; i < 10; i++) {
            btn[i] = new JButton(String.valueOf(i));
            btn[i].setPreferredSize(new Dimension(100,100));
            box.addLayoutComponent(String.valueOf(i), btn[i]);
            add(btn[i]);

        }
        setLayout(box);
    }
}