import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Visitor {

	private JFrame frmVisitor;
	private Vector<Document> docs;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Vistor window = new Vistor();
//					window.frmVistor.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	
	/**
	 * Create the application.
	 */
	public Visitor(Vector<Document> docs) {
		
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVisitor = new JFrame();
		frmVisitor.getContentPane().setBackground(Color.DARK_GRAY);
		frmVisitor.setTitle("Member");
		frmVisitor.getContentPane().setEnabled(false);
		frmVisitor.setBounds(100, 100, 504, 357);
		frmVisitor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVisitor.getContentPane().setLayout(null);
		frmVisitor.setVisible(true);
		
		JLabel lblHelloVistor = new JLabel("Hello, Vistor");
		lblHelloVistor.setForeground(Color.WHITE);
		lblHelloVistor.setBounds(196, 21, 113, 15);
		frmVisitor.getContentPane().add(lblHelloVistor);
		
		JButton btnSearchForA = new JButton("Search for a document");
		btnSearchForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVisitor.dispose();
				VisitorSearch vs = new VisitorSearch(docs);
				
			}
		});
		btnSearchForA.setBounds(250, 56, 170, 32);
		frmVisitor.getContentPane().add(btnSearchForA);
		
		JButton btnMakeAPayment = new JButton("Make a payment");
		btnMakeAPayment.setBounds(250, 112, 170, 32);
		frmVisitor.getContentPane().add(btnMakeAPayment);
		
		JButton btnRegister = new JButton("Register");
		
		btnRegister.setBounds(250, 165, 170, 32);
		frmVisitor.getContentPane().add(btnRegister);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVisitor.dispose();
				Management ma = new Management(docs);
				
			}
		});
		btnNewButton.setBounds(250, 220, 170, 32);
		frmVisitor.getContentPane().add(btnNewButton);
	}

}
