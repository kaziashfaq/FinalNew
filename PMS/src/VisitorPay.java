import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VisitorPay {

	private JFrame frmVisitorPayment;
	private Vector<Document> cart;
	private Vector<Document> docs;
	private RegisteredBuyer regBuy;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VisitorPay window = new VisitorPay();
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
	public VisitorPay(Vector<Document> docs, Vector<Document> cart, RegisteredBuyer regBuy) {
		this.regBuy = regBuy;
		this.docs = docs;
		this.cart = cart;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVisitorPayment = new JFrame();
		frmVisitorPayment.setTitle("Visitor Payment");
		frmVisitorPayment.getContentPane().setBackground(Color.DARK_GRAY);
		frmVisitorPayment.setBounds(100, 100, 567, 379);
		frmVisitorPayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVisitorPayment.getContentPane().setLayout(null);
		
		JLabel lblOrderDetail = new JLabel("Order detail");
		lblOrderDetail.setForeground(Color.WHITE);
		//for (int i = 0; i < cart.size(); i++) {
//			lblOrderDetail.setFont(new Font("Arial", Font.PLAIN, 16));
//			lblOrderDetail.setText("Title: " + cart.get(0).getName()+ "\n");
//			lblOrderDetail.setText("~~~~~~Price: " + cart.get(1).getPrice() +"\n");
		//	double sum += cart.get(1).getPrice();
//		}
	//	lblOrderDetail.setText("Total price: " + sum +"\n");
	
		lblOrderDetail.setBounds(72, 10, 109, 19);
		frmVisitorPayment.getContentPane().add(lblOrderDetail);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.GRAY);
		textArea.setBounds(21, 39, 199, 268);
		frmVisitorPayment.getContentPane().add(textArea);
		
		JButton btnShippingAddress = new JButton("Next step");
		btnShippingAddress.setFont(new Font("Arial", Font.PLAIN, 12));
		btnShippingAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVisitorPayment.dispose();
				Shipping sp = new Shipping();
			}
		});
		btnShippingAddress.setBounds(310, 124, 170, 54);
		frmVisitorPayment.getContentPane().add(btnShippingAddress);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVisitorPayment.dispose();
				Order mo = new Order(docs, cart,regBuy);
			}
		});
		btnReturn.setBounds(310, 223, 170, 54);
		frmVisitorPayment.getContentPane().add(btnReturn);
		frmVisitorPayment.setVisible(true);
	}
}
