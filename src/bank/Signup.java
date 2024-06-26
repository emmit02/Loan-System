package bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {

		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
		JTextField tfname,tffather,temail,taddress,tcity,tpin,tstate;
		JRadioButton rmale,rfemale,rmarried,runmarried,rothers;
		JButton bnext;
		
		JDateChooser dateChooser;
		
		Random r= new Random();
		long randnum=r.nextLong()%9000+1000;
		String number=""+Math.abs(randnum);
		
	public Signup()
	{
		setTitle("New Loan Application Form");
		setLayout(null);
		
		l1=new JLabel("New Application Form: "+number);
		l1.setFont(new Font("Raleway", Font.BOLD,40));
		l1.setBounds(150,20,600,40);
		add(l1);
		
		l2=new JLabel("Personal Details of Customer");
		l2.setFont(new Font("Arial", Font.BOLD,25));
		l2.setBounds(250,80,600,30);
		add(l2);
		
		l3=new JLabel("Loan amount:");
		l3.setFont(new Font("Arial", Font.BOLD,22));
		l3.setBounds(100,130,200,30);
		add(l3);
		
		tfname=new JTextField(15);
		tfname.setFont(new Font("Arial",Font.BOLD,15));
		tfname.setBounds(305,130,300,30);
		add(tfname);
		
		
		l4=new JLabel("Your Name:");
		l4.setFont(new Font("Arial", Font.BOLD,22));
		l4.setBounds(100,180,200,30);
		add(l4);
		
		tffather=new JTextField(15);
		tffather.setFont(new Font("Arial",Font.BOLD,15));
		tffather.setBounds(305,180,300,30);
		add(tffather);
		
		l5=new JLabel("Date of Birth:");
		l5.setFont(new Font("Raleway", Font.BOLD,20));
		l5.setBounds(100,230,200,30);
		add(l5);
		
		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(200,0,0));
		dateChooser.setBounds(305, 230,200,30);
		add(dateChooser);
		
		
		l6=new JLabel("Gender:");
		l6.setFont(new Font("Raleway", Font.BOLD,20));
		l6.setBounds(100,280,200,30);
		add(l6);
		
		rmale=new JRadioButton("Male");
		rmale.setFont(new Font("Tahoma", Font.BOLD,14));
		rmale.setBackground(Color.white);
		rmale.setBounds(305,280,100,30);
		add(rmale);

		rfemale=new JRadioButton("Female");
		rfemale.setFont(new Font("Tahoma", Font.BOLD,14));
		rfemale.setBackground(Color.white);
		rfemale.setBounds(410,280,100,30);
		add(rfemale);

		
		l7=new JLabel("Email Address:");
		l7.setFont(new Font("Raleway", Font.BOLD,20));
		l7.setBounds(100,330,200,30);
		add(l7);
		
		temail=new JTextField(15);
		temail.setFont(new Font("Arial",Font.BOLD,15));
		temail.setBounds(305,330,300,30);
		add(temail);
		
		
		l8=new JLabel("Marital Status:");
		l8.setFont(new Font("Raleway", Font.BOLD,20));
		l8.setBounds(100,370,200,30);
		add(l8);
		
		rmarried=new JRadioButton("Married");
		Font f = new Font("Tahoma", Font.BOLD,14);
		rmarried.setFont(f);
		rmarried.setBackground(Color.white);
		rmarried.setBounds(305,370,100,30);
		add(rmarried);
		
		runmarried=new JRadioButton("Unmarried");
		//Font f = new Font("Tahoma", Font.BOLD,14);
		runmarried.setFont(f);
		runmarried.setBackground(Color.white);
		runmarried.setBounds(410,370,120,30);
		add(runmarried);
		
		rothers=new JRadioButton("Others");
		//Font f = new Font("Tahoma", Font.BOLD,14);
		rothers.setFont(f);
		rothers.setBackground(Color.white);
		rothers.setBounds(505,370,100,30);
		add(rothers);
		
		ButtonGroup bgStatus=new ButtonGroup();
		bgStatus.add(rmarried);
		bgStatus.add(runmarried);
		bgStatus.add(rothers);
		
		
		
		l9=new JLabel("Address:");
		l9.setFont(new Font("Raleway", Font.BOLD,20));
		l9.setBounds(100,410,200,30);
		add(l9);
		
		
		taddress=new JTextField(15);
		taddress.setFont(new Font("Arial",Font.BOLD,15));
		taddress.setBounds(305,410,300,30);
		add(taddress);
		
		
		l10=new JLabel("City:");
		l10.setFont(new Font("Raleway", Font.BOLD,20));
		l10.setBounds(100,460,200,30);
		add(l10);
		
		tcity=new JTextField(15);
		tcity.setFont(new Font("Arial",Font.BOLD,15));
		tcity.setBounds(305,460,300,30);
		add(tcity);
		
		
		l11=new JLabel("Pin Code:");
		l11.setFont(new Font("Raleway", Font.BOLD,20));
		l11.setBounds(100,510,200,30);
		add(l11);
		
		tpin=new JTextField(15);
		tpin.setFont(new Font("Arial",Font.BOLD,15));
		tpin.setBounds(305,510,300,30);
		add(tpin);
		
		
		l12=new JLabel("State:");
		l12.setFont(new Font("Raleway", Font.BOLD,20));
		l12.setBounds(100,560,200,30);
		add(l12);
		
		tstate=new JTextField(15);
		tstate.setFont(new Font("Arial",Font.BOLD,15));
		tstate.setBounds(305,560,300,30);
		add(tstate);
		
		bnext=new  JButton("NEXT");
		bnext.setFont(f);
		bnext.setBackground(Color.black);
		bnext.setForeground(Color.white);
		bnext.setBounds(600,600,80,30);
		add(bnext);
		bnext.addActionListener(this);
		
		l13=new JLabel("Date:");
		l13.setFont(new Font("Raleway", Font.BOLD,20));
		l13.setBounds(100,610,200,30);
		add(l13);
		
		l14=new JLabel("Month:");
		l14.setFont(new Font("Raleway", Font.BOLD,20));
		l14.setBounds(100,660,200,30);
		add(l14);
		
		l15=new JLabel("Year:");
		l15.setFont(new Font("Raleway", Font.BOLD,20));
		l15.setBounds(100,720,200,30);
		add(l15);
		
		 
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup obj=new Signup();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String formnum=number;
		// TODO Auto-generated method stub
		String name=tfname.getText();
		String fname=tffather.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(rmale.isSelected())
		{
			gender="Male";
		}
		else if(rfemale.isSelected())
		{
			gender="Female";
		}
		
		
		String email=temail.getText();
		String maritalStatus=null;
		
		if(rmarried.isSelected())
		{
			maritalStatus="Married";
		}
		
		else if(runmarried.isSelected())
		{
			maritalStatus="Unmarried";
		}
		
		else if(rothers.isSelected())
		{
			maritalStatus="others";
		}
		
		String address=taddress.getText();
		String city=tcity.getText();
		String pin=tpin.getText();
		String state=tstate.getText();
		
		try 
		{
			
			if(tfname.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Your Name");
			}
			else 
			{
				Connectiondriver cf= new Connectiondriver();
				String query="Insert into Signup Values('"+formnum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
				cf.stmt.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null,"Your Loan Application is Applied, Successfully!");
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
