import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MOrder {

	private JFrame frmMemberShoppingCart;

	/**
	 * Launch the application.
	 */

	private int orderId;
	private Vector<Document> cart;
	private Vector<Document> docs;
	private Payment payment;
	private DefaultListModel<String> lister;
	private RegisteredBuyer regBuy;
	private String docName;
	private JList<String> list;
	private JList<String> list_1;
	
	

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Order window = new Order();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 * @param cart 
	 * @param docs 
	 */
	public MOrder(Vector<Document> docs,Vector<Document> cart, RegisteredBuyer regBuy) {
		this.regBuy = regBuy;
		this.cart = cart;
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMemberShoppingCart = new JFrame();
		frmMemberShoppingCart.setTitle("Member shopping cart");
		frmMemberShoppingCart.getContentPane().setBackground(Color.GRAY);
		frmMemberShoppingCart.setBounds(100, 100, 591, 561);
		frmMemberShoppingCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMemberShoppingCart.getContentPane().setLayout(null);
		
		lister = new DefaultListModel();
		list = new JList<>(lister);
		list.setBounds(21, 56, 285, 410);
		list.setFont(new Font("Serif", Font.BOLD, 13));
		list.setForeground(Color.WHITE);
		list.setBackground(Color.DARK_GRAY);
		list.addListSelectionListener(new DocListener());
		frmMemberShoppingCart.getContentPane().add(list);
		display();
		
		JLabel lblShoppingCart = new JLabel("Shopping cart");
		lblShoppingCart.setForeground(Color.WHITE);
		lblShoppingCart.setFont(new Font("Arial", Font.PLAIN, 16));
		lblShoppingCart.setBounds(20, 10, 123, 25);
		frmMemberShoppingCart.getContentPane().add(lblShoppingCart);
		
		JButton btnAddItem = new JButton("Add item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the document's name?");
				for(int i = 0; i < docs.size(); i++) {
					Document doc = docs.get(i);
					if(doc.getName().equals(name)){
						JOptionPane.showMessageDialog(null, "Title: " + doc.getName() + "\n" + "Author Name: " + doc.getAutName() + "\n" + "Publish Date: " + doc.getDate() + "\n" + "Price: " + doc.getPrice() + "\n");
						add(doc);
					}
				}
			}
		});
		btnAddItem.setBounds(391, 100, 117, 31);
		frmMemberShoppingCart.getContentPane().add(btnAddItem);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < cart.size();i++){
					if(cart.get(i).getName().equals(docName)){
						remove(docName);
					}
				}
			}
		});
		btnRemove.setBounds(391, 176, 117, 31);
		frmMemberShoppingCart.getContentPane().add(btnRemove);
		
		JButton btnPlaceOrder = new JButton("Place order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMemberShoppingCart.dispose();
				MemberPay mp = new MemberPay(docs, cart, regBuy);
			}
		});
		btnPlaceOrder.setBounds(391, 254, 117, 31);
		frmMemberShoppingCart.getContentPane().add(btnPlaceOrder);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMemberShoppingCart.dispose();
				Member me = new Member(docs,cart, regBuy);
				
			}
		});
		btnNewButton.setBounds(391, 326, 117, 31);
		frmMemberShoppingCart.getContentPane().add(btnNewButton);
		frmMemberShoppingCart.setVisible(true);
	}


	public void makePayment(){
		
	}
	public void add(Document doc){
			cart.add(doc);
	}
	
	public void remove(String name){
		for(int i = 0; i < docs.size();i++){
			if(cart.get(i).getName().equals(name)){
				cart.remove(docs.get(i));
				JOptionPane.showMessageDialog(null, "Successfully Removed");
				display();
			}
		}
	}
	
	private void display() {
		lister.removeAllElements();
//		for(int i = 0; i < cart.size();i++){
//			lister.addElement(cart.get(i).getName());
//		}
	}
	
	class DocListener implements ListSelectionListener{

		public void valueChanged(ListSelectionEvent arg0) {
			// TODO Auto-generated method stub

			docName = list.getSelectedValue();
		}

	}
}
