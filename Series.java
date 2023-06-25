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

public class Series extends JFrame implements ActionListener {
	JPanel redPanel; 
	JLabel label;
	JLabel comma1;
	JLabel comma2;
	JLabel comma3;
	JPanel westPanel;
	JPanel eastPanel;
	JPanel southPanel;
	JPanel centerPanel;
	JTextField a;
	JTextField b;
	JTextField c;
	
	JLabel headerLabel;
	
	JLabel nth;
	
	
	JLabel ratio;
	JLabel sum;
	JLabel convergence;
	JLabel header;
	JButton answer;
	double aValue;
	double bValue;
	double cValue;
	double tn;
	double d;
    double s;
    double sd;
    double t4;
    double t5;
	Series(){
		//variables
		redPanel = new JPanel();
		westPanel = new JPanel();
		eastPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel();
		
		answer = new JButton("ANSWER");
		label = new JLabel("MATHS HELP");
		convergence = new JLabel();
		comma1 = new JLabel(",");
		comma2 = new JLabel(",");
		comma3 = new JLabel("...");
		a = new JTextField();
		b = new JTextField();
		c = new JTextField();
		
		headerLabel = new JLabel("Enter the first 3 terms of tn=ar^(n-1)");
	
		nth = new JLabel();
		ratio = new JLabel();
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
		ratio.setVisible(false);
		sum.setVisible(false);
		nth.setVisible(false);
		convergence.setVisible(false);
		this.setVisible(true);
		answer.addActionListener(this);
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
		comma1.setBounds(210,100,100,20);
		comma2.setBounds(330,100,100,20);
		comma3.setBounds(450,100,100,20);
		answer.setBounds(80,140,120,20);
		ratio.setBounds(50,180,1000,20);
		nth.setBounds(50,210,1000,20);
		sum.setBounds(50,240,1000,20);
		convergence.setBounds(50,260,1000,20);
		
		
		//add
		redPanel.add(label);
		centerPanel.add(headerLabel);
		centerPanel.add(a);
		centerPanel.add(b);
		centerPanel.add(c);
		centerPanel.add(comma1);
		centerPanel.add(comma2);
		centerPanel.add(comma3);
		centerPanel.add(answer);
		centerPanel.add(nth);
		centerPanel.add(sum);
		centerPanel.add(ratio);
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
				aValue = Double.parseDouble(a.getText());
				cValue = Double.parseDouble(this.c.getText());
				bValue = Double.parseDouble(this.b.getText());
				d = bValue/aValue;
				tn = aValue -d;
				t4= aValue * Math.pow(d, 3);
				t5 = aValue * Math.pow(d, 4);
				
				nth.setText("nth term: Tn=" +a.getText() +"×" + d + "^(n-1) (with n being term number.)");
				sum.setText("Sum formula: Sn=" + a.getText() + "((" + d + "^n) +1) ÷ (" + d + "-1)");
				ratio.setText("common ratio is " + d + "(using T2/T1=T3/T2)");
				nth.setVisible(true);
				//nextTerm.setVisible(true);
				ratio.setVisible(true);
				if(d >1) {
					sum.setText("Sum formula: Sn=" + a.getText() + "((" + d + "^n) +1) ÷ (" + d + "-1)");
					
					
				}
				
				if((bValue/aValue)!=(cValue/bValue)) {
					JOptionPane.showMessageDialog(null, "This is not an Geometric Sequence", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
				}
			}
			catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Please enter a real n-umber", "MATHS HELP", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
