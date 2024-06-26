package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField pf2;
	JButton b1,b2,b3;
	
	public Login() {
		setTitle("BANK LOAN SYSTEM");
		
		setLayout(null);
		
		l1=new JLabel("Welcome to Bank");
		l1.setFont(new Font("Arial",Font.BOLD,35));
		l1.setBounds(200,40,730,40);
		add(l1);
		
		l2=new JLabel("Enter Card No:");
		l2.setFont(new Font("Tahoma",Font.BOLD,25));
		l2.setBounds(120,150,400,30);
		add(l2);
		
		tf1=new JTextField(20);
		tf1.setBounds(350,150,230,30);
		tf1.setFont(new Font("Tahoma",Font.BOLD,15));
		add(tf1);
		
		l3=new JLabel("Enter Pin:");
		l3.setFont(new Font("Tahoma",Font.BOLD,25));
		l3.setBounds(120,250,400,30);
		add(l3);
		
		pf2=new JPasswordField(20);
		pf2.setBounds(350,250,230,30);
		pf2.setFont(new Font("Tahoma",Font.BOLD,15));
		add(pf2);
			
		
		b1 = new JButton("Login.");
		b1.setBackground(Color.black);
		b1.setBackground(Color.white);
		
		b2 = new JButton("Clear");
		b2.setBackground(Color.black);
		b2.setBackground(Color.white);
		
		b3 = new JButton("Sign Up.");
		b3.setBackground(Color.black);
		b3.setBackground(Color.white);
		
		b1.setFont(new Font("Tahoma",Font.BOLD,15));
		b1.setBounds(300,300,100,40);
		add(b1);

		b2.setFont(new Font("Tahoma",Font.BOLD,15));
		b2.setBounds(300,300,100,40);
		add(b2);

		b3.setFont(new Font("Tahoma",Font.BOLD,15));
		b3.setBounds(500,300,100,40);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		
		
		
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,500);
		setLocation(400,200);
	}
	public static void main(String[] arg)
	{
		Login obj=new Login();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		try {
			if(ae.getSource()==b1)
			{
				
			}
			else if(ae.getSource()==b2)
			{
				tf1.setText("");
				pf2.setText("");
			}
			else if(ae.getSource()==b3)
			{
				this.setVisible(false);
				new Signup();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
