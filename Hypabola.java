
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

public class Hypabola extends JFrame implements ActionListener {
	JPanel redPanel; 
	JLabel label;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField a;
	JTextField p;
	JTextField q;
	JLabel aLabel;
	JLabel pLabel;
	JLabel qLabel;
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
	double pValue;
	double qValue;
	//x and y intercepts
	double x;
	double y;
	//asymptote
	double asymx;
	double asymy;
	JLabel asymxLabel;
	JLabel asymyLabel;
	
	JLabel xint;
	JLabel yint;
	String mtf;
	String ctf;
	
	Hypabola(){
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
		p = new JTextField();
		q = new JTextField();
		aLabel = new JLabel("a:");
		pLabel = new JLabel("p:");
		qLabel = new JLabel("q:");
		headerLabel = new JLabel("Enter a, p and q of: a/(x+p)+q");
		asymxLabel = new JLabel();
		asymyLabel = new JLabel();
		range = new JLabel();
		domain = new JLabel();
		header = new JLabel();
		xint = new JLabel();
		yint = new JLabel();
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
		asymxLabel.setVisible(false);
		asymxLabel.setVisible(false);
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
		p.setBounds(50,130,50,20);
		q.setBounds(50,160,50,20);
		aLabel.setBounds(10,100,50,20);
		pLabel.setBounds(10,130,50,20);
		qLabel.setBounds(10,160,50,20);
		answer.setBounds(50,190,90,20);
		header.setBounds(10,230,1000,100);
		range.setBounds(10,250,1000,200);
		domain.setBounds(10,280,1000,100);
		xint.setBounds(10,310,1000,200);
		yint.setBounds(10,340,1000,200);
		asymxLabel.setBounds(10,370,1000,200);
		asymyLabel.setBounds(10,400,1000,200);
		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(a);
		centerPanel.add(p);
		centerPanel.add(q);
		centerPanel.add(aLabel);
		centerPanel.add(pLabel);
		centerPanel.add(qLabel);
		centerPanel.add(asymxLabel);
		centerPanel.add(asymyLabel);
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
				this.pValue = Double.parseDouble(this.p.getText());
				this.qValue = Double.parseDouble(this.q.getText());
				x= (aValue/qValue) + pValue;
				y = (aValue/pValue)+qValue;
				asymx= -pValue;
				asymy= qValue;
				header.setText("y=" + a.getText()+ "/(x+"+ p.getText()+ ")+"+ q.getText());
				xint.setText("X-intecept is: "+ x + "(using a÷q -p after we've let y=0)" );
				yint.setText("Y-intecept is: "+ y + "(after we've let x=0)");
				domain.setText("Domain: domain is x€Ʀ, x≠" + -pValue);
				asymxLabel.setText("Equation of the vertical asymptote x=" + asymx + "(using x=-p)" );
				asymyLabel.setText("Equation of the horizontal asymptote y="  + asymy + "(using y=q)");
				header.setVisible(true);
				asymxLabel.setVisible(true);
				asymyLabel.setVisible(true);
				range.setText("Range: range is y€Ʀ, y≠" + qValue);
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
		new Hypabola();

	}

}
