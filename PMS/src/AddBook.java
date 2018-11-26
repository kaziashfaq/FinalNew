import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AddBook {

	private JFrame frmAddBook;
	private Vector<Document> docs;
	private JTextField bkName;
	private JTextField aName;
	private JTextField isbnNum;
	private JTextField publisher;
	private JTextField date;
	private JTextField docPrice;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddBook window = new AddBook();
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
	public AddBook(Vector<Document> docs) {
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddBook = new JFrame();
		frmAddBook.getContentPane().setBackground(Color.DARK_GRAY);
		frmAddBook.setTitle("Add Book");
		frmAddBook.setBounds(100, 100, 538, 370);
		frmAddBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddBook.getContentPane().setLayout(null);
		
		JLabel bName = new JLabel("Book Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(45, 42, 94, 14);
		frmAddBook.getContentPane().add(bName);
		
		JLabel autName = new JLabel("Author Name");
		autName.setForeground(Color.WHITE);
		autName.setFont(new Font("Tahoma", Font.BOLD, 14));
		autName.setBounds(45, 79, 115, 14);
		frmAddBook.getContentPane().add(autName);
		
		JLabel isbn = new JLabel("ISBN");
		isbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		isbn.setForeground(Color.WHITE);
		isbn.setBounds(47, 112, 46, 14);
		frmAddBook.getContentPane().add(isbn);
		
		JLabel pubName = new JLabel("Publisher Name");
		pubName.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubName.setForeground(Color.WHITE);
		pubName.setBounds(45, 143, 115, 14);
		frmAddBook.getContentPane().add(pubName);
		
		JLabel pubDate = new JLabel("Publish Date");
		pubDate.setForeground(Color.WHITE);
		pubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubDate.setBounds(45, 176, 104, 14);
		frmAddBook.getContentPane().add(pubDate);
		
		bkName = new JTextField();
		bkName.setBounds(164, 41, 200, 20);
		frmAddBook.getContentPane().add(bkName);
		bkName.setColumns(10);
		
		aName = new JTextField();
		aName.setBounds(164, 78, 200, 20);
		frmAddBook.getContentPane().add(aName);
		aName.setColumns(10);
		
		isbnNum = new JTextField();
		isbnNum.setBounds(164, 111, 200, 20);
		frmAddBook.getContentPane().add(isbnNum);
		isbnNum.setColumns(10);
		
		publisher = new JTextField();
		publisher.setBounds(164, 142, 200, 20);
		frmAddBook.getContentPane().add(publisher);
		publisher.setColumns(10);
		
		date = new JTextField();
		date.setBounds(164, 175, 200, 20);
		frmAddBook.getContentPane().add(date);
		date.setColumns(10);
		
		docPrice = new JTextField();
		docPrice.setBounds(164, 207, 200, 20);
		frmAddBook.getContentPane().add(docPrice);
		docPrice.setColumns(10);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = bkName.getText();
				String author = aName.getText();
				String pDate = date.getText();
				int num = Integer.parseInt((isbnNum.getText()));
				String pubN= publisher.getText();
				int price = Integer.parseInt((docPrice.getText()));
				Book b = new Book(name, author,pDate,price,num,pubN);
				docs.add(b);
				JOptionPane.showMessageDialog(null, "Successfully Added");
				
			}
		});
		add.setBounds(280, 254, 89, 23);
		frmAddBook.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddBook.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(181, 254, 89, 23);
		frmAddBook.getContentPane().add(back);
		
		JLabel price = DefaultComponentFactory.getInstance().createLabel("Price");
		price.setFont(new Font("Tahoma", Font.BOLD, 14));
		price.setForeground(Color.WHITE);
		price.setBounds(47, 208, 92, 14);
		frmAddBook.getContentPane().add(price);
		
		
		frmAddBook.setVisible(true);
	}
}
