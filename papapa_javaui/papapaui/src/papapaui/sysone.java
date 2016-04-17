package papapaui;

/**
 * 系统管理员界面
 * coded by 周琪
 * */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sysone  extends JFrame implements ActionListener{

	//定义组件
	JButton hall;
	JLabel hall1;
	JButton use;
	JLabel use1;
	JButton back;
	String title1 = null;
	
	public sysone(String title) {
		title1 = title;
		//初始化部件
		hall = new circlebutton("管理演出厅", 150, 150);
		hall.addActionListener(this);
		hall1 = new yinying(100, 20);
		use = new circlebutton("管理系统用户", 150, 150);
		use.addActionListener(this);
		use1 = new yinying(100, 20);
		back = new JButton("退出");
		back.addActionListener(this);
		
		//定义面板设置属性
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		p3.setBackground( Color.pink);
		//添加组件
		p3.add(hall);
		hall.setBounds(150, 150, 150, 150);
		p3.add(hall1);
		hall1.setBounds(175, 320, 150, 150);
		p3.add(use);
		use.setBounds(450, 150, 150, 150);
		p3.add(use1);
		use1.setBounds(475, 320, 150, 150);
		p3.add(back);
		back.setBounds(650, 500, 60, 35);
		
		

		//当前面板属性设置
		this.add(p3);
		//设置标题图片
		this.setTitle(title);
		ImageIcon icon=new ImageIcon("imag/t3.jpg");
		this.setIconImage(icon.getImage());
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(350	,150, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==hall)
		{
			syshall sh = new syshall();
			sh.setTitle("欢迎系统管理员 ！！");
		}
		else if (e.getSource() == back)
		{
			new tologin();
		}
		else
		{
			sysuser su = new sysuser("欢迎系统管理员 ！！");
		}
		this.dispose();
	}
}






