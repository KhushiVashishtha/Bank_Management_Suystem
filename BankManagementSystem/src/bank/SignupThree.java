package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener {

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton b1, b2;
	String formno;

	public SignupThree(String formno) {
		this.formno=formno;

		getContentPane().setBackground(Color.LIGHT_GRAY);

		setTitle("New Account Application form-page-III");
		setLayout(null);
		l1 = new JLabel("Page-III Account Details");
		l1.setFont(new Font("arial", Font.BOLD, 25));
		l1.setBounds(280, 40, 400, 40);
		add(l1);

		l2 = new JLabel("Account Type : ");
		l2.setFont(new Font("Ralway", Font.BOLD, 18));
		l2.setBounds(100, 140, 200, 30);
		add(l2);

		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Ralway", Font.BOLD, 16));
		r1.setBackground(Color.LIGHT_GRAY);
		r1.setBounds(100, 180, 160, 30);
		add(r1);

		r2 = new JRadioButton("Fixe Deposit Account");
		r2.setFont(new Font("Ralway", Font.BOLD, 16));
		r2.setBackground(Color.LIGHT_GRAY);
		r2.setBounds(300, 180, 260, 30);
		add(r2);

		r3 = new JRadioButton("Currunt Account");
		r3.setFont(new Font("Ralway", Font.BOLD, 16));
		r3.setBackground(Color.LIGHT_GRAY);
		r3.setBounds(100, 210, 160, 30);
		add(r3);

		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Ralway", Font.BOLD, 16));
		r4.setBackground(Color.LIGHT_GRAY);
		r4.setBounds(300, 210, 270, 30);
		add(r4);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);

		l3 = new JLabel("Card Number : ");
		l3.setFont(new Font("Ralway", Font.BOLD,18));
		l3.setBounds(100, 280, 200, 30);
		add(l3);
		
		l4 = new JLabel("XXXX-XXXX-XXXX-2578 ");
		l4.setFont(new Font("Ralway", Font.BOLD,18));
		l4.setBounds(330, 280, 250, 30);
		add(l4);

		
		l5 = new JLabel("[Your 16-digit Card Number]");
		l5.setFont(new Font("Ralway", Font.BOLD,13));
		l5.setBounds(100, 305, 280, 30);
		add(l5);
		
		l6 = new JLabel("Pin Number");
		l6.setFont(new Font("Ralway", Font.BOLD,18));
		l6.setBounds(100, 350, 280, 30);
		add(l6);
		
		l7 = new JLabel("XXXX");
		l7.setFont(new Font("Ralway", Font.BOLD,18));
		l7.setBounds(330, 350, 280, 30);
		add(l7);
		
		l8 = new JLabel("[Your 4-digit Password]");
		l8.setFont(new Font("Ralway", Font.BOLD,13));
		l8.setBounds(100, 375, 280, 30);
		add(l8);
		
		l9 = new JLabel("Service Required By You . .");
		l9.setFont(new Font("Ralway", Font.BOLD,18));
		l9.setBounds(100, 415, 280, 30);
		add(l9);
		
		c1=new JCheckBox("ATM CARD");
		c1.setFont(new Font("Ralway", Font.BOLD, 16));
		c1.setBackground(Color.LIGHT_GRAY);
		c1.setBounds(100,450, 250, 30);
		add(c1);
		
		c2=new JCheckBox("Network Banking");
		c2.setFont(new Font("Ralway", Font.BOLD, 16));
		c2.setBackground(Color.LIGHT_GRAY);
		c2.setBounds(350,440,250, 30);
		add(c2);
		

		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.LIGHT_GRAY);
		c3.setBounds(350,480, 250, 30);
		add(c3);
		
		c4=new JCheckBox("Email Alerts");
		c4.setFont(new Font("Ralway", Font.BOLD, 16));
		c4.setBackground(Color.LIGHT_GRAY);
		c4.setBounds(100,480, 250, 30);
		add(c4);
		
		
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.DARK_GRAY);
		b1.setBounds(400, 600, 130, 30);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setForeground(Color.white);
		b2.setBackground(Color.DARK_GRAY);
		b2.setBounds(550, 600, 130, 30);
		add(b2);
		b2.addActionListener(this);
		
		
		
		setSize(850, 850);
		setLocation(300, 15);
		setVisible(true);
	}

	

	public static void main(String[] args) {
		new SignupThree("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String atype=null;
		
		if(r1.isSelected()) {
			atype="Saving Account";
		}else if(r2.isSelected()) {
			atype="Fixed Deposit Account";
		}else if(r3.isSelected()) {
			atype="Current Account";
		}else if(r4.isSelected()) {
			atype="Recurring Deposit Account";
		}
		Random random=new Random();
		//Number Generator Logic
		long num1=(random.nextLong()%90000000l)+237839100000000l;
		String cardNum=""+Math.abs(num1);
		
		long num2=(random.nextLong()%9000l+2000l);
		String pinNum=""+Math.abs(num2);
		
		String facility="";
		if(c1.isSelected()) {
			facility=facility+"ATM Card";
		}
		if(c2.isSelected()) {
			facility=facility+"Internet Banking";
		}
		if(c3.isSelected()) {
			facility=facility+"Mobile Banking";
		}
		if(c4.isSelected()) {
			facility=facility+"Email Alerts";
		}
		
		try {
			if(e.getSource()==b1) {
				
				if(atype.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Select the Account Type ");
				}else {
					ConnectionFactory con=new ConnectionFactory();
					String query1="insert into SignupThree values ('"+formno+"','"+atype+"','"+cardNum+"','"+pinNum+"','"+facility+"')";
					String query2="insert into Login values('"+formno+"','"+cardNum+"','"+pinNum+"')";
				con.stmt.executeUpdate(query1);
				con.stmt.executeUpdate(query2);
				JOptionPane.showMessageDialog(null,"Card Number : "+cardNum+"\n PIN : "+pinNum);
				}
				
			}else if (e.getSource()==b2) {
				System.exit(0);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
