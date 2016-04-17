package papapaui;
/**
 * 管理剧目
 * coded by 周琪
 * */


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class dealone extends JFrame implements ActionListener{
	private String title1 = null;
	
	//组件声明
		String onin;
		JLabel lc;
		JLabel on;
		JTextArea ta;
		JButton add;
		JPanel su;
		JButton back;
		
		//构造函数初始化
		public dealone(String title) {
			title1 = title;
			
			lc = new JLabel("当前位置：经理 --> 管理 --> 管理剧目");
			on = new JLabel("当前上映的剧目：");
			onin = "陪安东尼度过漫长岁月\n"
					+ "僵尸归来\n"
					+ "爱谁谁\n"
					+ "丑女春天\n"
					+ "无人看护\n"
					+ "虐花间\n";
			ta = new JTextArea(onin);
			add = new JButton("添加上映剧目");
			su = new JPanel();
			back = new JButton("返回");
			
			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(20, 10, 250, 30);
			su.add(on);
			on.setBounds(110, 50, 200, 40);
			su.add(ta);
			ta.setBounds(130, 90, 330, 440);
			su.add(add);
			add.setBounds(530, 250, 180, 40);
			add.addActionListener(this);
			su.add(back);
			back.setBounds(690, 500, 60, 35);
			back.addActionListener(this);
			
			
			this.add(su);
			 //当前面板属性设置
			this.setTitle(title);
			ImageIcon icon=new ImageIcon("imag/t2.jpg");
			this.setIconImage(icon.getImage());
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
			else if (e.getSource()==add)
			{
				String s = JOptionPane.showInputDialog("请输入添加的剧目:");
				if (!(s.length()<=0))
				{
					onin = onin + s+ "\n";
					ta.setText(onin);
				}
			}
		}
}