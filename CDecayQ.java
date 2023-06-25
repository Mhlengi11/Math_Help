import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CDecayQ extends JFrame implements ActionListener {
	JLabel label1;
	JLabel label2;
	//buttons
	JButton accumilated;
	JButton invested;
	JButton rate;
	JButton years;
	
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	CDecayQ(){
		//variables
		accumilated = new JButton("Final amount");
		invested = new JButton("Initial amount");
		rate =new JButton("Intrest rate");
		years = new JButton("number of years");
	
		label1 = new JLabel("MATHS HELP");
		label2 = new JLabel("Choose unknown of A=P(1-i)^n where A<P");
		
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1.setFont(new Font(null,Font.BOLD,50));
		label1.setForeground(Color.white);
		label2.setFont(new Font(null,Font.BOLD,30));
		label2.setForeground(Color.red);
		panel3.setBackground(Color.red);
		panel4.setBackground(Color.gray);
		panel5.setBackground(Color.white);
		accumilated.setFocusable(false);
		rate.setFocusable(false);
		years.setFocusable(false);

		invested.setFocusable(false);
		
		accumilated.setBackground(Color.white);
		years.setBackground(Color.white);
		rate.setBackground(Color.white);
		invested.setBackground(Color.white);

		this.setLayout(new BorderLayout());
		accumilated.addActionListener(this);
		rate.addActionListener(this);
		years.addActionListener(this);
		invested.addActionListener(this);
		
		panel4.setLayout(new GridLayout(7,1));
		this.setVisible(true);
		
		//size
		this.setSize(500,500);
		label1.setBounds(100,0,100,100);
		
		
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(300,300));
		panel5.setPreferredSize(new Dimension(50,50));
		
		//ADD
		panel3.add(label1);
		panel4.add(label2);
		panel4.add(accumilated);
		panel4.add(invested);
		panel4.add(rate);
		panel4.add(years);
	
		this.add(panel3,BorderLayout.NORTH);
		this.add(panel4,BorderLayout.CENTER);
		this.add(panel5,BorderLayout.EAST);
	
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==accumilated) {
			this.dispose();
			new CDecayA();	
		}
		else if(e.getSource()==invested) {
			this.dispose();
			new CDecayP();
		}
		else if(e.getSource()==rate) {
			this.dispose();
			new CDecayI();
		}
		else if(e.getSource()==years) {
			this.dispose();
			new CDecayN();
		}
		
	}

	public static void main(String[] args) {
		new CDecayQ();

	}

}
