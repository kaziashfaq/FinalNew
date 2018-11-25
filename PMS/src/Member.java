import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class Member {

	private JFrame frmMember;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member window = new Member();
					window.frmMember.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Member() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMember = new JFrame();
		frmMember.setTitle("Member");
		frmMember.getContentPane().setEnabled(false);
		frmMember.setBounds(100, 100, 450, 300);
		frmMember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMember.getContentPane().setLayout(null);
		
		JButton btnSearchForA = new JButton("Search for a document");
		btnSearchForA.setBounds(128, 52, 159, 42);
		btnSearchForA.setHorizontalAlignment(SwingConstants.TRAILING);
		btnSearchForA.setBackground(Color.WHITE);
		frmMember.getContentPane().add(btnSearchForA);
		
		JButton btnMakeAPayment = new JButton("Make a payment");
		btnMakeAPayment.setBounds(128, 116, 159, 42);
		frmMember.getContentPane().add(btnMakeAPayment);
		
		JButton btnUns = new JButton("Unsubscribe");
		btnUns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUns.setBounds(128, 180, 159, 42);
		frmMember.getContentPane().add(btnUns);
		
		JLabel lblHelloMember = new JLabel("Hello, Member");
		lblHelloMember.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHelloMember.setBounds(164, 10, 110, 32);
		frmMember.getContentPane().add(lblHelloMember);
	}
}
