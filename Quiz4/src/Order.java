import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Order extends JFrame {

	JLabel lblName = new JLabel("Name : ");
	JLabel lblSurname = new JLabel("Surname : ");
	JLabel lblDate = new JLabel("Date : ");
	JLabel lblType = new JLabel("Type : ");
	JLabel lblCookLevel = new JLabel("CookLevel : ");
	JLabel lblExtraIngredients = new JLabel("ExtraIngredints");
	JLabel lblSpace = new JLabel();
	
	JTextField txtName = new JTextField("");
	JTextField txtSurname = new JTextField("");
	
	String[] days = {"---Select---","1","15","31"};
	JComboBox cmbDays = new JComboBox(days);
	
	String[] months = {"---Select---","1","3","12"};
	JComboBox cmbMonths = new JComboBox(months);
	
	String[] years = {"---Select---","1993","2000","2015"};
	JComboBox cmbYears = new JComboBox(years);
	
	JRadioButton rbRegular = new JRadioButton("Regular");
	JRadioButton rbChilli = new JRadioButton("Chilli");
	
	JRadioButton rbRare = new JRadioButton("Rare");
	JRadioButton rbMedium = new JRadioButton("Medium");
	JRadioButton rbWellDone = new JRadioButton("WellDone");
	
	JCheckBox chkCheddar = new JCheckBox("Cheddar");
	JCheckBox chkOnion = new JCheckBox("Onion");
	JCheckBox chkLettuce = new JCheckBox("Lettuce");
	JCheckBox chkTomato = new JCheckBox("Tomato");
	
	JButton btnOrder = new JButton("ORDER");
	
public Order(){
		super();
		setTitle("ORDER BURGER");
		setLayout(new GridLayout(7,2));
		
		add(lblName);
		add(txtName);
		
		add(lblSurname);
		add(txtSurname);
		
		add(lblDate);
		JPanel pnlDate = new JPanel(new GridLayout(1,3));
		pnlDate.add(cmbDays);
		pnlDate.add(cmbMonths);
		pnlDate.add(cmbYears);
		add(pnlDate);
		
		
		add(lblType);
		JPanel pnlType = new JPanel(new GridLayout(1,2));
		pnlType.add(rbRegular);
		pnlType.add(rbChilli);
		add(pnlType);
		ButtonGroup btnTypeGroup = new ButtonGroup();
		btnTypeGroup.add(rbRegular);
		btnTypeGroup.add(rbChilli);
		
		add(lblCookLevel);
		JPanel pnlCookLevel = new JPanel(new GridLayout(1,3));
		pnlCookLevel.add(rbRare);
		pnlCookLevel.add(rbMedium);
		pnlCookLevel.add(rbWellDone);
		add(pnlCookLevel);
		ButtonGroup btnCookGroup = new ButtonGroup();
		btnCookGroup.add(rbRare);
		btnCookGroup.add(rbMedium);
		btnCookGroup.add(rbWellDone);
		
		add(lblExtraIngredients);
		JPanel pnlExtraIngredients = new JPanel(new FlowLayout());
		pnlExtraIngredients.add(chkCheddar);
		pnlExtraIngredients.add(chkOnion);
		pnlExtraIngredients.add(chkLettuce);
		pnlExtraIngredients.add(chkTomato);
		add(pnlExtraIngredients);
		
		add(lblSpace);
		add(btnOrder);
		
		Handler h = new Handler();
		btnOrder.addActionListener(h);
		
}
public static void main(String[] args){
	
	Order frame = new Order();
	frame.setVisible(true);
	frame.setSize(600,300);
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
}
class Handler implements ActionListener{
	@Override
public void actionPerformed(ActionEvent e) {

				
				int price=20;
				
				String typeSelected;
				
				if(rbRegular.isSelected())
				{
					typeSelected = rbRegular.getText();
					price+=2;
				}
				else if (rbChilli.isSelected())
				{
					typeSelected = rbChilli.getText();
					price+=2;
				}
				else
				{
					typeSelected = "Noting Selected";
				}
				
				
				String levelSelected;
				if(rbRare.isSelected())
				{
					levelSelected = rbRare.getText();
					price+=2;
				}
				else if(rbMedium.isSelected())
				{
					levelSelected = rbMedium.getText();
					price+=2;
				}
				else if(rbWellDone.isSelected())
				{
					levelSelected = rbWellDone.getText();
					price+=2;
				}
				else
				{
					levelSelected = "Noting Selected";
				}
				
				String extraSelected="";
				if(chkCheddar.isSelected())
				{
					extraSelected += " "+ chkCheddar.getText();
					price+=2;
				}
				if(chkOnion.isSelected())
				{
					extraSelected += " " + chkOnion.getText();
					price+=2;
				}
				if(chkLettuce.isSelected())
				{
					extraSelected += " "+  chkLettuce.getText();
					price+=2;
				}
				if(chkTomato.isSelected())
				{
					extraSelected += " "+  chkTomato.getText();
					price+=2;
				}
				
				
				
				if(e.getSource() == btnOrder)
				{
					
					JOptionPane.showMessageDialog(null, "Receipt:\n"+"Name Surname: "+txtName.getText()+" "+txtSurname.getText()+
							"\nDate: "+cmbDays.getSelectedItem()+
							"."+cmbMonths.getSelectedItem()+"."+cmbYears.getSelectedItem()+
							"\nType: "+typeSelected+"\nCook Level: "+levelSelected+"" +
									"\nExtras: "+extraSelected+"\nTotal Price: "+price);
				}
				
			}
			
		}
		
	
		
}


