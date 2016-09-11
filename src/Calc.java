import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calc {
	private JFrame frmMyFirstCalculator;
	private JTextField firstNumTextField;
	private JTextField secondNumTextField;
	private JLabel lblSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmMyFirstCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyFirstCalculator = new JFrame();
		frmMyFirstCalculator.setResizable(false);
		frmMyFirstCalculator.setTitle("Baby Calculator");
		frmMyFirstCalculator.setBounds(100, 100, 356, 255);
		frmMyFirstCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyFirstCalculator.getContentPane().setLayout(null);
		
		firstNumTextField = new JTextField();
		firstNumTextField.setBounds(50, 58, 114, 19);
		frmMyFirstCalculator.getContentPane().add(firstNumTextField);
		firstNumTextField.setColumns(10);
		
		secondNumTextField = new JTextField();
		secondNumTextField.setBounds(50, 111, 114, 19);
		frmMyFirstCalculator.getContentPane().add(secondNumTextField);
		secondNumTextField.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setBounds(50, 38, 114, 15);
		frmMyFirstCalculator.getContentPane().add(lblFirstNumber);
		
		lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(50, 95, 114, 15);
		frmMyFirstCalculator.getContentPane().add(lblSecondNumber);
		
		JLabel answerLabel = new JLabel("Answer: ");
		answerLabel.setFont(new Font("Sawasdee", Font.BOLD, 25));
		answerLabel.setBounds(50, 162, 250, 32);
		frmMyFirstCalculator.getContentPane().add(answerLabel);
	
		JButton plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double firstNumber=Double.parseDouble(firstNumTextField.getText());
					double secondNumber=Double.parseDouble(secondNumTextField.getText());
					answerLabel.setText("Answer: "+Double.toString(firstNumber+secondNumber));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(plusButton, "Sorry invalid number(s), please try again.", "Error", 0);					
					e.printStackTrace();
				}
			}
		});
		plusButton.setBounds(188, 68, 50, 25);
		frmMyFirstCalculator.getContentPane().add(plusButton);
		
		JButton minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					double firstNumber=Double.parseDouble(firstNumTextField.getText());
					double secondNumber=Double.parseDouble(secondNumTextField.getText());
					answerLabel.setText("Answer: "+Double.toString(firstNumber-secondNumber));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(plusButton, "Sorry invalid number(s), please try again.", "Error", 0);					
					e.printStackTrace();
				}
			}
		});
		minusButton.setBounds(250, 68, 50, 25);
		frmMyFirstCalculator.getContentPane().add(minusButton);
		
		JButton multiplyButton = new JButton("x");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					double firstNumber=Double.parseDouble(firstNumTextField.getText());
					double secondNumber=Double.parseDouble(secondNumTextField.getText());
					answerLabel.setText("Answer: "+Double.toString(firstNumber*secondNumber));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(plusButton, "Sorry invalid number(s), please try again.", "Error", 0);					
					e.printStackTrace();
				}
			}
		});
		multiplyButton.setBounds(188, 105, 50, 25);
		frmMyFirstCalculator.getContentPane().add(multiplyButton);
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					double firstNumber=Double.parseDouble(firstNumTextField.getText());
					double secondNumber=Double.parseDouble(secondNumTextField.getText());
					answerLabel.setText("Answer: "+Double.toString(firstNumber/secondNumber));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(plusButton, "Sorry invalid number(s), please try again.", "Error", 0);					
					e.printStackTrace();
				}				
			}
		});
		divideButton.setBounds(250, 105, 50, 25);
		frmMyFirstCalculator.getContentPane().add(divideButton);
		
		JButton modButton = new JButton("%");
		modButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					long firstNumber=Long.parseLong(firstNumTextField.getText());
					long secondNumber=Long.parseLong(secondNumTextField.getText());
					answerLabel.setText("Answer: "+Long.toString(firstNumber%secondNumber));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(plusButton, "Sorry invalid number(s), please try again.", "Error", 0);					
					e.printStackTrace();
				}
			}
		});
		modButton.setBounds(219, 33, 50, 25);
		frmMyFirstCalculator.getContentPane().add(modButton);
		
	}
}
