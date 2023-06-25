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

public class Patterns extends JFrame implements ActionListener {
	JLabel label1;
	JLabel label2;
	//buttons
	JButton arithmetic;
	JButton Quadratic;
	JButton geometric;
	JButton series;

	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	Patterns(){
		//variables
		arithmetic= new JButton("1. Arithmetic Sequence");
		Quadratic = new JButton("2. Quadratic Sequence");
		geometric =new JButton("3. Geometric Sequence");
		//series = new JButton("4. Geometric Series");
		label1 = new JLabel("MATHS HELP");
		label2 = new JLabel("Number Patterns");
		
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
		arithmetic.setFocusable(false);
		geometric.setFocusable(false);
		Quadratic.setFocusable(false);
		arithmetic.setBackground(Color.white);
		Quadratic.setBackground(Color.white);
		geometric.setBackground(Color.white);
		this.setLayout(new BorderLayout());
		arithmetic.addActionListener(this);
		geometric.addActionListener(this);
		Quadratic.addActionListener(this);
		
		panel4.setLayout(new GridLayout(4,1));
		this.setVisible(true);
		
		//size
		this.setSize(500,500);
		label1.setBounds(100,0,100,100);
		/*
		label2.setBounds(30,100,1000,100);
		arithmetic.setBounds(20,300,500,100);
		Quadratic.setBounds(20,600,500,100);
		geometric.setBounds(20,900,500,100);
		*/
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(300,300));
		panel5.setPreferredSize(new Dimension(50,50));
		
		//ADD
		panel3.add(label1);
		panel4.add(label2);
		panel4.add(arithmetic);
		panel4.add(Quadratic);
		panel4.add(geometric);
		this.add(panel3,BorderLayout.NORTH);
		this.add(panel4,BorderLayout.CENTER);
		this.add(panel5,BorderLayout.EAST);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==arithmetic) {
			this.dispose();
			new Arithmetic();
		}
		else if(e.getSource()==Quadratic) {
			new Quadratic();
			this.dispose();
		}
		else if(e.getSource()==geometric) {
			new Geometric();
			this.dispose();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Patterns();
	}

}
