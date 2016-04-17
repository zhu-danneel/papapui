package papapaui;

/**
 * 创建圆形按钮的投影
 * coded by danneel
 * */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class yinying extends JLabel{

	private int x, y;
     public  yinying(int c1, int c2) {
    	 x = c1;
    	 y = c2;
        // 获取按钮的最佳大小
        Dimension size = getPreferredSize();
        
        //改变按钮大小的入口
        size.width = size.height = Math.max(c1, c2);
        setPreferredSize(size);
    }
 
    protected void paintComponent(Graphics g) {
        // fillOval方法画一个矩形的内切椭圆，并且填充这个椭圆，
        // 当矩形为正方形时，画出的椭圆便是圆
        g.fillOval(0, 0, x, y);
    }
}



