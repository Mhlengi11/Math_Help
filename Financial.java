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

public class Financial extends JFrame implements ActionListener {
	JLabel label1;
	JLabel label2;
	//buttons
	JButton compound;
	JButton simple;
	JButton simpleDecay;
	JButton futureValue;
	JButton presentValue;
	JButton compoundDecay;

	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	Financial(){
		//variables
		simple = new JButton("1. Simple intrest");
		compound = new JButton("2. Compound intrest");
		simpleDecay =new JButton("3. Simple Decay");
		compoundDecay = new JButton("4. Compound Decay");
		futureValue = new JButton("5. Future Value");
		presentValue = new JButton("6. Present Value");
		label1 = new JLabel("MATHS HELP");
		label2 = new JLabel("Financial Mathematics");
		
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
		simple.setFocusable(false);
		simpleDecay.setFocusable(false);
		compoundDecay.setFocusable(false);
		futureValue.setFocusable(false);
		presentValue.setFocusable(false);
		compound.setFocusable(false);
		
		simple.setBackground(Color.white);
		compoundDecay.setBackground(Color.white);
		simpleDecay.setBackground(Color.white);
		compound.setBackground(Color.white);
		presentValue.setBackground(Color.white);
		futureValue.setBackground(Color.white);
		this.setLayout(new BorderLayout());
		simple.addActionListener(this);
		simpleDecay.addActionListener(this);
		compoundDecay.addActionListener(this);
		compound.addActionListener(this);
		futureValue.addActionListener(this);
		presentValue.addActionListener(this);
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
		panel4.add(simple);
		panel4.add(compound);
		panel4.add(simpleDecay);
		panel4.add(compoundDecay);
		panel4.add(futureValue);
		panel4.add(presentValue);
		
		this.add(panel3,BorderLayout.NORTH);
		this.add(panel4,BorderLayout.CENTER);
		this.add(panel5,BorderLayout.EAST);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==simple) {
			this.dispose();
			new Question();
			
		}
		else if(e.getSource()==compound) {
			this.dispose();
			new CGrowthQ();
		}
		else if(e.getSource()==presentValue) {
			this.dispose();
			new PresentValueQ();
		}
		else if(e.getSource()== futureValue) {
			this.dispose();
			new FutureValueQ();
		}
		else if(e.getSource()== compoundDecay) {
			this.dispose();
			new CDecayQ();
		}
	}


	public static void main(String[] args) {
		new Financial();

	}

}
