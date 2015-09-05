import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RegistrationForm extends JFrame{
	private JLabel lblMessage = new JLabel();
	private JLabel lblMouse = new JLabel();
	private JTextField txtName = new JTextField("<Enter your name here>");
	private JTextField txtPhone = new JTextField("+90-",15);
	private JTextField txtEmail = new JTextField();
	private JPasswordField txtPassword = new JPasswordField();
	private JPasswordField txtVerify = new JPasswordField();
	private JRadioButton rbMale = new JRadioButton("Male", true);
	private JRadioButton rbFemale = new JRadioButton("Female");
	private JCheckBox cbEmail = new JCheckBox("Email");
	private JCheckBox cbPhone = new JCheckBox("Phone");
	private JComboBox cmbPhoneType = new JComboBox(new String[]{"Home","Office","Mobile","Other"});
	private JButton btnSubmit = new JButton("SUBMIT");
	
	private ButtonGroup grpGender = new ButtonGroup();
	private JPanel pnlGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel pnlPhone = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel pnlContact = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private boolean isValid = false;
	
	public RegistrationForm()
	{
		super("Registration Form");
		setLayout(new GridLayout(10,2));
		add(new JLabel("Name:"));
		add(txtName);
		add(new JLabel("Password:"));
		add(txtPassword);
		add(new JLabel("Verify Password:"));
		add(txtVerify);
		add(new JLabel("Gender:"));
		add(pnlGender);
		pnlGender.add(rbMale);
		pnlGender.add(rbFemale);
		add(new JLabel("Phone"));
		add(pnlPhone);
		pnlPhone.add(txtPhone);
		pnlPhone.add(cmbPhoneType);
		add(new JLabel("Email:"));
		add(txtEmail);
		add(new JLabel("Preferred Contact:"));
		add(pnlContact);
		pnlContact.add(cbEmail);
		pnlContact.add(cbPhone);
		add(new JLabel());
		add(new JLabel());
		add(lblMouse);
		add(new JLabel());
		add(lblMessage);
		add(btnSubmit);
		
		grpGender.add(rbMale);
		grpGender.add(rbFemale);
		
		mouseHandler h = new mouseHandler();
		this.addMouseListener(h);
		this.addMouseMotionListener(h);
		
		txtVerify.addKeyListener(new keyHandler());
		txtName.addFocusListener(new focusHandler());
		txtPhone.addFocusListener(new focusHandler());
		txtEmail.addFocusListener(new focusHandler());
		btnSubmit.addActionListener(new butonHandler());
		
	}
	
	public class butonHandler implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			
			if(isValid && !txtName.getText().equals("<Enter your name here>"))
				JOptionPane.showMessageDialog(null, getValues());
			else
				JOptionPane.showMessageDialog(null, "Please fill the form correctly");
		
		}

		private String getValues() {
			String output="";
			
			output+="Name: " + txtName.getText();
			String gender = "";
			if(rbMale.isSelected())
				gender =rbMale.getText();
			else
				gender = rbFemale.getText();
			output +="\nGender: " + gender;
			output += "\nPhone: " + txtPhone.getText();
			output+= "-" + cmbPhoneType.getSelectedItem();
			output+= "\nEmail:" +txtEmail.getText();
			String conctact = "";
			if(cbEmail.isSelected())
				conctact+= "Email";
			if(cbPhone.isSelected())
				conctact +="Phone ";
			output += "\nPrefered Contact: " +conctact;
			return output;
		}

	}

	public class focusHandler implements FocusListener
	{
		public void focusGained(FocusEvent arg0) {
			if(arg0.getSource() == txtName 
					&& txtName.getText().equals("<Enter your name here>"))
				txtName.setText("");
		}

		public void focusLost(FocusEvent arg0) {
			if(arg0.getSource() == txtName 
					&& txtName.getText().equals(""))
				txtName.setText("<Enter your name here>");

			if(arg0.getSource() == txtPhone)
				validatePhone();
			if(arg0.getSource() == txtEmail)
				validateEmail();
		}
		private void validatePhone() {
			String phone = txtPhone.getText();
			if(phone.matches("[+]{1}[0-9]{1,4}[-]{1}[0-9]{10}"))
			{lblMessage.setText("");
			isValid=true;
			}
			else
			{lblMessage.setText("Wrong phone format");
			isValid=false;
			}
		}	
		private void validateEmail() {
			String email = txtEmail.getText();
			if(email.length()>50)
			{lblMessage.setText("Long email");
			isValid=false;
			}
			else if(email.matches("[a-z]{1,}[a-z0-9._]{1,}" +
					"[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}"))
			{lblMessage.setText("");
			isValid=true;
			}
			//[a-z]{1,}-->[a-z]+
			//[a-z]+ --> 1 or more
			//[a-z]* --> 0 or more
			else
			{lblMessage.setText("Wrong email format");
			isValid = false;
			}
		}

	}
	
	public class keyHandler extends KeyAdapter
	{
		public void keyReleased(KeyEvent arg0) {
			String pass1 = txtPassword.getText();
			String pass2 = txtVerify.getText();
			if(pass1.compareTo(pass2) == 0)
				lblMessage.setText("");
			else
				lblMessage.setText("Passwords not match");
		}
	}
	
	public class mouseHandler extends MouseAdapter
	{
		public void mouseClicked(MouseEvent arg0) {
			lblMouse.setText("Mouse clicked.");
		}
		public void mouseMoved(MouseEvent arg0) {
			lblMouse.setText("X: " + arg0.getX()
					+ ", Y: " + arg0.getY());
		}
	}
	
	public static void main(String[] args) {
		RegistrationForm frm = new RegistrationForm();
		frm.setVisible(true);
		frm.setSize(550,400);
		frm.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
}

