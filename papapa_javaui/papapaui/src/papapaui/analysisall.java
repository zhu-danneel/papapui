package papapaui;
/**
 * 分析销售偶数据
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

public class analysisall extends JFrame implements ActionListener{

	private String title1 = null;
	//组件声明
		JLabel lc;
		JPanel su;
		JButton back;
		JLabel a1;
		JLabel a2;
		JLabel a3;
		JLabel a4;
		
		
		
		//构造函数初始化
		
		public analysisall(String title) {
			title1 = title;
			lc = new JLabel("当前位置：经理 --> 管理 --> 分析销售数据");
			a1 = new JLabel(new ImageIcon("imag/3-1.jpg"));
			a2 = new JLabel(new ImageIcon("imag/3-2.jpg"));
			a3 = new JLabel(new ImageIcon("imag/3-3.jpg"));
			a4 = new JLabel(new ImageIcon("imag/3-4.jpg"));
			su = new JPanel();
			back = new JButton("返回");
			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(20, 10, 250, 30);
			su.add(a1);
			a1.setBounds(40, 30, 360, 260);
			su.add(a2);
			a2.setBounds(420, 30, 300, 280);
			su.add(a3);
			a3.setBounds(40, 300, 250, 250);
			su.add(a4);
			a4.setBounds(280, 330, 400, 220);
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