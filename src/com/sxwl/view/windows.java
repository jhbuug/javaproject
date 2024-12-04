package com.sxwl.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sxwl.windowsControler.windowsControler;

public class windows {
    public windows(){
        init();
    }
    private void init(){
        JFrame frame=new JFrame();
        windowsControler windowsControler=new windowsControler(frame);

        frame.setSize(400,310);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addMouseListener(windowsControler);
        frame.addMouseMotionListener(windowsControler);

        frame.setLayout(null);

        JPanel top = new JPanel();
        top.setLayout(null);
        top.setBounds(0,0,400,120);
        top.setBackground(Color.blue);

        JLabel label = new JLabel("Login");
        label.setBounds(10,5,60,20);
        label.setForeground(Color.white);
        top.add(label);

        JPanel down = new JPanel();
        down.setLayout(null);
        down.setBounds(0,120,400,190);
        down.setBackground(Color.yellow);

        frame.add(top);
        frame.add(down);
    }
}
