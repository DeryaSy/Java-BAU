import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import java.util.List;

public class RegistrationForm extends JFrame {

	private JLabel lblName = new JLabel("Name:");
	private JLabel lblPass1 = new JLabel("Password:");
	private JLabel lblPass2 = new JLabel("Verify Password:");
	private JLabel lblGender = new JLabel("Gender:");
	private JLabel lblPhone = new JLabel("Phone:");
	private JLabel lblEmail = new JLabel("Email:");
	private JLabel lblPrefContact = new JLabel("Preferred Contact:");
	private JLabel lblMessage = new JLabel("");
	private JLabel lblMouseXY = new JLabel("");

	private JTextField txtName = new JTextField("<Enter your name here>", 10);
	private JTextField txtPhone = new JTextField("+90", 15);
	private JTextField txtEmail = new JTextField();

	private JPasswordField txtPass1 = new JPasswordField();
	private JPasswordField txtPass2 = new JPasswordField();

	private ButtonGroup rbgGender = new ButtonGroup();
	private JRadioButton rbMale = new JRadioButton("Male", true);
	private JRadioButton rbFemale = new JRadioButton("Female");

	private JCheckBox cbEmail = new JCheckBox("Email");
	private JCheckBox cbPhone = new JCheckBox("Phone");

	private JComboBox comboPhoneType = new JComboBox(new String[]{ "Office", "Home", "Mobile", "Other" });

	private JPanel pnlGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel pnlPhone = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel pnlPrefContact = new JPanel(new FlowLayout(FlowLayout.LEFT));

	private JButton btnSubmit = new JButton("Submit");

	private boolean isValid = false;

	public RegistrationForm() {
		super("Registration Form");
		setLayout(new GridLayout(10, 2));

		// Add components
		add(lblName);
		add(txtName);

		add(lblPass1);
		add(txtPass1);

		add(lblPass2);
		add(txtPass2);

		add(lblGender);
		add(pnlGender);
		rbgGender.add(rbMale);
		rbgGender.add(rbFemale);
		pnlGender.add(rbMale);
		pnlGender.add(rbFemale);

		add(lblPhone);
		add(pnlPhone);
		pnlPhone.add(txtPhone);
		pnlPhone.add(comboPhoneType);

		add(lblEmail);
		add(txtEmail);

		add(lblPrefContact);
		add(pnlPrefContact);
		pnlPrefContact.add(cbEmail);
		pnlPrefContact.add(cbPhone);

		add(new JLabel());
		add(new JLabel());
		add(lblMouseXY);
		add(new JLabel());
		add(lblMessage);
		add(btnSubmit);
		txtPass2.addKeyListener(new KeyHandler());
		txtName.addFocusListener(new FocusHandler());
		txtPhone.addFocusListener(new FocusHandler());
		txtEmail.addFocusListener(new FocusHandler());
		btnSubmit.addActionListener(new ButtonHandler());
		this.addMouseListener(new MouseHandler());
		this.addMouseMotionListener(new MouseHandler());
	}

	public class MouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			lblMouseXY.setText("Mouse clicked.");
		}

		public void mouseMoved(MouseEvent e) {
			lblMouseXY.setText("X: " + e.getX() +
					", Y: " + e.getY());
		}

	}

	public class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (isValid)
				JOptionPane.showMessageDialog(null, getValues());
			else
				JOptionPane.showMessageDialog(null,
						"Please fill the form correctly");
		}

		private String getValues() {
			String gender = "";
			if (rbMale.isSelected())
				gender = rbMale.getText();
			else if (rbFemale.isSelected())
				gender = rbFemale.getText();

			String pc = "";
			if (cbEmail.isSelected())
				pc += "Email   ";
			if (cbPhone.isSelected())
				pc += "Phone   ";

			return "Name: " + txtName.getText() + "\nGender: " + gender
					+ "\nPhone: " + txtPhone.getText() + " - "
					+ comboPhoneType.getSelectedItem() + "\nEmail: "
					+ txtEmail.getText() + "\nPreferred Contact(s): " + pc;
		}
	}

	public class KeyHandler extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			String pass1 = txtPass1.getText();
			String pass2 = String.valueOf(txtPass2.getPassword());
			// String pass2 = new String(txtPass2.getPassword());
			if (pass1.compareTo(pass2) == 0)
				lblMessage.setText("");
			else
				lblMessage.setText("Passwords must match.");
		}
	}

	public class FocusHandler implements FocusListener {
		public void focusGained(FocusEvent e) {
			if (e.getSource() == txtName
					&& txtName.getText().equals("<Enter your name here>"))
				txtName.setText("");
		}

		public void focusLost(FocusEvent e) {
			if (e.getSource() == txtName && txtName.getText().equals(""))
				txtName.setText("<Enter your name here>");
			if (e.getSource() == txtEmail)
				validateEmailRegEx();
			if (e.getSource() == txtPhone)
				validatePhone();
		}

		private void validateEmailRegEx() {
			String email = txtEmail.getText();
			if (email.matches("[a-z]{1,}[a-z0-9._]{1,}[@]{1}"
					+ "[a-z]{2,}[.]{1}[a-z]{2,}([.][a-z]{2,}){0,1}") == false)
				// ([.]{1}[a-z]{2,})+ --> 1 or more
				// ([.]{1}[a-z]{2,})* --> 0 or more
				displayError("Wrong email format.");
			else
				clearError();
		}

		private void validatePhone() {
			String phone = txtPhone.getText();
			/*
			 * if(!phone.startsWith("+90")) displayError(...);
			 */
			if (phone.matches("[+]{1}[0-9]{1,4}[0-9]{10}") == false)
				displayError("Wrong phone format.");
			else
				clearError();
		}
/*
		private void validateEmail() {
			String email = txtEmail.getText();
			int indxAt = email.indexOf("@");
			int indxDot = email.indexOf(".");
			if (email.indexOf(" ") > -1)
				displayError("Email address cannot " + "contain space.");
			else if (indxAt < 0)
				displayError("Email address must contain" + "@ sign.");
			else if (indxDot < 0)
				displayError("Email address must contain .");
			else if (indxAt < 2 || indxDot < 5)
				displayError("Wrong e-mail format.");
			else if (email.length() < 8)
				displayError("Too short.");
			else
				clearError();
		}
*/
		private void clearError() {
			lblMessage.setText("");
			isValid = true;
		}

		private void displayError(String msg) {
			lblMessage.setText(msg);
			isValid = false;
		}

	}
}


//------------------------------------------------------------


/*import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TestForm {
	public static void main(String[] args) {
		RegistrationForm myForm = new RegistrationForm();
		myForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myForm.setSize(550, 400);
		myForm.setVisible(true);
		myForm.setLocationRelativeTo(null);
	}
}
*/

