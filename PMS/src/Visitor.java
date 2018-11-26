import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Visitor {

	private JFrame frmVistor;
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
		frmVistor = new JFrame();
		frmVistor.setTitle("Vistor");
		frmVistor.setBounds(100, 100, 450, 300);
		frmVistor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVistor.getContentPane().setLayout(null);
		
		JLabel lblHelloVistor = new JLabel("Hello, Vistor");
		lblHelloVistor.setBounds(163, 21, 113, 15);
		frmVistor.getContentPane().add(lblHelloVistor);
		
		JButton btnSearchForA = new JButton("Search for a document");
		btnSearchForA.setBounds(133, 58, 159, 42);
		frmVistor.getContentPane().add(btnSearchForA);
		
		JButton btnMakeAPayment = new JButton("Make a payment");
		btnMakeAPayment.setBounds(133, 126, 159, 42);
		frmVistor.getContentPane().add(btnMakeAPayment);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(133, 187, 159, 42);
		frmVistor.getContentPane().add(btnRegister);
	}

}
