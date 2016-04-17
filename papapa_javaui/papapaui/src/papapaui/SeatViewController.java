package papapaui;


/**
 * 座位界面
 * coded by 王亦梁
 * */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class SeatViewController extends JFrame implements ActionListener {
	private String title1 = null;
	
	Seat buttonseat ;
	JLabel  labelScreen ;
	JLabel  seatColumn;
	JLabel  filmImageLabel;
	JLabel filmImageNameJLabel;
	JLabel spiltLabel;
	JButton buySeatbutton;
	JButton cancelButton;
	ArrayList<Seat> realSeats;
	
	public SeatViewController(String title, int  imageindex){
		title1 = title;
		int count =1;
		realSeats  = new ArrayList<Seat>();
		for (int i =1 ; i<10;i++){
			for(int j=0;j<10;j++){
				ImageIcon imageIcon = new ImageIcon("imag/seatBlue.png");
				Image image = imageIcon.getImage().getScaledInstance(30, 25, imageIcon.getImage().SCALE_DEFAULT);
				ImageIcon icon1 = new ImageIcon(image);
				

				
				buttonseat = new Seat();
				buttonseat.setIcon(icon1);
				buttonseat.count =count;
				buttonseat.addActionListener(this);
				buttonseat.setBorderPainted(false);
				buttonseat.state ="Blue";
				if (count %10 ==0){
					buttonseat.setBounds(50*10, i*(50), 40, 30);
				}
				else{
					buttonseat.setBounds(50*(count %10), i*(50), 40, 30);
				}
 				count++;
 			
 				realSeats.add(buttonseat);
 				this.add(buttonseat);
			}
		}
		
		labelScreen = new JLabel("荧幕的地方");
		labelScreen.setBounds(260, 10, 800/10 *2, 20);
		this.add(labelScreen);
		
		for(int i=1; i <10 ;i++){
			seatColumn = new JLabel ("S"+""+i); 
			seatColumn.setBounds(50*11, i*(50), 800/30, 600/30);
			this.add(seatColumn);
		}
		
		filmImageNameJLabel = new JLabel("	影片海报");
		filmImageNameJLabel.setBounds(650, 70, 60 ,40);
		this.add(filmImageNameJLabel);
		
		buySeatbutton = new JButton("出票");
		buySeatbutton.setBounds(630, 400, 100, 60);
		buySeatbutton.addActionListener(this);
		this.add(buySeatbutton);
		cancelButton = new JButton("返回");
		cancelButton.setBounds(650, 500, 60, 35);
		cancelButton.addActionListener(this);
		this.add(cancelButton);

		ImageIcon imageIcon2 = new ImageIcon("imag/"+imageindex+".png");
		Image image2 = imageIcon2.getImage().getScaledInstance(800/20 *5, 800/20 *5, imageIcon2.getImage().SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(image2);
		
		filmImageLabel = new JLabel();
		filmImageLabel.setIcon(icon2);
		filmImageLabel.setBounds(600, 20, 160, 400);
		this.add(filmImageLabel);
	
		
        
		
		
		this.setBackground(Color.PINK);
		this.setTitle("售票");
		this.setBounds(350	,150, 800, 600);
		this.setLayout(null);
		this.setIconImage(new ImageIcon("imag/2-1.jpg").getImage());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getSource() ==buySeatbutton){
			int opt = JOptionPane.showConfirmDialog(null, "购票成功，再见！");
			if (opt == JOptionPane.YES_OPTION)
			{
				this.dispose();
			}
			else if (opt == JOptionPane.NO_OPTION)
			{
				this.dispose();
			}
		}
		else if (e.getSource() == cancelButton){
			new sellticket(title1);
			 this.dispose();
		}
		
		
		for (int i = 0; i < 100; i++) {
				
			ImageIcon imageIcon2 = new ImageIcon("imag/seatPink.png");
			Image image2 = imageIcon2.getImage().getScaledInstance(800/50, 800/50, imageIcon2.getImage().SCALE_DEFAULT);
			ImageIcon icon2 = new ImageIcon(image2);	
			
			
			ImageIcon imageIcon3 = new ImageIcon("imag/seatBlue.png");
			Image image3 = imageIcon3.getImage().getScaledInstance(800/50, 800/50, imageIcon3.getImage().SCALE_DEFAULT);
			ImageIcon icon3 = new ImageIcon(image3);
			
			if (e.getSource() == realSeats.get(i)){
				if(realSeats.get(i).state =="Blue"){
					realSeats.get(i).setIcon(icon2);
	 				realSeats.get(i).state = "Pink";
				}
				else if (realSeats.get(i).state =="Pink") {
					realSeats.get(i).setIcon(icon3);
	 				realSeats.get(i).state = "Blue";
				}
				
 			}
		}
	}
}
