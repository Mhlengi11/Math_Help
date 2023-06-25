import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cubic extends JFrame implements ActionListener{
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
	
	JLabel aLabel;
	JLabel bLabel;
	JLabel cLabel;
	JLabel dLabel;
	JLabel headerLabel;
	JLabel mlabel;
	JLabel clabel;
	JLabel range;
	String range1;
	JLabel domain;
	String domain1;
	JLabel header;
	JButton answer;
	double aValue;
	double cValue;
	double dValue;
	double bValue;
	//x and y intercepts
	double x1;
	double x2;
	double x3;
	double y;
	double r1, r2, r3, p, q, delta, step1, step2, step3, step4, step5, step6, step7, step8, step9, s1, s2, s3, t1, a1, a2, a3, k;
	//asymptote
	double asymx;
	double asymy;
	
	DecimalFormat df;
	JLabel xint;
	JLabel yint;
	double i;
	double f;
	
	Cubic(){
		//variables
		redPanel = new JPanel();
		westPanel = new JPanel();
		eastPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel();
		mlabel = new JLabel();
		clabel = new JLabel();
		answer = new JButton("ANSWER");
		label = new JLabel("MATHS HELP");
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		d = new JTextField();
		aLabel = new JLabel("a:");
		bLabel = new JLabel("b:");
		cLabel = new JLabel("c:");
		dLabel = new JLabel("d:");
		headerLabel = new JLabel("Enter a,b, c and d of: ax^3+bx^2+cx+d");
		range = new JLabel();
		domain = new JLabel();
		header = new JLabel();
		xint = new JLabel();
		yint = new JLabel();
		df = new DecimalFormat("0.00");
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font(null,Font.BOLD,50));
		mlabel.setFont(new Font(null,Font.PLAIN,10));
		clabel.setFont(new Font(null,Font.PLAIN,10));
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
		headerLabel.setBounds(0,0,1000,50);
		mlabel.setBounds(0,100,20,20);
		clabel.setBounds(0,150,20,20);
		a.setBounds(50,100,50,20);
		b.setBounds(50,130,50,20);
		c.setBounds(50,160,50,20);
		d.setBounds(50,190,50,20);
		aLabel.setBounds(20,100,50,20);
		bLabel.setBounds(20,130,50,20);
		cLabel.setBounds(20,160,50,20);
		dLabel.setBounds(20,190,50,20);
		answer.setBounds(50,220,90,20);
		header.setBounds(10,260,1000,100);
		range.setBounds(10,290,1000,200);
		domain.setBounds(10,320,1000,100);
		xint.setBounds(10,350,1000,200);
		yint.setBounds(10,380,1000,200);

		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(a);
		centerPanel.add(b);
		centerPanel.add(c);
		centerPanel.add(d);
		centerPanel.add(aLabel);
		centerPanel.add(bLabel);
		centerPanel.add(cLabel);
		centerPanel.add(dLabel);
		
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
	}/*
	public void multiple(double r, double s, double t, double w ) {
		w = i;
		for(i = w;i<-w; i--) {
			
			
			f = r*Math.pow(i, 3) + s*Math.pow(i, 2) + t*i + w;
			if(f==0) {
				x1 = i;
				
			}
			
		}
		return i;
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==answer) {
			
			try {
				aValue = Double.parseDouble(this.a.getText());
				cValue = Double.parseDouble(this.c.getText());
				dValue = Double.parseDouble(this.d.getText());
				bValue = Double.parseDouble(this.b.getText());
				if(aValue != 0) {
					if(dValue == 0) {
						x1 = 0;
						step1 = (Math.pow(bValue, 2)) - (4 * aValue * cValue);
						x2 = (-bValue + Math.sqrt(step1)) / (2 * aValue);
						x3 = (-bValue + Math.sqrt(step1)) / (2 * aValue);
						xint.setText("x is " + x1 + "," + x2 + "," + x3);	
					}
					else if(dValue == 0 && bValue == 0 && cValue == 0 ) {
						x1 = 0;
						
						xint.setText("x is " + x1);	
					}
					else if(bValue == 0 && cValue == 0 ) {
						
						x1 = Math.cbrt(-dValue/aValue);
						
						xint.setText("x is " + x1);	
					}
					else if(dValue == 0 && cValue == 0 ) {
						
						x1 = 0;
						x2 = Math.sqrt(-bValue/aValue);
						x3 = -x2;
						
						xint.setText("x is " + x1 + "," + x2 + "," + x3);	
					}
					
					else {
						r1 = (3 * aValue * cValue) - Math.pow(bValue, 2);
						double p = r1 / (3*Math.pow(aValue, 2));
						r2 = 9 * aValue * bValue * cValue;
						r3 =  (27 * (Math.pow(aValue, 2)) * dValue) + (2 * Math.pow(bValue, 3)) - r2;
						double q = r3 / (27 * Math.pow(aValue, 3)); 
						delta = (Math.pow(p, 3) * 4) + (27 * Math.pow(q, 2));
						
						
						if(delta >= 0) {
							System.out.println(delta);
							System.out.println(p);
							System.out.println(q);
							
							step1 = (Math.pow(p, 3) / 27) + (Math.pow(q, 2) / 4);
							step2 = Math.sqrt(step1);
							step3 =(-q / 2);
							step4 = Math.cbrt(step3 + step2);
							step5 = Math.cbrt(step3 - step2);
							System.out.println(step4);
							System.out.println(step5);
							x1 = step4 + step5 -(bValue / (3* aValue));
							
							s1 = dValue / -x1;
							
							k = (cValue - s1) / -x1;
							step3 = Math.pow(k, 2) - (4 * aValue *s1);
							x2 = (-k + Math.sqrt(step3)) / (2 * aValue);
							x3 = (-k - Math.sqrt(step3)) / (2 * aValue);
							System.out.println(s1);
							
							xint.setText("x is " + df.format(x1) + ", " + x2 + ", " + x3);
						
						}/*
						else if(delta == 0) {
							System.out.println(delta);
							System.out.println(p);
							System.out.println(q);
							s2 = (3 * q)/p;
							x1 = s2 - (bValue/ 3 * aValue);
							s1 = dValue / -x1;
							
							k = (cValue - s1) / -x1;
							step3 = Math.pow(k, 2) - (4 * aValue *s1);
							x2 = (-k + Math.sqrt(step3)) / (2 * aValue);
							x3 = (-k - Math.sqrt(step3)) / (2 * aValue);
							System.out.println(s1);
							
							xint.setText("x is "+ + x1 + "," + x2 + "," + x3);
						}*/
						else{
							System.out.println(delta);
							System.out.println(p);
							System.out.println(q);
							System.out.println("r2 is " + r2);
							System.out.println("r3 is " + r3);
							step1 = ((3 * q) / (2 * p)) * (Math.sqrt(3 / -p));
							step2 = Math.acos(step1) / 3;
							System.out.println(step1);
							System.out.println(step2);
							x1 = 2 * Math.sqrt(-p / 3) * Math.cos(step2) -(bValue / (3* aValue));
							
							s1 = dValue / -x1;
							
							k = (cValue - s1) / -x1;
							step3 = Math.pow(k, 2) - (4 * aValue *s1);
							x2 = (-k + Math.sqrt(step3)) / (2 * aValue);
							x3 = (-k - Math.sqrt(step3)) / (2 * aValue);
							System.out.println(s1);
							xint.setText("x is " + df.format(x1) + "," + x2 + "," + x3);
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "x ≠ 0", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
				}
				
				header.setText("y="+ a.getText() + "×^3" + b.getText() + "x^2+" +c.getText() + "x+" + d.getText());
				
				yint.setText("Y-intecept is: "+ d.getText() + "(d is always a y-intercept for cubic function)");
				domain.setText("Domain:Domain for an exponential function is always x€{-∞,∞} unless we are in an interval");
				range.setText("Range:Range for an exponential function is always x€{-∞,∞} unless we are in an interval");
				
				header.setVisible(true);
					
				yint.setVisible(true);
				xint.setVisible(true);
				range.setVisible(true);
				domain.setVisible(true);
				
				
			}
			catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Please enter a real number", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
			}
			
			
			
			
	
		}
	}


	public static void main(String[] args) {
		new Cubic();

	}

}
