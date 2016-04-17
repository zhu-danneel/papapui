package papapaui;

/**
 * 演出厅管理
 * coded by 杨崇辉
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
import javax.swing.JPanel;

public class syshall  extends JFrame implements ActionListener{
	//组件声明
	JLabel lc = new JLabel("当前位置：系统管理员 --> 演出厅管理");
	JButton
		add = new JButton("添加"),
		dele = new JButton("删除"),
		motf = new JButton("修改"),
		seat = new JButton("座位管理"),
		back = new JButton("返回");
	JPanel sh = new JPanel();
	JPanel halllist = new JPanel();
	JButton
		btn01 = new JButton("01演出厅"),
		btn02 = new JButton("02演出厅"),
		btn03 = new JButton("03演出厅"),
		btn04 = new JButton("04演出厅"),
		btn05 = new JButton("05演出厅"),
		btn06 = new JButton("06演出厅"),
		btn07 = new JButton("07演出厅"),
		btn08 = new JButton("08演出厅"),
		btn09 = new JButton("09演出厅"),
		btn10 = new JButton("10演出厅"),
		btn11 = new JButton("11演出厅"),
		btn12 = new JButton("12演出厅");
	
	//构造函数初始化
	public syshall() {
		//初始化组件信息(按钮太多，在声明的时候完成)
		
		//演出厅
		halllist.setLayout(new GridLayout(3, 4));
		halllist.add(btn01);
		halllist.add(btn02);
		halllist.add(btn03);
		halllist.add(btn04);
		halllist.add(btn05);
		halllist.add(btn06);
		halllist.add(btn07);
		halllist.add(btn08);
		halllist.add(btn09);
		halllist.add(btn10);
		halllist.add(btn11);
		halllist.add(btn12);
		
		sh.setBackground( Color.pink);
		sh.setLayout(null);
		sh.add(lc);
		lc.setBounds(20, 10, 250, 30);
		sh.add(halllist);
		halllist.setBounds(30, 60, 600, 470);
		sh.add(add);
		add.setBounds(670, 100, 100, 50);
		sh.add(dele);
		dele.setBounds(670, 200, 100, 50);
		sh.add(motf);
		motf.setBounds(670, 300, 100, 50);
		sh.add(seat);
		seat.setBounds(670, 400, 100, 50);
		sh.add(back);
		back.setBounds(690, 500, 60, 35);
		back.addActionListener(this);
		
	
		this.add(sh);
		
		 //当前面板属性设置
		ImageIcon icon=new ImageIcon("imag/t3.jpg");
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
			new sysone("欢迎系统管理员 ！！");
			this.dispose();
		}
	}
}









