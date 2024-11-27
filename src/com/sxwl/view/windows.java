package com.sxwl.view;

import java.awt.Color;

import javax.swing.JFrame;

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

    }
}
