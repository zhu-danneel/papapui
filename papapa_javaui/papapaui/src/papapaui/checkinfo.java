package papapaui;
/**
 * 查询界面
 * 包含查询演出、查询演出票、统计销售额
 *coded by 杨崇辉
 * */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class checkinfo extends JFrame implements ActionListener{
	private String title1 = null;
	private int num1 = 0;
	//组件声明
		JLabel lc;
		JLabel check;
		JComboBox<String> a;
		JPanel su;
		JButton comf;
		JButton back;
		JTextArea ta;
		
		
		
		//构造函数初始化
		public checkinfo(String title, String location, int num) {
			title1 = title;
			num1 = num;
			lc = new JLabel(location);
			check = new JLabel("查询内容：", JLabel.RIGHT);
			a = new JComboBox<>();
			su = new JPanel();
			comf = new JButton("确认");
			ta = new JTextArea(200, 300);
		    back = new JButton("返回");
		    
		    //下拉框添加选项
		    a.addItem("查询演出");
		    a.addItem("查询演出票");
		    a.addItem("统计销售额");
		    
		    //填充内容
			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(33, 30, 250, 30);
			su.add(check);
			check.setBounds(80, 95, 100, 40);
			su.add(a);
			a.setBackground(new Color(241, 248, 179));
			a.setBounds(230, 100, 230, 30);
			su.add(comf);
			comf.setBounds(500, 95, 80, 40);
			su.add(ta);
			ta.setBounds(70, 175, 640, 330);
			su.add(back);
			back.setBounds(700, 520, 60, 35);
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
				if (num1 == 1)
				{
					new sellone(title1);
				}
				else if (num1 == 2)
				{
					new manone(title1);
				}
			}
			this.dispose();
		}
}

