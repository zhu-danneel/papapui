package papapaui;

/**
 * 经理界面
 * coded by danneel
 * */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class manone  extends JFrame implements ActionListener{
	private String title1 =null;
	//定义组件
	//标签类
	JLabel l1;
	JLabel l2;
	//按钮类
	JButton btn_1;
	JLabel btn_1_1;
	JButton btn_2;
	JLabel btn_2_1;
	JButton btn_3;
	JLabel btn_3_1;
	
	JButton btn_4;
	JLabel btn_4_1;
	JButton btn_5;
	JLabel btn_5_1;
	JButton btn_6;
	JLabel btn_6_1;
	
	
	JButton back;
	
	public manone(String title) {
		this.setTitle(title);
		title1 = title;
		//初始化部件
		//管理类
		l1 = new JLabel("管理类 : ", JLabel.CENTER);
		btn_1 = new circlebutton("管理演出", 150, 150);
		btn_1.addActionListener(this);
		btn_1_1 = new yinying(90, 20);
		btn_2 = new circlebutton("管理剧目", 150, 150);
		btn_2.addActionListener(this);
		btn_2_1 = new yinying(90, 20);
		btn_3 = new circlebutton("分析销售数据", 150, 150);
		btn_3.addActionListener(this);
		btn_3_1 = new yinying(90, 20);
		
		//查询类
		l2 = new JLabel("查询类 : ", JLabel.CENTER);
		btn_4 = new circlebutton("查询演出", 150, 150);
		btn_4.addActionListener(this);
		btn_4_1 = new yinying(90, 20);
		btn_5 = new circlebutton("查询演出票", 150, 150);
		btn_5.addActionListener(this);
		btn_5_1 = new yinying(90, 20);
		btn_6 = new circlebutton("统计销售额", 150, 150);
		btn_6.addActionListener(this);
		btn_6_1 = new yinying(90, 20);
		
		back = new JButton("退出");
		back.addActionListener(this);
		
		//定义面板设置属性
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground( Color.pink);
		
		//添加组件
		//管理类
		p2.add(l1);
		l1.setBounds(0, 60, 130, 130);
		
		p2.add(btn_1);
		btn_1.setBounds(155, 60, 130, 130);
		p2.add(btn_1_1);
		btn_1_1.setBounds(175, 210, 140, 140);
		
		p2.add(btn_2);
		btn_2.setBounds(370, 60, 130, 130);
		p2.add(btn_2_1);
		btn_2_1.setBounds(390, 210, 150, 150);
		
		p2.add(btn_3);
		btn_3.setBounds(585, 60, 130, 130);
		p2.add(btn_3_1);
		btn_3_1.setBounds(605, 210, 150, 150);
		
		//查询类
		p2.add(l2);
		l2.setBounds(0, 310, 130, 130);
		
		p2.add(btn_4);
		btn_4.setBounds(155, 310, 130, 130);
		p2.add(btn_4_1);
		btn_4_1.setBounds(175, 460, 140, 140);
		
		p2.add(btn_5);
		btn_5.setBounds(370, 310, 130, 130);
		p2.add(btn_5_1);
		btn_5_1.setBounds(390, 460, 150, 150);
		
		p2.add(btn_6);
		btn_6.setBounds(585, 310, 130, 130);
		p2.add(btn_6_1);
		btn_6_1.setBounds(605, 460, 150, 150);
		
		
		p2.add(back);
		back.setBounds(680, 510, 60, 35);
		
		
		
		//当前面板属性设置
		this.add(p2);
		//设置标题图片
		ImageIcon icon=new ImageIcon("imag/t2.jpg");
		this.setIconImage(icon.getImage());
		this.setVisible(true);
		this.setResizable(false);
		this.setBounds(350	,150, 800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((e.getSource() == btn_4)|| (e.getSource() ==btn_5) || (e.getSource() == btn_6))
		{
			checkinfo cf = new checkinfo(title1, "当前位置：经理 --> 查询", 2);
		}
		else if(e.getSource() == btn_1)
		{
			dealshow ds = new dealshow(title1);
		}
		else if(e.getSource() == btn_2)
		{
			dealone dl = new dealone(title1);
		}
		else if (e.getSource() == btn_3)
		{
			analysisall as = new analysisall(title1);
		}
		else if (e.getSource() == back)
		{
			new tologin();
		}
		this.dispose();
	}
}