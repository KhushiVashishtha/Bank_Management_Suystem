package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener {

	JLabel lblAdditional, lblReligion, lblCategory, lblIncome, lblEducation, lblQualification, lblOcupation, lalPan,
			lblAdhar, lblCitizen, lblAccount, lblFormNum, lblFormValue;
	JButton btnNext;
	JTextField txtPan, txtAdhar;
	JComboBox jcbReligion, jcbCategory, jcbIncome,jcbOccupation, jcbeducation;
	JRadioButton rbnCitizenYes, rbnCitizenNo, rbnAccountYes, rbnAccountNo;
	String formno="";

	public SignupTwo(String formno) {
		this.formno=formno;

		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Application Form Two");
		setLayout(null);
		lblAdditional = new JLabel("Application Form II ");
		lblAdditional.setFont(new Font("Raleway", Font.BOLD, 25));
		lblAdditional.setBounds(320, 20, 600, 40);
		add(lblAdditional);

		lblReligion = new JLabel("Religion : ");
		lblReligion.setFont(new Font("Arial", Font.BOLD, 20));
		lblReligion.setBounds(150, 85, 600, 30);
		add(lblReligion);

		String[] religion = { "Hindu", "Muslim", "Sikh", "Cristian", "Other" };
		jcbReligion = new JComboBox(religion);
		jcbReligion.setBackground(Color.WHITE);
		jcbReligion.setFont(new Font("Arial", Font.BOLD, 14));
		jcbReligion.setBounds(350, 85, 300, 30);
		add(jcbReligion);

		lblCategory = new JLabel("Category : ");
		lblCategory.setFont(new Font("Arial", Font.BOLD, 20));
		lblCategory.setBounds(150, 140, 600, 30);
		add(lblCategory);
		

		String Category []= { "General", "OBC", "SC", "Minority", "Other" };
		jcbCategory = new JComboBox(Category);
		jcbCategory.setBackground(Color.WHITE);
		jcbCategory.setFont(new Font("Arial", Font.BOLD, 14));
		jcbCategory.setBounds(350, 140, 300, 30);
		add(jcbCategory);

		lblIncome = new JLabel("Income : ");
		lblIncome.setFont(new Font("Arial", Font.BOLD, 20));
		lblIncome.setBounds(150, 180, 600, 30);
		add(lblIncome);
		

		String[] income = { "Null", "<100000", "<200000", "<300000", "Upto 1000000" };
		jcbIncome = new JComboBox(income);
		jcbIncome.setBackground(Color.WHITE);
		jcbIncome.setFont(new Font("Arial", Font.BOLD, 14));
		jcbIncome.setBounds(350, 180, 300, 30);
		add(jcbIncome);

		lblEducation = new JLabel("Educational ");
		lblEducation.setFont(new Font("Arial", Font.BOLD, 20));
		lblEducation.setBounds(150, 220, 600, 30);
		add(lblEducation);
		
		lblQualification = new JLabel("Qualification : ");
		lblQualification.setFont(new Font("Arial", Font.BOLD, 20));
		lblQualification.setBounds(150, 250, 600, 30);
		add(lblQualification);
		
		String[] education = { "BE/B.tech", "ME/M.tech", "BCA", "MCA", "Diploma(IT)" };
		jcbeducation = new JComboBox(education);
		jcbeducation.setBackground(Color.WHITE);
		jcbeducation.setFont(new Font("Arial", Font.BOLD, 14));
		jcbeducation.setBounds(350, 235, 300, 30);
		add(jcbeducation);

		

		lblOcupation = new JLabel("Occupation : ");
		lblOcupation.setFont(new Font("Arial", Font.BOLD, 20));
		lblOcupation.setBounds(150, 305, 600, 30);
		add(lblOcupation);
		
		String[] occupation = { "SDE-I", "SDE-II", "SDE-III", "TL", "Manager" };
		jcbOccupation = new JComboBox(occupation);
		jcbOccupation.setBackground(Color.WHITE);
		jcbOccupation.setFont(new Font("Arial", Font.BOLD, 14));
		jcbOccupation.setBounds(350, 305, 300, 30);
		add(jcbOccupation);


		lalPan = new JLabel("PAN Number : ");
		lalPan.setFont(new Font("Arial", Font.BOLD, 20));
		lalPan.setBounds(150, 345, 600, 30);
		add(lalPan);
		
		txtPan = new JTextField();
		txtPan.setFont(new Font("Arial", Font.BOLD, 15));
		txtPan.setBounds(350, 345, 300, 30);
		add(txtPan);

		lblAdhar = new JLabel("Adhar Number : ");
		lblAdhar.setFont(new Font("Arial", Font.BOLD, 20));
		lblAdhar.setBounds(150, 385, 600, 30);
		add(lblAdhar);
		
		txtAdhar = new JTextField();
		txtAdhar.setFont(new Font("Arial", Font.BOLD, 15));
		txtAdhar.setBounds(350, 385, 300, 30);
		add(txtAdhar);

		lblCitizen = new JLabel("Senior Citizen : ");
		lblCitizen.setFont(new Font("Arial", Font.BOLD, 20));
		lblCitizen.setBounds(150, 430, 600, 30);
		add(lblCitizen);
		
		rbnCitizenYes = new JRadioButton("Yes");
		rbnCitizenYes.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnCitizenYes.setBackground(Color.LIGHT_GRAY);
		rbnCitizenYes.setBounds(350, 430, 100, 30);
		add(rbnCitizenYes);

		rbnCitizenNo = new JRadioButton("No");
		rbnCitizenNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnCitizenNo.setBackground(Color.LIGHT_GRAY);
		rbnCitizenNo.setBounds(450, 430, 600, 30);
		add(rbnCitizenNo);

		ButtonGroup bgCitizen = new ButtonGroup();
		bgCitizen.add(rbnCitizenYes);
		bgCitizen.add(rbnCitizenNo);

		lblAccount = new JLabel("Existing Account : ");
		lblAccount.setFont(new Font("Arial", Font.BOLD, 20));
		lblAccount.setBounds(150, 465, 600, 30);
		add(lblAccount);
		
		rbnAccountYes = new JRadioButton("Yes");
		rbnAccountYes.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnAccountYes.setBackground(Color.LIGHT_GRAY);
		rbnAccountYes.setBounds(350, 465, 100, 30);
		add(rbnAccountYes);

		rbnAccountNo = new JRadioButton("No");
		rbnAccountNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbnAccountNo.setBackground(Color.LIGHT_GRAY);
		rbnAccountNo.setBounds(450, 465, 600, 30);
		add(rbnAccountNo);

		ButtonGroup bgAccount = new ButtonGroup();
		bgAccount.add(rbnCitizenYes);
		bgAccount.add(rbnCitizenNo);

		


		
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial", Font.BOLD, 20));
		btnNext.setForeground(Color.white);
		btnNext.setBackground(Color.DARK_GRAY);
		btnNext.setBounds(600, 600, 80, 30);
		add(btnNext);
		btnNext.addActionListener(this);


		setVisible(true);
		setSize(800, 700);
		setLocation(200, 40);

	}

	public static void main(String[] args) {
		SignupTwo st = new SignupTwo("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String religion=(String) jcbReligion.getSelectedItem();
		String category=(String) jcbCategory.getSelectedItem();
		String income=(String) jcbIncome.getSelectedItem();
		String education=(String) jcbeducation.getSelectedItem();
		String occupation=(String) jcbOccupation.getSelectedItem();
		String pan=txtPan.getText();
		String adhar=txtAdhar.getText();
		String scitizen="";
		if(rbnCitizenYes.isSelected()) {
			scitizen="Yes";
		}
		else if(rbnCitizenNo.isSelected()){
			scitizen="No";
			
		}
		
		String eaccount="";
		if(rbnAccountYes.isSelected()) {
			scitizen="Yes";
		}
		else if(rbnAccountNo.isSelected()){
			scitizen="No";
			
		}
		try {
			ConnectionFactory cf=new ConnectionFactory();
			String query="insert into signuptwo values ('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eaccount+"')";
		cf.stmt.executeUpdate(query);
		JOptionPane.showMessageDialog(null,"Congrates");
		new SignupThree(formno).setVisible(true);
		setVisible(false);
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
