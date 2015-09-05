import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FindNumber extends JFrame implements ActionListener{
	private JTextField txtInput, txtRetNum, txtRetIndex, txtOutput;
	private JButton btnCheck, btnRetrieveValue, btnRetrieveIndex;
	private int num = 0;
	private int numbers[] = new int[10];
	private String result;

	public FindNumber() {
		super("Array Access");
		setLayout(new GridLayout(4, 3));
		txtInput = new JTextField(10);
		btnCheck = new JButton("CHECK");
		btnCheck.addActionListener(this);
		txtRetNum = new JTextField(5);
		btnRetrieveValue = new JButton("RETRIEVE VALUE");
		btnRetrieveValue.addActionListener(this);
		txtRetIndex = new JTextField(10);
		btnRetrieveIndex = new JButton("RETRIEVE INDEX");
		btnRetrieveIndex.addActionListener(this);
		txtOutput = new JTextField();
		txtOutput.setEditable(false);

		add(new JLabel("Array elements (Split by - ):"));
		add(txtInput);
		add(btnCheck);
		add(new JLabel("Number to retrieve: "));
		add(txtRetNum);
		add(btnRetrieveValue);
		add(new JLabel("Index to retrieve:"));
		add(txtRetIndex);
		add(btnRetrieveIndex);
		add(new JLabel("Result"));
		add(txtOutput);
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnCheck)
		{
			try{
				String s = txtInput.getText();
				String[] splitted = s.split("-");
				for (int i = 0; i < splitted.length; i++) {
					numbers[i] = Integer.parseInt(splitted[i]);
				}
				JOptionPane.showMessageDialog(null, "Correct input", "Done", JOptionPane.INFORMATION_MESSAGE);
			}

			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, ex + "\nYou must enter numbers","Invalid Input", JOptionPane.ERROR_MESSAGE);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				JOptionPane.showMessageDialog(null, ex + "\nYou cannot enter more than 10 elements.", "Out of Bounds", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (e.getSource() == btnRetrieveValue) {
			try {
				num = Integer.parseInt(txtRetNum.getText());
				boolean flag = false;
				result = num + " is in the fields of the array: ";

				for (int i = 0; i < numbers.length; i++) {
					if (num == numbers[i]) {
						result += i + " ";
						flag = true;
					}
				}
				txtOutput.setText(result);
				if (flag == false)
					throw new NumberFormatException();	
			} catch (NumberFormatException formatException) {
				JOptionPane.showMessageDialog(null,
						"Number does not exist in the array", "Invalid Input",
						JOptionPane.ERROR_MESSAGE);
				txtOutput.setText("");
			}
			txtRetNum.setText("");
		}

		else if (e.getSource() == btnRetrieveIndex) {
			try {
				num = Integer.parseInt(txtRetIndex.getText());

				if (num >= numbers.length || num < 0)
					throw new ArrayIndexOutOfBoundsException("Index Not Found.");

				txtOutput.setText("The number at index " + num + " is " + numbers[num]);
			} // end try
			catch (NumberFormatException formatException) {
				JOptionPane.showMessageDialog(null,
						"Array indices must be integer values",
						"Invalid Input", JOptionPane.ERROR_MESSAGE);
			} // end catch
			catch (ArrayIndexOutOfBoundsException outOfBounds) {
				JOptionPane.showMessageDialog(null, outOfBounds.getMessage(),
						"Index Out of Bounds", JOptionPane.ERROR_MESSAGE);

			}
		}
	}

	public static void main(String[] args) {
		FindNumber f = new FindNumber();
		f.setSize(600, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

