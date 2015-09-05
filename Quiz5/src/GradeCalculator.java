import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GradeCalculator extends JFrame implements ActionListener  {
	
	private JLabel lblInfo = new JLabel("Please enter number of students");

	private JTextField txtNumberOfStudents = new JTextField(10);

	private JButton btnSubmit = new JButton("Submit");


	public GradeCalculator() {
		super("Grade Calculator");
		setLayout(new FlowLayout());
		add(lblInfo);
		add(txtNumberOfStudents);
		add(btnSubmit);
		btnSubmit.addActionListener(this);
	}


	public static void main(String[] args) {
		GradeCalculator gc = new GradeCalculator();
		gc.setLocationRelativeTo(null);
		GradeCalculator inputBox = new GradeCalculator();
		gc.setVisible(true);
		gc.setSize(250,100);
		gc.setDefaultCloseOperation(EXIT_ON_CLOSE);	

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnSubmit){
			try {
			int size = Integer.parseInt(txtNumberOfStudents.getText());
			int[] students = new int[size];
			double grade = 0;
			for (int i = 1; i <= size; i++) {
				String g = JOptionPane.showInputDialog(null,"Enter grade", grade);
				grade += Double.parseDouble(g);
				
			}
			
			double average = grade/size;
			
			JOptionPane.showMessageDialog(null,"Result: " + average);
			}
			catch (NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, ex.getMessage() + "\nYou must enter numbers","Invalid Input", JOptionPane.ERROR_MESSAGE);
				
			}


		}

			
	}


	

}
