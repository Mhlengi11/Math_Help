import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleP extends JFrame implements ActionListener{
	JPanel redPanel; 
	JLabel label;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField a;
	JTextField b;
	JTextField c;
	JTextField d;
	JLabel conclusion;
	JLabel accumilated;
	JLabel intrest;
	JLabel years;
	
	String domain1;
	JLabel header;
	JButton answer;

	
	DecimalFormat df;
	double step2;
	double step1;
	double step3;
	double step4;
	double aValue;
	double iValue;
	double nValue;
	double outcome;
	SimpleP(){
		//variables
		redPanel = new JPanel();
		westPanel = new JPanel();
		eastPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel();
		accumilated = new JLabel("Accumilated amount:");
		intrest = new JLabel("intrest rate:");
		years = new JLabel("years:");
		df = new DecimalFormat("0.00");
		
		answer = new JButton("ANSWER");
		conclusion = new JLabel();
		label = new JLabel("MATHS HELP");
		header = new JLabel();
		header = new JLabel();
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		



		
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setForeground(Color.WHITE);
		header.setForeground(Color.black);
		centerPanel.setLayout(null);
		label.setFont(new Font(null,Font.BOLD,50));
		/*mlabel.setFont(new Font(null,Font.PLAIN,10));
		clabel.setFont(new Font(null,Font.PLAIN,10));*/
		redPanel.setBackground(Color.RED);
		westPanel.setBackground(Color.white);
		eastPanel.setBackground(Color.white);
		southPanel.setBackground(Color.white);
		centerPanel.setBackground(Color.LIGHT_GRAY);
		
		answer.addActionListener(this);
		
		/*-a.setVisible(false);
		b.setVisible(false);
		c.setVisible(false);
		d.setVisible(false);*/
		header.setText("CALCULATE P OF: A=P(1+in)");
		accumilated.setVisible(true);
		intrest.setVisible(true);
		years.setVisible(true);
		answer.setVisible(true);
		conclusion.setVisible(false);
		header.setVisible(true);
		
		answer.setFocusable(false);

		
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		//size
		label.setBounds(100,0,100,100);
		this.setSize(500,500);
		
		
		redPanel.setPreferredSize(new Dimension(100,100));
		westPanel.setPreferredSize(new Dimension(50,50));
		eastPanel.setPreferredSize(new Dimension(50,50));
		southPanel.setPreferredSize(new Dimension(50,50));
		centerPanel.setPreferredSize(new Dimension(300,300));
		
		header.setBounds(10,50,500,30);		
		answer.setBounds(20,210,100,20);
		conclusion.setBounds(20,230,500,20);
		accumilated.setBounds(0,120,300,20);
		intrest.setBounds(0,150,300,20);
		years.setBounds(0,180,300,20);
		
		a.setBounds(120,120,50,20);
		b.setBounds(80,150,50,20);
		c.setBounds(50,180,50,20);
		//add
		
		redPanel.add(label);
	
		centerPanel.add(header);
		centerPanel.add(a);
		centerPanel.add(b);
		centerPanel.add(c);
		//centerPanel.add(d);
		centerPanel.add(answer);
		
		centerPanel.add(intrest);
		centerPanel.add(accumilated);
		centerPanel.add(years);
		centerPanel.add(conclusion);
		this.add(redPanel,BorderLayout.NORTH);
		this.add(eastPanel,BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		this.add(southPanel,BorderLayout.SOUTH);
		this.add(centerPanel,BorderLayout.CENTER);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==answer) {
			try {
				//calculating initial amount
				
				
				
				aValue = Double.parseDouble(a.getText());
				iValue  = Double.parseDouble(b.getText());
				nValue = Double.parseDouble(c.getText());
				step1 = iValue*nValue;
				step2 = 1 + step1;
				outcome = aValue/step2;
				
				conclusion.setText("invested amount is R" + df.format(outcome) + "(using P=A÷(1+in)");
				conclusion.setVisible(true);
			}
			catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Please enter a real number", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
	public static void main(String[] args) {
		new SimpleP();

	}

}
