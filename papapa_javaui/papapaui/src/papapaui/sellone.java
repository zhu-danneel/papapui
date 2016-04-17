package papapaui;

/**
 * 售票员界面
 * coded by 王亦梁
 * */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sellone  extends JFrame implements ActionListener
{
	//定义组件
	JButton checkshow;
	JLabel checkshow1;
	JButton checkticket;
	JLabel checkticket1;
	JButton analysis;
	JLabel analysis1;
	JButton sell;
	JButton back;

	private static String title1;
	
	public sellone(String title) {
		this.setTitle(title);
		title1 = title;
		//初始化部件
		checkshow = new circlebutton("查询演出", 150, 150);
		checkshow.addActionListener(this);
		checkshow1 = new yinying(90, 20);
		checkticket = new circlebutton("查询演出票", 150, 150);
		checkticket.addActionListener(this);
		checkticket1 = new yinying(90, 20);
		analysis = new circlebutton("统计销售额", 150, 150);
		analysis.addActionListener(this);
		analysis1 = new yinying(90, 20);
		sell = new circlebutton("售票", 300, 100);
		sell.addActionListener(this);
		back = new JButton("退出");
		
		//定义面板设置属性
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground( Color.pink);
		//添加组件
		p1.add(checkshow);
		checkshow.setBounds(105, 110, 140, 140);
		p1.add(checkshow1);
		checkshow1.setBounds(125, 280, 140, 140);
		
		p1.add(checkticket);
		checkticket.setBounds(330, 110, 140, 140);
		p1.add(checkticket1);
		checkticket1.setBounds(355, 280, 150, 150);
		
		p1.add(analysis);
		analysis.setBounds(550, 110, 140, 140);
		p1.add(analysis1);
		analysis1.setBounds(575, 280, 150, 150);
		
		p1.add(sell);
		sell.setBounds(240, 360, 300, 100);
		
		p1.add(back);
		back.setBounds(650, 500, 60, 35);
		back.addActionListener(this);
		
		
		
		//当前面板属性设置
		this.setTitle(title);
		this.add(p1);
		//设置标题图片
		ImageIcon icon=new ImageIcon("imag/t1-2.jpg");
		this.setIconImage(icon.getImage());
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(350	,150, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((e.getSource() == checkshow)  || (e.getSource() == checkticket) || (e.getSource() == analysis))
		{
			checkinfo cf = new checkinfo(title1, "当前位置：售票员 --> 查询", 1);
			this.dispose();
		}
		else if (e.getSource() == back)
		{
			new tologin();
			this.dispose();
		}
		else 
		{
			sellticket sc = new sellticket(title1);
			this.dispose();
		}
		
	}
}
