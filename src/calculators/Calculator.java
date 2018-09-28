package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;


public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 256, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 218, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//--------------Row 1-------------
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBackspace.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPercentage.setBounds(122, 54, 50, 50);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//--------------Row 2-------------------
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtract.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnSubtract);
		
		//----------------Row 3------------------------
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		//----------------Row 4------------------------
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 222, 50, 50);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(66, 222, 50, 50);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(122, 222, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(178, 222, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		//----------------Row 5------------------------
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+"){
					result = firstnum + secondnum;
					answer = String.valueOf(result);
					textField.setText(answer);				
				}
				else if (operations == "-"){
					result = firstnum - secondnum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				else if (operations == "*"){
					result = firstnum * secondnum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				else if (operations == "/"){
					result = firstnum / secondnum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				else if (operations == "%"){
					result = firstnum % secondnum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(178, 278, 50, 50);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops =ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(122, 278, 50, 50);
		frame.getContentPane().add(btnPM);
		
		final JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) {
					textField.setText(textField.getText() + btnDecimal.getText()); 
				}
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDecimal.setBounds(66, 278, 50, 50);
		frame.getContentPane().add(btnDecimal);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 278, 50, 50);
		frame.getContentPane().add(btn0);
		
		
		
	}
}


// I got this code from DJ Oamen on YouTube from his Java Calculator Project