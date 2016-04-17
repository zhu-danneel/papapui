package papapaui;


/*
 * 创建圆形按钮的类
 * coded by danneel
 * */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JFrame;

public class circlebutton extends JButton {
	
	  
//    public  circlebutton(String label) {
     public  circlebutton(String label, int c1, int c2) {
        // 获取按钮的最佳大小
        Dimension size = getPreferredSize();
        
        //改变按钮大小的入口
        size.width = size.height = Math.max(c1, c2);
        setPreferredSize(size);
        setContentAreaFilled(false);
        
        this.setBackground(Color.orange);
  
        this.setText(label);
    }
 
    // 画圆的按钮的背景和标签
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(new Color(204,	255,	255)); // 点击时高亮
        } else {
            g.setColor(getBackground());
        }
        // fillOval方法画一个矩形的内切椭圆，并且填充这个椭圆，
        // 当矩形为正方形时，画出的椭圆便是圆
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }
 
    
    // 用简单的弧画按钮的边界。
    protected void paintBorder(Graphics g) {
        g.setColor(Color.white);
        // drawOval方法画矩形的内切椭圆，但不填充。只画出一个边界
        g.drawOval(0, 0, getSize().width -1 , getSize().height-1);
    }
 
    // shape对象用于保存按钮的形状，有助于侦听点击按钮事件
    Shape shape;
    
    public boolean contains(int x, int y) {
        if ((shape == null) || (!shape.getBounds().equals(getBounds()))) {
            // 构造一个椭圆形对象
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        // 判断鼠标的x、y坐标是否落在按钮形状内。
        return shape.contains(x, y);
    }
}
