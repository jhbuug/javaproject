package com.sxwl.windowsControler;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

@SuppressWarnings("unused")
public class windowsControler extends MouseAdapter implements MouseMotionListener{
    private Point point;
    private JFrame frame;
    public windowsControler(JFrame frame){
        point=new Point();
        this.frame=frame;
    }
    //鼠标按下事件
    public void mousePressed(MouseEvent e){
        point.x=e.getX();
        point.y=e.getY();
    }
    //鼠标拖拽事件
    public void mouseDragged(MouseEvent e){
        Point location = frame.getLocation();
        frame.setLocation(location.x+e.getX()-point.x,location.y+e.getY()-point.y);
    }
}
