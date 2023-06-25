import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Curve extends JFrame implements ActionListener {
	JPanel redPanel; 
	JLabel label;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField a;
	JTextField b;
	JTextField c;
	JLabel aLabel;
	JLabel bLabel;
	JLabel cLabel;
	
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
	double bValue;
	double cValue;
	//x and y intercepts
	double x1;
	double x2;
	double y;
	//turning point
	double tpx;
	double tpy;
	JLabel tpxLabel;
	JLabel tpyLabel;
	
	JLabel xint;
	JLabel yint;
	String mtf;
	String ctf;
	
	Curve(){
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
		b = new JTextField();
		c = new JTextField();
		a = new JTextField();
		aLabel = new JLabel("a:");
		bLabel = new JLabel("b:");
		cLabel = new JLabel("c:");
	
		headerLabel = new JLabel("Enter a,b and c of: y=ax^2+bx+c");
		tpxLabel = new JLabel();
		tpyLabel = new JLabel();
		range = new JLabel();
		domain = new JLabel();
		header = new JLabel();
		xint = new JLabel();
		yint = new JLabel();
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font(null,Font.BOLD,50));
		
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
		tpxLabel.setVisible(false);
		tpxLabel.setVisible(false);
		this.setVisible(true);
		//function
		clabel.setText("c:");
		//cLabel.setFont(new Font(null,Font.BOLD,10));
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
		aLabel.setBounds(10,100,50,20);
		bLabel.setBounds(10,130,50,20);
		cLabel.setBounds(10,160,50,20);
		answer.setBounds(50,190,90,20);
		header.setBounds(10,230,1000,100);
		range.setBounds(10,250,1000,200);
		domain.setBounds(10,280,1000,100);
		xint.setBounds(10,310,1000,200);
		yint.setBounds(10,340,1000,200);
		tpxLabel.setBounds(10,370,1000,200);
		tpyLabel.setBounds(10,400,1000,200);
		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(a);
		centerPanel.add(b);
		centerPanel.add(c);
		centerPanel.add(aLabel);
		centerPanel.add(bLabel);
		centerPanel.add(cLabel);
		centerPanel.add(tpxLabel);
		centerPanel.add(tpyLabel);
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
				this.aValue = Double.parseDouble(this.a.getText());
				this.cValue = Double.parseDouble(this.c.getText());
				this.bValue = Double.parseDouble(this.b.getText());
				x1= (-bValue+Math.sqrt(Math.pow(bValue, 2)-4*aValue*cValue))/2*aValue;
				x2= (-bValue-Math.sqrt(Math.pow(bValue, 2)-4*aValue*cValue))/2*aValue;
				tpx= -bValue/(2*aValue);
				tpy = aValue*Math.pow(tpx, 2)+ bValue*tpx + cValue; 
				this.y = cValue;
				header.setText("y=" + a.getText()+ "x^2+"+ b.getText()+ "x"+ c.getText());
				xint.setText("X-intecept is: "+ x1 + " or " + x2 + "(using x=(-b±√(b^2-4ac))/2a after we've let y=0)" );
				yint.setText("Y-intecept is: "+ y + "(after we've let x=0)");
				domain.setText("Domain:Domain for parabola function is always x€{-∞,∞} unless we are in an interval");
				tpxLabel.setText("x-coordinate for turning point is " + tpx);
				tpyLabel.setText("y-coordinate for turning point is " + tpy + "(we got it by substituting x into original equation)");
				header.setVisible(true);
				tpxLabel.setVisible(true);
				tpyLabel.setVisible(true);
				if(aValue >= 0) {
					range.setText("Range: when a≥0, range is y≥"+ tpy);
					yint.setVisible(true);
					xint.setVisible(true);
					range.setVisible(true);
					domain.setVisible(true);
					
				}
				else if(aValue < 0){
					range.setText("Range: when a<0, range is y≤"+ tpy);
					xint.setVisible(true);
					yint.setVisible(true);
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
		new Curve();

	}

}
