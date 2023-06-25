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

public class Quadratic extends JFrame implements ActionListener {
	JPanel redPanel; 
	JLabel label;
	JLabel comma1;
	JLabel comma2;
	JLabel comma3;
	JLabel comma4;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField a;
	JTextField b;
	JTextField c;
	JTextField d;
	
	JLabel headerLabel;
	JLabel nextTerm;
	JLabel nth;
	
	JLabel difference;
	JLabel sum;
	String domain1;
	JLabel header;
	JButton answer;
	double aValue;
	double bValue;
	double cValue;
	double dValue;
	double fd1;
	double fd2;
	double fd3;
	double sd1;
	double sd2;
	
	double z1;
    double z2;
    double z3;
    double t5;
    double t6;
	Quadratic(){
		//variables
		redPanel = new JPanel();
		westPanel = new JPanel();
		eastPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel();
		
		answer = new JButton("ANSWER");
		label = new JLabel("MATHS HELP");
		nextTerm = new JLabel();
		comma1 = new JLabel(",");
		comma2 = new JLabel(",");
		comma4 = new JLabel(",");
		comma3 = new JLabel("...");
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		d = new JTextField();
		headerLabel = new JLabel("Enter the first 4 terms of Tn=an^2+bn+c");
	
		nth = new JLabel();
		difference = new JLabel();
		sum = new JLabel();
		header = new JLabel();
		answer = new JButton();
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
		centerPanel.setLayout(null);
		this.setLayout(new BorderLayout());
		difference.setVisible(false);
		sum.setVisible(false);
		nth.setVisible(false);
		this.setVisible(true);
		//size
		label.setBounds(100,0,100,100);
		this.setSize(500,500);
		answer.setText("ANSWER");
		
		redPanel.setPreferredSize(new Dimension(100,100));
		westPanel.setPreferredSize(new Dimension(50,50));
		eastPanel.setPreferredSize(new Dimension(50,50));
		southPanel.setPreferredSize(new Dimension(50,50));
		centerPanel.setPreferredSize(new Dimension(300,300));
		
		headerLabel.setBounds(0,0,1000,50);
		
		a.setBounds(100,100,100,20);
		b.setBounds(220,100,100,20);
		c.setBounds(340,100,100,20);
		d.setBounds(460,100,100,20);
		comma1.setBounds(210,100,100,20);
		comma2.setBounds(330,100,100,20);
		comma4.setBounds(450,100,100,20);
		comma3.setBounds(560,100,100,20);
		answer.setBounds(80,140,120,20);
		difference.setBounds(50,180,1000,20);
		nth.setBounds(50,210,1000,20);
		nextTerm.setBounds(50,240,1000,20);
		answer.addActionListener(this);
		
		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(a);
		centerPanel.add(b);
		centerPanel.add(c);
		centerPanel.add(d);
		centerPanel.add(comma1);
		centerPanel.add(comma2);
		centerPanel.add(comma3);
		centerPanel.add(comma4);
		centerPanel.add(answer);
		centerPanel.add(nth);
		centerPanel.add(nextTerm);
		centerPanel.add(difference);
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
				aValue = Double.parseDouble(this.a.getText());
				cValue = Double.parseDouble(this.c.getText());
				bValue = Double.parseDouble(this.b.getText());
				dValue = Double.parseDouble(this.d.getText());
			
				if(sd1!=sd2) {
					JOptionPane.showMessageDialog(null, "This is not an Quadratic Sequence", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
				}else {
					fd1 = bValue - aValue;
					fd2 = cValue - bValue;
					fd3 = dValue - cValue;
					sd1 = fd2 - fd1;
					sd2 = fd3 - fd2;
					z1 = sd1/2;
					z2= fd1-(3*z1);
					z3 = aValue - z2 - z1;
					t5 = (z1 * Math.pow(5, 2)) + (z2 * 5) + z3;
					t6 = (z1 * Math.pow(6, 2)) + (z2 * 6) + z3;
					nth.setText("nth term: Tn=" + z1 + "n^2+(" + z2 + ")n+" + z3);
					nextTerm.setText("The next 2 terms are " + t5 + " and " + t6 + ("(using 5 and 6 as n, respectively)"));
					//difference.setText("difference is " + d + "(using T2-T1=T3-T2)");
					nth.setVisible(true);
					nextTerm.setVisible(true);
					
				}
			}
			catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Please enter a real number", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}


	public static void main(String[] args) {
		new Quadratic();

	}

}
