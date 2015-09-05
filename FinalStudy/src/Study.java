import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class Study extends JFrame{
	JLabel lblMouseInfo = new JLabel("Clicked or not");
	JLabel lblMouseCordinade = new JLabel("Cordinates");
	JLabel lblInfo = new JLabel("Hey");
	private JRadioButton rbMale = new JRadioButton("Male", true);
	private JRadioButton rbFemale = new JRadioButton("Female");	
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	
	
	private ButtonGroup grGender = new ButtonGroup();
	private JPanel pnlGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	public Study() {
		super("Final Study Frame");
		setLayout(new GridLayout(2,3));
		add(lblMouseInfo);
		add(lblMouseCordinade);
		add(pnlGender);
		pnlGender.add(rbMale);
		pnlGender.add(rbFemale);
		grGender.add(rbMale);
		grGender.add(rbFemale);
		add(txt1);
		add(txt2);
		add(lblInfo);
		
		
		
	mouseHandler h = new mouseHandler();
	this.addMouseListener(h);
	this.addMouseMotionListener(h);
	txt2.addKeyListener(new keyHandler());
	}
	
	
	public class mouseHandler extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e) {

			lblMouseInfo.setText("You clicked!");
		}

		@Override
		public void mouseMoved(MouseEvent e2) {
			lblMouseCordinade.setText("X: " + e2.getX() + " Y: " + e2.getY());
		}


	}

	
	public class keyHandler extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e3) {
			if(txt1.getText().equals(txt2.getText()) ) {
				lblInfo.setText("eþit");
			}
				else
					lblInfo.setText("eþit deðil");
			}
		}
	
	
	
	public static void main(String[] args) {
		Study st = new Study();
		st.setVisible(true);
		st.setSize(400, 200);
		st.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
