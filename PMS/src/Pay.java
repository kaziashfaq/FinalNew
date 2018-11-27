import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pay {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Pay window = new Pay();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Pay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 572, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Visa");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(174, 23, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMaster = new JRadioButton("Master");
		rdbtnMaster.setBackground(Color.LIGHT_GRAY);
		rdbtnMaster.setBounds(174, 48, 121, 23);
		frame.getContentPane().add(rdbtnMaster);
		
		JLabel lblSelectCardType = new JLabel("Select Card Type");
		lblSelectCardType.setForeground(Color.WHITE);
		lblSelectCardType.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSelectCardType.setBounds(30, 23, 171, 42);
		frame.getContentPane().add(lblSelectCardType);
		
		JLabel lblCardNumber = new JLabel("Holder Name");
		lblCardNumber.setForeground(Color.WHITE);
		lblCardNumber.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCardNumber.setBounds(30, 94, 111, 32);
		frame.getContentPane().add(lblCardNumber);
		
		textField = new JTextField();
		textField.setBounds(174, 100, 222, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 138, 222, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCardNumber_1 = new JLabel("Card Number");
		lblCardNumber_1.setForeground(Color.WHITE);
		lblCardNumber_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCardNumber_1.setBounds(30, 136, 111, 23);
		frame.getContentPane().add(lblCardNumber_1);
		
		JLabel lblExperiDate = new JLabel("Expired Date");
		lblExperiDate.setForeground(Color.WHITE);
		lblExperiDate.setFont(new Font("Arial", Font.PLAIN, 16));
		lblExperiDate.setBounds(30, 180, 108, 32);
		frame.getContentPane().add(lblExperiDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 185, 32, 25);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(226, 185, 32, 25);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		label.setForeground(Color.WHITE);
		label.setBounds(216, 189, 54, 15);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Security Number");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 222, 142, 42);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(174, 240, 66, 23);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Finish");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(288, 294, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Shipping sp = new Shipping();
			}
		});
		btnReturn.setBounds(428, 294, 93, 23);
		frame.getContentPane().add(btnReturn);
		frame.setVisible(true);
	}
}
