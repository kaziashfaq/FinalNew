import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Member {

	private JFrame frmMember;
	private Vector<Document> docs;
	private RegisteredBuyer regBuy;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Member window = new Member();
//					window.frmMember.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Member(Vector<Document> docs, RegisteredBuyer rb) {
		regBuy = rb;
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMember = new JFrame();
		frmMember.getContentPane().setBackground(Color.DARK_GRAY);
		frmMember.setTitle("Member");
		frmMember.getContentPane().setEnabled(false);
		frmMember.setBounds(100, 100, 588, 406);
		frmMember.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMember.getContentPane().setLayout(null);
		frmMember.setVisible(true);
		JButton btnSearchForA = new JButton("Search for a document");
		btnSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = JOptionPane.showInputDialog("What is the document type?(Book, Journal, Magazine)");
				
			}
		});
		btnSearchForA.setBounds(349, 59, 159, 23);
		btnSearchForA.setHorizontalAlignment(SwingConstants.TRAILING);

		frmMember.getContentPane().add(btnSearchForA);
		
		JButton btnMakeAPayment = new JButton("Make a payment");
		btnMakeAPayment.setBounds(349, 93, 159, 23);
		frmMember.getContentPane().add(btnMakeAPayment);
		
		JButton btnUns = new JButton("Unsubscribe");
		btnUns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUns.setBounds(349, 127, 159, 23);
		frmMember.getContentPane().add(btnUns);
		
		JLabel name = new JLabel("Hello, " + regBuy.getName());
		name.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		name.setForeground(Color.WHITE);
		name.setBounds(433, 11, 129, 14);
		frmMember.getContentPane().add(name);
	}
}
