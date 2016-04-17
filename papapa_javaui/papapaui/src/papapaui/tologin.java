package papapaui;

/***
 * 登录主界面
 * coded by danneel
 * 
 * */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.channels.spi.AsynchronousChannelProvider;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class tologin extends JFrame implements ActionListener{
	private static int aspect = 1;
	private static char[] number ;
	private static char[] passwd = null;
	private static char[] passwd0 = null;
	
	//头部图片
	JLabel jl1;
	//头像
	JLabel t1;
	JLabel t2;
	JLabel t3;
	//选项卡
	JTabbedPane jtp;
	JPanel jp1, jp2, jp3;
	//员工
	JLabel j1;
	JTextField tx1;
	//经理
	JLabel j2, j3;
	JTextField user;
	JPasswordField pass;
	//系统管理员
	JLabel j4;
	JPasswordField pass1;
	JButton lock;
	
	//登录按钮
	JButton jb1;
	//重置按钮
	JButton jb2;

	
	//组件初始化
	public tologin()
	{
		//售票员组件
		j1 = new JLabel("员工号：", JLabel.RIGHT);
		tx1 = new JTextField();
		t1 = new JLabel(new ImageIcon("imag/t1.jpg"));
		
		//经理面板组件
		j2 = new JLabel("用户：", JLabel.RIGHT);
		j3 = new JLabel("密码：", JLabel.RIGHT);
		user = new JTextField();
		pass = new JPasswordField();
		pass.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				passwd0 = pass.getPassword();
			}
		});
		t2 = new JLabel(new ImageIcon("imag/t2.jpg"));
	
		
		//系统管理员组件
		j4 = new JLabel("password:",JLabel.RIGHT);
		pass1 = new JPasswordField();
		pass1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				passwd = pass1.getPassword();
			}
		});
		
		lock = new JButton("关锁系统");
		lock.setBackground(new Color(255,	255, 204));
		lock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (passwd == null)
				{
					String passwd1 = JOptionPane.showInputDialog(null, "请输入你的权限口令");
					passwd = passwd1.toCharArray();
				}
				
				int option = JOptionPane.showConfirmDialog(null, "你确认关闭系统吗？你拥有最高权限 ！！");
				if (option == JOptionPane.YES_NO_OPTION)
				{
					JOptionPane.showMessageDialog(null, "系统已经锁定，请通过后台服务器操作 ! !");
				}
			}
		});
		t3 = new JLabel(new ImageIcon("imag/t3.jpg"));
		
		
		//排版
		//上部
		jl1 = new JLabel(new ImageIcon("imag/1-1.jpg"));
		jl1.setBounds(-3, -3, 444, 192);
		//下部
		jb1 = new JButton("登录");
		jb1.setBounds(120, 375, 60, 35);
		jb1.addActionListener(this);
		
		
		jb2 = new JButton("重置");
		jb2.setBounds(220,  375, 60, 35);
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (aspect == 1)
				{
					tx1.setText("");
				}
				else if (aspect == 2)
				{
					user.setText("");
					pass.setText("");
				}
				else if (aspect == 3)
				{
					pass1.setText("");
				}
			}
		});
		//中部 
		jtp = new JTabbedPane();
		jtp.setBounds(-1, 184, 442, 180);
		
		
		jp1= new JPanel();
		jp1.setBackground(new Color(153, 255, 204));
		jp2 = new JPanel();
		jp2.setBackground(new Color(255, 255, 204));
		jp3 = new JPanel();
		jp3.setBackground(new Color(204, 204, 255));
		
		
		//中部细化
		//将面板添加到选项卡里面
		jtp.add("售票员", jp1);
		jtp.add("经理", jp2);
		jtp.add("系统管理员", jp3);
		jtp.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {	
					JTabbedPane tp = (JTabbedPane) e.getSource();
					int se = tp.getSelectedIndex();
					aspect = se + 1;
			}
		});
		
		//面板细化
		jp1.setLayout(null);
		jp1.add(j1);
		j1.setBounds(50, 40, 60, 80);
		jp1.add(tx1);
		tx1.setBounds(125, 65, 110, 30);
		jp1.add(t1);
		t1.setBounds(290, 20, 100, 110);
		
		
		jp2.setLayout(null);
		jp2.add(j2);
		j2.setBounds(50, 15, 60, 80);
		jp2.add(user);
		user.setBounds(125, 40, 110, 30);
		jp2.add(j3);
		j3.setBounds(50, 55, 60, 80);
		jp2.add(pass);
		pass.setBounds(125, 80, 110, 30);
		jp2.add(t2);
		t2.setBounds(290, 20, 110, 120);
		
	
		jp3.setLayout(null);
		jp3.add(j4); 
		j4.setBounds(50, 20, 60, 80);
		jp3.add(pass1);
		pass1.setBounds(125, 45, 110, 30);
		jp3.add(lock);
		lock.setBounds(100, 100, 100, 35);
		jp3.add(t3);
		t3.setBounds(290, 20, 100, 110);

		
		//框架属性设置
//		this.setUndecorated(true);
		this.setBounds(500, 200, 444, 450);
		this.add(jl1);
		this.add(jb1);
		this.add(jb2);
		this.add(jtp);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("PAPAPA剧院");
		ImageIcon icon=new ImageIcon("imag/2-1.jpg");
		this.setIconImage(icon.getImage());
	}
	
	
	public static void main(String[] args)
	{
  //创建实例化
		tologin papa = new tologin();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			if (aspect == 1)
			{
				if (tx1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "请输入你的工号 ! !");
				}
				else
				{
					sellone so = new sellone("欢迎售票员："+ tx1.getText());
					this.dispose();
				}
			}
			else if (aspect == 2)
			{
				if ( user.getText().equals("")  ||  (passwd0 == null))
				{
					JOptionPane.showMessageDialog(null, "你输入的信息不全 ! !");
				}
				else
				{
					manone mo = new manone("欢迎经理："+user.getText());
					this.dispose();
				}
			}
			else if (aspect == 3)
			{
				if (passwd == null)
				{
					JOptionPane.showMessageDialog(null, "请输入你的口令 ! !");
				}
				else
				{
					sysone to = new sysone("欢迎系统管理员 ！！");
					this.dispose();
				}
			}
		}
}

















