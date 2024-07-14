package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

//When J is present before any class that mean that class belong to swing package
public class Login extends JFrame implements ActionListener {

	JLabel lblWelcome, lblCardNumber, lblPinNumber;
	JTextField tfCardNumber;
	JPasswordField pfPinNumber;
	JButton btnLogin, btnClear, btnSingup;

	public Login() {

		setTitle("Bank Management System");
		// To disable to layout of the frame
		setLayout(null);
		lblWelcome = new JLabel("Welcome to Bank Management System");
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 35));
		lblWelcome.setBounds(200, 40, 730, 40);
		add(lblWelcome);

		lblCardNumber = new JLabel("Enter Card Number : ");
		lblCardNumber.setFont(new Font("Arial", Font.BOLD, 25));
		lblCardNumber.setBounds(120, 150, 400, 30);
		add(lblCardNumber);

		tfCardNumber = new JTextField(20);
		tfCardNumber.setBounds(400, 150, 230, 30);
		tfCardNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(tfCardNumber);

		lblPinNumber = new JLabel("Enter PIN Number : ");
		lblPinNumber.setFont(new Font("Arial", Font.BOLD, 25));
		lblPinNumber.setBounds(120, 250, 400, 30);
		add(lblPinNumber);

		pfPinNumber = new JPasswordField(20);
		pfPinNumber.setBounds(400, 250, 230, 30);
		pfPinNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(pfPinNumber);

		btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.gray);
		btnLogin.setForeground(Color.black);

		btnClear = new JButton("Clear");
		btnClear.setBackground(Color.gray);
		btnClear.setForeground(Color.black);

		btnSingup = new JButton("Sign Up	");
		btnSingup.setBackground(Color.gray);
		btnSingup.setForeground(Color.black);

		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(300, 300, 100, 40);
		add(btnLogin);

		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(420, 300, 100, 40);
		add(btnClear);

		btnSingup.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSingup.setBounds(540, 300, 100, 40);
		add(btnSingup);

		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
		btnSingup.addActionListener(this);

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Bank Management System");
		setVisible(true);
		setSize(1000, 700);
		setLocation(200, 80);

	}

	public static void main(String[] args) {

		Login obj = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		try {

			if (ae.getSource() == btnLogin) {
				ConnectionFactory cf = new ConnectionFactory();
				String cardNum = tfCardNumber.getText();
				String pin = pfPinNumber.getText();

				String query = "Select * from Login where cardnumber ='" + cardNum + "' and pin ='"+pin+"'";
				ResultSet rs = cf.stmt.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transaction(pin).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Either card number or pin number is incorrect ");
				}
			} else if (ae.getSource() == btnClear) {

				tfCardNumber.setText("");
				pfPinNumber.setText("");

			} else if (ae.getSource() == btnSingup) {
				this.setVisible(false);
				new Signup();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
