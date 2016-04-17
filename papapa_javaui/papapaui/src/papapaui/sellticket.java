package papapaui;
/**
 * 售票功能
 * coded by 蒙玉航
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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class sellticket extends JFrame implements ActionListener{
	private static int imagnum = 1;
	private String title1 = null;
	//组件声明
		JLabel lc;
		JLabel onshow;
		
		JPanel su;  //the giggest
		JPanel buttong;
		
		JButton btn01;
		JButton btn02;
		JButton btn03;
		JButton btn04;
		JButton btn05;
		JButton btn06;
		JButton back;
		
		JLabel info;
		JLabel info1;
		JButton in1;
		JLabel info2;
		JButton in2;


		

		JLabel inf1;
		JButton i1;
		JLabel inf2;
		JButton i2;

		
		JLabel infom1;
		JButton iin1;
		JLabel iinf2;
		JButton infomat2;
		
		
		//构造函数初始化
		public sellticket(String title) {
			title1 = title;
			lc = new JLabel("当前位置：售票员 --> 售票");
			onshow = new JLabel("当前上映：");
			su = new JPanel();
			
			////////
			buttong = new JPanel();
			btn01 = new JButton(new ImageIcon("imag/1.png"));
			btn01.addActionListener(this);
			btn02 = new JButton(new ImageIcon("imag/2.png"));
			btn02.addActionListener(this);
			btn03 = new JButton(new ImageIcon("imag/3.png"));
			btn03.addActionListener(this);
			btn04 = new JButton(new ImageIcon("imag/4.png"));
			btn04.addActionListener(this);
			btn05 = new JButton(new ImageIcon("imag/5.png"));
			btn05.addActionListener(this);
			btn06 = new JButton(new ImageIcon("imag/6.png"));
			btn06.addActionListener(this);
			back = new JButton("返回");
			back.addActionListener(this);
			
			buttong.setLayout(null);
			buttong.setBackground(Color.WHITE);
			buttong.add(btn01);
			btn01.addActionListener(this);
			btn01.setBounds(30, 25, 90, 110);
			JTextArea a1 = new JTextArea("陪安东尼度过漫长岁月");
			buttong.add(a1);
			a1.setBounds(10, 145, 120, 30);
			buttong.add(btn02);
			btn02.addActionListener(this);
			btn02.setBounds(130, 25, 90, 110);
			JTextArea a2 = new JTextArea("僵尸归来");
			buttong.add(a2);
			a2.setBounds(150, 145, 60, 30);
			buttong.add(btn03);
			btn03.addActionListener(this);
			btn03.setBounds(230, 25, 90, 110);
			JTextArea a3 = new JTextArea("爱谁谁之所谓相爱");
			buttong.add(a3);
			a3.setBounds(230, 145, 100, 30);
			buttong.add(btn04);
			btn04.addActionListener(this);
			btn04.setBounds(330, 25, 90, 110);
			JTextArea a4 = new JTextArea("丑女春天");
			buttong.add(a4);
			a4.setBounds(350, 145, 80, 30);
			buttong.add(btn05);
			btn05.addActionListener(this);
			btn05.setBounds(430, 25, 90, 110);
			JTextArea a5 = new JTextArea("无人看护");
			buttong.add(a5);
			a5.setBounds(450, 145, 80, 30);
			buttong.add(btn06);
			btn06.addActionListener(this);
			btn06.setBounds(530, 25, 90, 110);
			JTextArea a6 = new JTextArea("虐花间");
			buttong.add(a6);
			a6.setBounds(560, 145, 80, 30);
			////////
			

			
			JLabel info = new JLabel("场次信息：");
			JPanel p1 = new JPanel();
			//最小面板的信息
			info1 = new JLabel("1号晚：7点半", JLabel.RIGHT);
			in1 = new JButton("选座");
			info2 = new JLabel("1号晚 ： 9点半", JLabel.RIGHT);
			in2 = new JButton("选座");
			p1.add(info1);
			p1.add(in1);
			in1.addActionListener(this);
			p1.add(info2);
			p1.add(in2);
			in2.addActionListener(this);

			
			JPanel p2 = new JPanel();
			//最小面板的信息
			inf1 = new JLabel("2号晚： 7点半", JLabel.RIGHT);
			i1 = new JButton("选座");
			inf2 = new JLabel("2号晚：9点半", JLabel.RIGHT);
			i2 = new JButton("选座");
			p2.add(inf1);
			p2.add(i1);
			i1.addActionListener(this);
			p2.add(inf2);
			p2.add(i2);
			i2.addActionListener(this);
			
			JPanel p3 = new JPanel();
			//最小面板的信息
			infom1 = new JLabel("3号晚： 7点半",JLabel.RIGHT);
			iin1 = new JButton("选座");
			iinf2 = new JLabel("3号晚：9点半",JLabel.RIGHT);
			infomat2 = new JButton("选座");
			p3.add(infom1);
			p3.add(iin1);
			iin1.addActionListener(this);
			p3.add(iinf2);
			p3.add(infomat2);
			infomat2.addActionListener(this);
			JTabbedPane jt01 =  new JTabbedPane();
			jt01.add("4月1号", p1);
			jt01.add("4月2号", p2);
			jt01.add("4月3号", p3);


			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(20, 10, 250, 30);
			su.add(onshow);
			onshow.setBounds(30, 50,100, 60);
			su.add(buttong);
			buttong.setBounds(120, 50, 640, 180);
			su.add(jt01);
			jt01.setBounds(260, 280, 200, 150);
			su.add(back);
			back.setBounds(690, 500, 60, 35);
			
			
			this.add(su);
			 //当前面板属性设置
			ImageIcon icon=new ImageIcon("imag/t1-2.jpg");
			this.setIconImage(icon.getImage());
			this.setTitle(title);
			this.setVisible(true);
			this.setResizable(false);
			this.setBounds(350	,150, 800, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn01)
			{
				imagnum = 1;
			}
			else if (e.getSource() == btn02)
			{
				imagnum = 2;
			}
			else if (e.getSource() == btn03)
			{
				imagnum = 3;
			}
			else if(e.getSource() == btn04)
			{
				imagnum = 4;
			}
			else if(e.getSource() == btn05)
			{
				imagnum = 5;
			}
			else if(e.getSource() == btn06)
			{
				imagnum = 6;
			}
			else if ((e.getSource()==in1) || (e.getSource()==in2) || (e.getSource()==i1) || (e.getSource()==i2) || (e.getSource()==infomat2) || (e.getSource()==iin1))
			{
				SeatViewController sv = new SeatViewController(title1, imagnum);
				this.dispose();
			}
			else if (e.getSource() == back)
			{
				new sellone(title1);
				this.dispose();
			}
		}
}



