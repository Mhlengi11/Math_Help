import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;

public class Linear extends JFrame implements ActionListener {
	JPanel redPanel; 
	JLabel label;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField m;
	JTextField c;
	
	JLabel headerLabel;
	JLabel mlabel;
	JLabel clabel;
	JLabel range;
	String range1;
	JLabel domain;
	String domain1;
	JLabel header;
	JButton answer;
	double mValue;
	double cValue;
	double x;
	double y;
	JLabel xint;
	JLabel yint;
	String mtf;
	String ctf;
	Linear(){
		//variables
		redPanel = new JPanel();
		westPanel = new JPanel();
		eastPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel();
		mlabel = new JLabel("m:");
		clabel = new JLabel("c:");
		
		answer = new JButton("ANSWER");
		label = new JLabel("MATHS HELP");
		this.m = new JTextField();
		this.c = new JTextField();
		headerLabel = new JLabel("ENTER M AND C OF\ny=mx+c");
		//mValue = m.toString();
		this.mtf=m.getText();
		//this.mValue = Double.parseDouble(mtf);
		//this.cValue = Double.parseDouble(c.getText());
		range = new JLabel();
		domain = new JLabel();
		header = new JLabel();
		xint = new JLabel();
		yint = new JLabel();
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font(null,Font.BOLD,50));
		//mlabel.setFont(new Font(null,Font.PLAIN,10));
		//clabel.setFont(new Font(null,Font.PLAIN,10));
		redPanel.setBackground(Color.RED);
		westPanel.setBackground(Color.white);
		eastPanel.setBackground(Color.white);
		southPanel.setBackground(Color.white);
		centerPanel.setBackground(Color.LIGHT_GRAY);
		headerLabel.setForeground(Color.black);
		headerLabel.setFont(new Font(null,Font.BOLD,15));
		
		this.setLayout(new BorderLayout());
		header.setVisible(false);
		centerPanel.setLayout(null);
		range.setVisible(false);
		domain.setVisible(false);
		xint.setVisible(false);
		yint.setVisible(false);
		this.setVisible(true);
		//function
		
		answer.addActionListener(this);
		//size
		label.setBounds(100,0,100,100);
		this.setSize(500,500);
		
		
		redPanel.setPreferredSize(new Dimension(100,100));
		westPanel.setPreferredSize(new Dimension(50,50));
		eastPanel.setPreferredSize(new Dimension(50,50));
		southPanel.setPreferredSize(new Dimension(50,50));
		centerPanel.setPreferredSize(new Dimension(300,300));
		headerLabel.setBounds(0,0,200,50);
		mlabel.setBounds(20,100,20,20);
		clabel.setBounds(20,150,20,20);
		m.setBounds(50,100,50,20);
		c.setBounds(50,150,50,20);
		answer.setBounds(50,180,90,20);
		header.setBounds(10,230,1000,100);
		range.setBounds(10,250,1000,200);
		domain.setBounds(10,280,1000,100);
		xint.setBounds(10,310,1000,200);
		yint.setBounds(10,340,1000,200);
		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(c);
		centerPanel.add(m);
		centerPanel.add(clabel);
		centerPanel.add(mlabel);
		centerPanel.add(answer);
		centerPanel.add(range);
		centerPanel.add(domain);
		centerPanel.add(header);

		centerPanel.add(xint);
		centerPanel.add(yint);
		this.add(redPanel,BorderLayout.NORTH);
		this.add(eastPanel,BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		this.add(southPanel,BorderLayout.SOUTH);
		this.add(centerPanel,BorderLayout.CENTER);
		//this.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==answer) {
			try {
				this.cValue = Double.parseDouble(this.c.getText());
				this.mValue = Double.parseDouble(this.m.getText());
				this.x= this.cValue / this.mValue;
				this.y = this.cValue;
				header.setText("y=" + m.getText()+ "x+"+ c.getText());
				if(mValue ==0) {
					range.setText("This is not a linear function, it a horizontal straight line through "+ c.getText());
					domain.setText("Domain:\nDomain for linear function is always x€{-∞,∞} unless we are in an interval");
					header.setVisible(true);
					range.setVisible(true);
				}
				else {
					range.setText("Range:Range for linear function is always y€{-∞,∞} unless we are in an interval" );
					domain.setText("Domain:Domain for linear function is always x€{-∞,∞} unless we are in an interval");
					xint.setText("X-intecept is: "+ x);
					yint.setText("Y-intecept is: "+ y);
					xint.setVisible(true);
					yint.setVisible(true);
					header.setVisible(true);
					range.setVisible(true);
					domain.setVisible(true);
					
				}
				
			}
			catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Please enter a real number", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
			}
			
			
	
		}
	}

	public static void main(String[] args) {

			new Linear();
	}

	

}
