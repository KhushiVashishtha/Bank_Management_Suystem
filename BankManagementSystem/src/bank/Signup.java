package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {

	// Instance Variable
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	JTextField tfName, tfFatherName, tfEmail, tfAddress, tfCity, tfState, tfPin;
	JRadioButton rbnMale, rbnFemale, rbnMarried, rbnUnmarried, rbnOthers;
	JButton btnNext;

	JDateChooser dateChooser;

	Random r = new Random();
	long randNum = r.nextLong() % 9000 + 1000;
	String number = "" + Math.abs(randNum);

	public Signup() {
		setTitle("New Account Application form ");
		setLayout(null);
		l1 = new JLabel("Application Form : " + number);
		l1.setFont(new Font("Raleway", Font.BOLD, 40));
		l1.setBounds(200, 20, 600, 40);
		add(l1);

		l2 = new JLabel("Personal Details of Customer ");
		l2.setFont(new Font("Arial", Font.BOLD, 25));
		l2.setBounds(250, 80, 600, 30);
		add(l2);

		l3 = new JLabel("Your Name : ");
		l3.setFont(new Font("Arial", Font.BOLD, 20));
		l3.setBounds(100, 130, 200, 30);
		add(l3);
		tfName = new JTextField();
		tfName.setFont(new Font("Arial", Font.BOLD, 15));
		tfName.setBounds(300, 130, 300, 30);
		add(tfName);

		l4 = new JLabel("Father Name : ");
		l4.setFont(new Font("Arial", Font.BOLD, 20));
		l4.setBounds(100, 180, 200, 30);
		add(l4);
		tfFatherName = new JTextField();
		tfFatherName.setFont(new Font("Arial", Font.BOLD, 15));
		tfFatherName.setBounds(300, 180, 300, 30);
		add(tfFatherName);

		l5 = new JLabel("Date of Birth : ");
		l5.setFont(new Font("Arial", Font.BOLD, 20));
		l5.setBounds(100, 220, 200, 30);
		add(l5);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(305, 220, 200, 30);
		add(dateChooser);

		l5 = new JLabel("Gender : ");
		l5.setFont(new Font("Arial", Font.BOLD, 20));
		l5.setBounds(100, 260, 200, 30);
		add(l5);

		rbnMale = new JRadioButton("Male");
		rbnMale.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnMale.setBackground(Color.LIGHT_GRAY);
		rbnMale.setBounds(300, 260, 100, 30);
		add(rbnMale);

		rbnFemale = new JRadioButton("FeMale");
		rbnFemale.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnFemale.setBackground(Color.LIGHT_GRAY);
		rbnFemale.setBounds(410, 260, 250, 30);
		add(rbnFemale);

		ButtonGroup bgGender = new ButtonGroup();
		bgGender.add(rbnMale);
		bgGender.add(rbnFemale);

		l6 = new JLabel("Email Address : ");
		l6.setFont(new Font("Arial", Font.BOLD, 20));
		l6.setBounds(100, 300, 200, 30);
		add(l6);
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Arial", Font.BOLD, 15));
		tfEmail.setBounds(300, 300, 300, 30);
		add(tfEmail);

		l7 = new JLabel("Marital Status : ");
		l7.setFont(new Font("Arial", Font.BOLD, 20));
		l7.setBounds(100, 340, 200, 30);
		add(l7);

		rbnMarried = new JRadioButton("Married");
		rbnMarried.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnMarried.setBackground(Color.LIGHT_GRAY);
		rbnMarried.setBounds(305, 340, 80, 30);
		add(rbnMarried);

		rbnUnmarried = new JRadioButton("Un Married");
		rbnUnmarried.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnUnmarried.setBackground(Color.LIGHT_GRAY);
		rbnUnmarried.setBounds(400, 340, 105, 30);
		add(rbnUnmarried);

		rbnOthers = new JRadioButton("Others");
		rbnOthers.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnOthers.setBackground(Color.LIGHT_GRAY);
		rbnOthers.setBounds(505, 340, 100, 30);
		add(rbnOthers);

		ButtonGroup bgStatus = new ButtonGroup();
		bgStatus.add(rbnMarried);
		bgStatus.add(rbnUnmarried);
		bgStatus.add(rbnOthers);

		l8 = new JLabel("Address : ");
		l8.setFont(new Font("Arial", Font.BOLD, 20));
		l8.setBounds(100, 380, 200, 30);
		add(l8);
		tfAddress = new JTextField();
		tfAddress.setFont(new Font("Arial", Font.BOLD, 15));
		tfAddress.setBounds(300, 380, 300, 30);
		add(tfAddress);

		l9 = new JLabel("City : ");
		l9.setFont(new Font("Arial", Font.BOLD, 20));
		l9.setBounds(100, 420, 200, 30);
		add(l9);
		tfCity = new JTextField();
		tfCity.setFont(new Font("Arial", Font.BOLD, 15));
		tfCity.setBounds(300, 420, 300, 30);
		add(tfCity);

		l10 = new JLabel("Pin Code : ");
		l10.setFont(new Font("Arial", Font.BOLD, 20));
		l10.setBounds(100, 460, 200, 30);
		add(l10);
		tfPin = new JTextField();
		tfPin.setFont(new Font("Arial", Font.BOLD, 15));
		tfPin.setBounds(300, 460, 300, 30);
		add(tfPin);

		l11 = new JLabel("State : ");
		l11.setFont(new Font("Arial", Font.BOLD, 20));
		l11.setBounds(100, 510, 200, 30);
		add(l11);
		tfState = new JTextField();
		tfState.setFont(new Font("Arial", Font.BOLD, 15));
		tfState.setBounds(300, 510, 300, 30);
		add(tfState);

		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial", Font.BOLD, 20));
		btnNext.setForeground(Color.white);
		btnNext.setBackground(Color.GRAY);
		btnNext.setBounds(600, 600, 80, 30);
		add(btnNext);
		btnNext.addActionListener(this);

		l12 = new JLabel("Date : ");
		l12.setFont(new Font("Arial", Font.BOLD, 14));
		l12.setBounds(100, 550, 200, 30);
		add(l12);

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setSize(900, 800);
		setLocation(200, 40);
	}

	public static void main(String[] args) {

		Signup obj = new Signup();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String formNum=number;
		String name=tfName.getText();
		String fname=tfFatherName.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(rbnMale.isSelected()) {
			gender="Male";
		}else if (rbnFemale.isSelected()) {
			gender="Female";
		}
		String email=tfEmail.getText();
		String maritalstatus=null;
		if(rbnMarried.isSelected()) {
			maritalstatus="Married";
		}else if (rbnUnmarried.isSelected()) {
			maritalstatus="Unmarried";
		}else if (rbnOthers.isSelected()) {
			maritalstatus="Other";
		}
		String address=tfAddress.getText();
		String city=tfCity.getText();
		String pin=tfPin.getText();
		String state=tfState.getText();
		
		
		try {
			if(tfName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter Your Name");
			}else {
				ConnectionFactory cf=new ConnectionFactory();
				String query="insert into signup values('"+formNum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalstatus+"','"+address+"','"+pin+"','"+city+"','"+state+"')";
				cf.stmt.executeUpdate(query);
				
				//JOptionPane.showMessageDialog(null,"Congrates");
				//First Signup is hidden
				setVisible(false);
				new SignupTwo(formNum).setVisible(true);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
