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

public class Function extends JFrame implements ActionListener {
	JLabel label1;
	//buttons
	JButton linear;
	JButton parabola;
	JButton hyperbola;
	JButton exponential;
	JButton cubic;
	//panels
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	Function(){
		//variables
		linear= new JButton("Linear Function");
		parabola = new JButton("Parabolic Function");
		hyperbola=new JButton("Hyperbolic Function");
		cubic = new JButton("Cubic Function");
		exponential =new JButton("Exponential function");
		label1 = new JLabel("MATHS HELP");
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		//attributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1.setFont(new Font(null,Font.BOLD,50));
		label1.setForeground(Color.white);
		panel3.setBackground(Color.red);
		panel4.setBackground(Color.gray);
		panel5.setBackground(Color.white);
		this.setLayout(new BorderLayout());
		linear.addActionListener(this);
		hyperbola.addActionListener(this);
		cubic.addActionListener(this);
		parabola.addActionListener(this);
		exponential.addActionListener(this);
		panel4.setLayout(new GridLayout(4,1));
		this.setVisible(true);
		cubic.setFocusable(false);
		exponential.setFocusable(false);
		parabola.setFocusable(false);
		linear.setFocusable(false);
		hyperbola.setFocusable(false);
		
		//size
		this.setSize(500,500);
		label1.setBounds(100,0,100,100);
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(300,300));
		panel5.setPreferredSize(new Dimension(50,50));
		
		//ADD
		panel3.add(label1);
		panel4.add(linear);
		panel4.add(cubic);
		panel4.add(parabola);
		panel4.add(hyperbola);
		this.add(panel3,BorderLayout.NORTH);
		this.add(panel4,BorderLayout.CENTER);
		this.add(panel5,BorderLayout.EAST);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==linear) {
			this.dispose();
			new Linear();
		}
		else if(e.getSource()==parabola) {
			this.dispose();
			new Curve();
		}
		else if(e.getSource()==hyperbola) {
			new Hypabola();
			this.dispose();
		}
		else if(e.getSource() == exponential) {
			new Exponential();
			this.dispose();
		}else if(e.getSource() == cubic) {
			new Cubic();
			this.dispose();
		}
	}
}
