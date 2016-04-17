package papapaui;

/**
 * 演出系统用户
 * coded by 周琪
 * 
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

public class sysuser extends JFrame implements ActionListener{

	//组件声明
		JLabel lc = new JLabel("当前位置：系统管理员 --> 系统用户管理");
		JPanel su = new JPanel();
		JButton back = new JButton("返回");
		JLabel  on;
		String onin;
		JTextArea ta;
		JButton add;
		
		//构造函数初始化
		public sysuser(String title) {
			
			su.setLayout(null);
			su.setBackground(Color.pink);
			su.add(lc);
			lc.setBounds(20, 10, 250, 30);
			
			on = new JLabel("当前系统用户：");
			onin = "蒙玉航\n"
					+ "王一两\n"
					+ "周期\n"
					+ "杨崇辉\n"
					+ "朱晓丹\n";
			ta = new JTextArea(onin);
			add = new JButton("添加用户");
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
			ImageIcon icon=new ImageIcon("imag/t3.jpg");
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
				new sysone("欢迎系统管理员 ！！");
				this.dispose();
			}
			else if (e.getSource()==add)
			{
				String s = JOptionPane.showInputDialog("请输入添加的用户:");
				if (!(s.length()<=0))
				{
					onin = onin + s+ "\n";
					ta.setText(onin);
				}
			}
		}
}
