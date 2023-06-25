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

public class HomePG extends JFrame implements ActionListener{
	JButton functionB;
	JButton financialB;
	JButton patternB;
	
	JLabel label1;
	JPanel panel1;
	JPanel panel2;
	
	
	HomePG(){
		
		
		//variables
		functionB = new JButton("FUNCTIONS");
		financialB = new JButton("FINANCIAL");
		patternB = new JButton("NUMBER PATTERNS");
		
		panel2 = new JPanel();
		panel1 = new JPanel();
		label1 = new JLabel("MATHS HELP");
		
		//atributes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		functionB.addActionListener(this);
		financialB.addActionListener(this);
		patternB.addActionListener(this);
	
		this.setLayout(new BorderLayout());
		label1.setBounds(100,0,100,100);
		panel2.setLayout(new GridLayout(2,2,0,0));
		label1.setForeground(Color.white);
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.WHITE);
		label1.setFont(new Font(null,Font.BOLD,50));
		functionB.setFocusable(false);
		patternB.setFocusable(false);
		financialB.setFocusable(false);
		
		//size
		this.setSize(500,500);
		panel2.setPreferredSize(new Dimension(300,300));
		panel1.setPreferredSize(new Dimension(100,100));
		
		//add
		panel2.add(functionB);

		panel2.add(patternB);
		panel2.add(financialB);
		panel1.add(label1);
		this.setVisible(true);
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==functionB) {
			new Function();
			this.dispose();
		}else if(e.getSource()==patternB) {
			new Patterns();
			this.dispose();
		}else if(e.getSource()==financialB) {
			new Financial();
			this.dispose();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HomePG();
	}
}
