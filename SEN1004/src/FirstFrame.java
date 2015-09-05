import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstFrame extends JFrame{
	//components
	JLabel lblName = new JLabel("Name: ");
	JTextField txtName = new JTextField();
	JPasswordField txtPass = new JPasswordField();
	JRadioButton rdFemale = new JRadioButton("Female", true);
	JRadioButton rdMale = new JRadioButton("Male");
	JCheckBox chkBreakfast = new JCheckBox("Breakfast"), 
			chkLunch = new JCheckBox("Lunch"),
			chkDinner = new JCheckBox("Dinner");
	JButton btnCancel = new JButton("CANCEL"), 
			btnEnter = new JButton("ENTER");
	String[] countries = {"---SELECT---", "TURKEY", "USA", "ENGLAND", "AUSTRIA"};
	JComboBox cmbCountries = new JComboBox(countries);
	
	public FirstFrame(String name)
	{
		super();
		txtName.setText(name);
		setTitle("My First Frame!");
		setLayout(new GridLayout(6,2));
		add(lblName);
		add(txtName);
		add(new JLabel("Password:"));
		add(txtPass);
		add(new JLabel("Gender:"));
		//add(rdMale);
		//add(rdFemale);
		JPanel pnlGender = new JPanel(new FlowLayout());
		pnlGender.add(rdMale);
		pnlGender.add(rdFemale);
		add(pnlGender);
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdFemale);
		btnGroup.add(rdMale);
		add(new JLabel("Meal Type:"));
		JPanel pnlMeal = new JPanel(new FlowLayout());
		pnlMeal.add(chkBreakfast);
		pnlMeal.add(chkLunch);
		pnlMeal.add(chkDinner);
		add(pnlMeal);
		add(new JLabel("Country:"));
		add(cmbCountries);
		add(btnCancel);
		add(btnEnter);
		
		handler myHandler = new handler();
		btnCancel.addActionListener(myHandler);
		btnEnter.addActionListener(myHandler);
	}
	
	class handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCancel)
			{
				txtPass.setText("");
				rdMale.setSelected(false);
				rdFemale.setSelected(true);
				cmbCountries.setSelectedIndex(0);
				chkBreakfast.setSelected(false);
				chkDinner.setSelected(false);
				chkDinner.setSelected(false);
			}
			if(e.getSource()==btnEnter)
				JOptionPane.showMessageDialog(null, "Information saved for " + txtName.getText() + ".");
		}	
	}
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Welcome " + name);
		FirstFrame frame = new FirstFrame(name);
		frame.setVisible(true);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
