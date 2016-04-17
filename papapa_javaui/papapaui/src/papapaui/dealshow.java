package papapaui;
/**
 * 管理演出
 *coded by 蒙玉航
 * */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class dealshow extends JFrame implements ActionListener{
	private String title1 = null;
	//组件声明
		JLabel lc;
		JLabel in;
		JButton b1;
		JButton b2;
		JButton b3;
		JButton b4;
		JButton add;
		JButton motify;
		JPanel su;
		JButton back;
		
		//构造函数初始化
		public dealshow(String title) {
			title1 = title;
			
			lc = new JLabel("当前位置：经理 --> 管理 --> 管理演出");
			in = new JLabel("当前演出：");
			b1 = new JButton("安东尼--04演出厅--7:30");
			b2 = new JButton("丑女春天--02演出厅--9:10");
			b3 = new JButton("安东尼--08演出厅--9:30");
			b4 = new JButton("虐花间--01演出厅--10:00");
			add = new JButton("添加演出场次");
			motify = new JButton("修改演出信息");
			su = new JPanel();
			back = new JButton("返回");
			
			
			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(20, 10, 250, 30);
			su.add(b1);
			b1.setBackground(Color.white);
			b1.setBounds(100, 60, 200, 60);
			b1.addActionListener(this);
			su.add(b2);
			b2.setBackground(Color.white);
			b2.setBounds(360, 60, 200, 60);
			b2.addActionListener(this);
			su.add(b3);
			b3.setBackground(Color.white);
			b3.setBounds(100, 160, 200, 60);
			b3.addActionListener(this);
			su.add(b4);
			b4.setBackground(Color.white);
			b4.setBounds(360, 160, 200, 60);
			b4.addActionListener(this);
			su.add(add);
			add.setBounds(100, 500, 120, 40);
			add.addActionListener(this);
			su.add(motify);
			motify.setBounds(300, 500, 120, 40);
			motify.addActionListener(this);
			su.add(back);
			back.setBounds(690, 500, 60, 35);
			back.addActionListener(this);
			
			
			this.add(su);
			 //当前面板属性设置
			ImageIcon icon=new ImageIcon("imag/t2.jpg");
			this.setIconImage(icon.getImage());
			this.setTitle(title);
			this.setVisible(true);
			this.setResizable(false);
			this.setBounds(350	,150, 800, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == back)
			{
				new manone(title1);
				this.dispose();
			}
		}
}