
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class Frame extends JFrame {


	JLabel lblName = new JLabel("Name : ");
	JLabel lblPassword = new JLabel("Password : ");
	JLabel lblGender = new JLabel("Gender : ");
	JLabel lblFaculty = new JLabel("Faculty : ");
	JLabel lblScholarShip = new JLabel("Scholarship");
	JLabel lblSpace = new JLabel("");
	
	JTextField txtName = new JTextField("");
	JPasswordField txtPassword = new JPasswordField("");
	
	JRadioButton rbMale = new JRadioButton("Male",true);
	JRadioButton rbFemale = new JRadioButton("Female");
	
	String[] faculties = {"---Select---","Muhendislik","Fen Bilimleri","Ýktisat"};
	JComboBox cmbFaculty = new JComboBox(faculties);
	
	JRadioButton rb100 = new JRadioButton("100");
	JRadioButton rb50 = new JRadioButton("50");
	JRadioButton rb0 = new JRadioButton("0");

	
	JButton btnApply = new JButton("APPLY");
	
	public Frame(){
		
		super();
		setTitle("My First Frame");
		setLayout(new GridLayout(6,2));
		
		add(lblName);
		add(txtName);
		add(lblPassword);
		add(txtPassword);
		
		add(lblGender);
		JPanel pnlGender = new JPanel(new GridLayout(1,2));
		pnlGender.add(rbMale);
		pnlGender.add(rbFemale);
		add(pnlGender);
		ButtonGroup btnGenderGroup = new ButtonGroup();
		btnGenderGroup.add(rbMale);
		btnGenderGroup.add(rbFemale);
		
		
		
		add(lblFaculty);
		add(cmbFaculty);
		
		add(lblScholarShip);
		JPanel pnlScholarShip = new JPanel(new GridLayout(1,3));
		pnlScholarShip.add(rb100);
		pnlScholarShip.add(rb50);
		pnlScholarShip.add(rb0);
		add(pnlScholarShip);
		ButtonGroup btnScholarShipGroup = new ButtonGroup();
		btnScholarShipGroup.add(rb100);
		btnScholarShipGroup.add(rb50);
		btnScholarShipGroup.add(rb0);
		
		add(lblSpace);
		add(btnApply);
		
	}
	public static void main(String[] args){
		
		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
